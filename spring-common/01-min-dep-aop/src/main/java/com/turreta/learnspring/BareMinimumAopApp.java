package com.turreta.learnspring;

import com.turreta.learnspring.service.AnotherService;
import com.turreta.learnspring.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BareMinimumAopApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        PersonService personService = context.getBean(PersonService.class);
//        personService.createPerson();
//        personService.createPerson();
        AnotherService personService = context.getBean(AnotherService.class);
        personService.t();

        System.out.println("karl");
    }
}
