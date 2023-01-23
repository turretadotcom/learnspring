package com.turreta.learnspring;

import org.springframework.beans.factory.annotation.Qualifier;

public class HouseOwnerService {
    private final House house;
    public HouseOwnerService(House house) {
        this.house = house;
    }
}
