package com.turreta.learnspring;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
//@ContextConfiguration
@ContextConfiguration(classes = AppConfig.class)
public class PersonServiceTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getPersonDao() {
    }

    @org.junit.Test
    public void setPersonDao() {
    }

    @org.junit.Test
    public void testToString() {
    }
}