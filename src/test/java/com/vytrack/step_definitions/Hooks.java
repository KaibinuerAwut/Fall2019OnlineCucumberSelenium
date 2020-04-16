package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.CucumberOptions;

public class Hooks {


    @Before
    public void setUp(){
        System.out.println("Test setUp");





    }

    @After
    public void tearDown(){
        System.out.println("Test clean up");



    }


}
