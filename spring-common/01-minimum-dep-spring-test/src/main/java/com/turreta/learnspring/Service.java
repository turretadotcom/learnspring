package com.turreta.learnspring;

public class Service {

    private Dao dao;

    public Service(Dao dao) {
        this.dao = dao;
    }

    public Dao getDao() {
        return dao;
    }

    @Override
    public String toString() {
        return "In Service";
    }
}
