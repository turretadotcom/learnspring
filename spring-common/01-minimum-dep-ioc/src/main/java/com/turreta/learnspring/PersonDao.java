package com.turreta.learnspring;

import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {
    @Override
    public String toString() {
        return "In PersonDao";
    }
}
