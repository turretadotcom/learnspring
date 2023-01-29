package com.turreta.learnspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.turreta.learnspring"})
@EnableAspectJAutoProxy
public class AppConfig {

}
