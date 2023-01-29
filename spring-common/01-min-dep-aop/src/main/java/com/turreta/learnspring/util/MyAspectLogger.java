package com.turreta.learnspring.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Aspect
@Component
public class MyAspectLogger {

    @PostConstruct
    public void t() {
        System.out.println("AOP up");
    }

    @Before("execution(public com.turreta.learnspring.service.PersonService.* *(..))")
//    @Before("execution(public com.turreta.learnspring.service.PersonService createPerson(..))")
    public void beforeCreatePerson(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("methodName:" + methodName);
    }
}
