package com.turreta.learnspring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Dao implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware {

    private ApplicationContext context;
    private String name;

    public Dao(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "In Dao " + name;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("In Dao afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("In Dao destroy");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("In Dao. Got the application context");
        this.context = applicationContext;

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("In Dao. Bean name is " + s);
    }
}
