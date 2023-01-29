package com.turreta.learnspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class PersonService {

//    @PostConstruct
//    public void init() {
//        createPerson();
//    }
    public void createPerson() {}

    public void updatePerson() {
        throw new RuntimeException("Error while updating Person");
    }

    public void deletePerson() {

    }


}
