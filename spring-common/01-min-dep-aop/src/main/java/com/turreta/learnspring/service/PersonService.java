package com.turreta.learnspring.service;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public void createPersonForAOPBefore() {
        System.out.println("--- createPersonForAOPBefore");
    }
    public void createPersonForAOPAfterReturning() {
        System.out.println("--- createPersonForAOPAfterReturning");
    }
    public void createPersonForAOPAfterThrowing() {
        throw new RuntimeException("Test Exception from createPersonForAOPAfterThrowing");
    }
    public void createPersonForAOPAfterFinallyA() {
        System.out.println("--- createPersonForAOPAfterFinallyA");
    }
    public void createPersonForAOPAfterFinallyB() {
        System.out.println("--- createPersonForAOPAfterFinallyB");
        throw new RuntimeException("Test Exception from createPersonForAOPAfterFinallyB");
    }

    public void createPersonForAOPAround() {
        System.out.println("--- createPersonForAOPAround");
    }
}
