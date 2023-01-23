package com.turreta.learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class PersonService {

    @Autowired
    private PetDao petDao;

    @Autowired
    private CarDao carDao;

    @Autowired
    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public String toString() {
        return "In PersonService";
    }

    @PostConstruct
    public void init() {
        System.out.println("In PersonService @PostConstruct init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("In PersonService @PreDestroy destroy");
    }
}
