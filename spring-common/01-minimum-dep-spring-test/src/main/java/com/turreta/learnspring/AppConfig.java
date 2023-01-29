package com.turreta.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.turreta.learnspring")
public class AppConfig {

    @Bean
    public Dao dao() {
        return new Dao();
    }

    @Bean
    public Service service(Dao dao) {
        return new Service(dao);
    }
}
