package com.turreta.learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class BareMinimumIoCApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Service service = context.getBean(Service.class);
        System.out.println(service);
        System.out.println(service.getDao());

        PersonService personService = context.getBean(PersonService.class);
        System.out.println(personService);
        System.out.println(personService.getPersonDao());


    }

}
