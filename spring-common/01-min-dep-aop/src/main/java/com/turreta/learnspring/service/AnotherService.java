package com.turreta.learnspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnotherService {
    @Autowired
    private PersonService personService;

    public void t() {
        personService.createPerson();
    }
}
