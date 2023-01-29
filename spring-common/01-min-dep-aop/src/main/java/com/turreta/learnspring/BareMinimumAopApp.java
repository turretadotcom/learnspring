package com.turreta.learnspring;

import com.turreta.learnspring.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class BareMinimumAopApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AbstractApplicationContext abstractApplicationContext = (AbstractApplicationContext) context;
        abstractApplicationContext.registerShutdownHook();

        PersonService personService = context.getBean(PersonService.class);

        personService.createPersonForAOPBefore();
        personService.createPersonForAOPAfterReturning();

        try {
            personService.createPersonForAOPAfterThrowing();
        } catch (Throwable e )
        {
            // Ignore exception
            System.out.println("--- ### " + e.getMessage());
        }
        personService.createPersonForAOPAfterFinallyA();

        try {
            personService.createPersonForAOPAfterFinallyB();
        } catch (Throwable e )
        {
            // Ignore exception
            System.out.println("--- ### " + e.getMessage());
        }

        System.out.println("\n\nPowered by Turreta");
    }
}
