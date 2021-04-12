package com.test.Nitu.stepdef;

import com.test.Nitu.util.DriverClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends DriverClass {

    @Before
    public void setUp() {

        setup();
    }

    @After
    public void tearDown() {

        closeDriver();
    }
}
