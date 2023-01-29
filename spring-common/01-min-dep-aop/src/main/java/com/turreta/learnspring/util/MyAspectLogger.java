package com.turreta.learnspring.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Aspect
@Component
public class MyAspectLogger {

    @PostConstruct
    public void postConstruct() {
        System.out.println("AOP MyAspectLogger is up!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("AOP MyAspectLogger is shutting down!");
    }

    @Before("execution(public void com.turreta.learnspring.service.*.createPersonForAOPBefore(..))")
    public void beforeCreatePerson(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[@Before] methodName:" + methodName);
    }


    @AfterReturning("execution(public void com.turreta.learnspring.service.*.createPersonForAOPAfterReturning(..))")
    public void afterReturningCreatePerson(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[@AfterReturning] methodName:" + methodName);
    }

    @AfterThrowing("execution(public void com.turreta.learnspring.service.*.createPersonForAOPAfterThrowing(..))")
    public void afterThrowingCreatePerson(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[@AfterThrowing] methodName:" + methodName);
    }

    @After("execution(public void com.turreta.learnspring.service.*.createPersonForAOPAfterFinallyA(..))")
    public void afterFinallyACreatePerson(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[@After - A] methodName:" + methodName);
    }

    @After("execution(public void com.turreta.learnspring.service.*.createPersonForAOPAfterFinallyB(..))")
    public void afterFinallyBCreatePerson(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[@After - B] methodName:" + methodName);
    }

}
