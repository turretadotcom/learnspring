package com.turreta.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.turreta.learnspring")
public class AppConfig {

    // Start: No issues with these two beans
    @Bean
    public Dao anotherDao() {
        return new Dao("Second");
    }
    @Primary
    @Bean
    public Dao dao() {
        return new Dao("First");
    }

    @Bean
    public Service service(Dao anyDao) {
        return new Service(anyDao);
    }
    // End: No issues with these two beans

    @Bean
    public CarDao hondaCarDao() {
        return new HondaCarDaoImpl();
    }

    @Primary
    @Bean
    public CarDao toyotaCarDao() {
        return new ToyotaCarDaoImpl();
    }

    @Bean
    public House condoHouse() {
        return new CondoHouseImpl();
    }

    @Bean
//    @Primary
    public House landedHouse() {
        return new LandedHouseImpl();
    }


    @Bean
    public HouseOwnerService ownerService(House landedHouse) {
        return new HouseOwnerService(landedHouse);
    }
}
