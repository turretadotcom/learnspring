package com.turreta.learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;


public class BareMinimumIoCApplication {
    public static void main(String[] args) {

        // AbstractApplicationContext has the registerShutdownHook which enables Spring to call the DisposableBean#destroy
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.registerShutdownHook();
        Service service = context.getBean(Service.class);
        System.out.println(service);
        System.out.println(service.getDao());

        PersonService personService = context.getBean(PersonService.class);
        System.out.println(personService);
        System.out.println(personService.getPersonDao());


    }

}
