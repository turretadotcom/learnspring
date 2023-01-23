package com.turreta.learnspring;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class PersonDao {


    @Override
    public String toString() {
        return "In PersonDao";
    }

    @PostConstruct
    public void init() {
        System.out.println("In PersonDao @PostConstruct init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("In PersonDao @PreDestroy destroy");
    }
}
