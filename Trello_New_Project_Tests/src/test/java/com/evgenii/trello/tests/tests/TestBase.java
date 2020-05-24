package com.evgenii.trello.tests.tests;

import com.evgenii.trello.tests.framework.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    public static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUp(){

        app.init();
    }


    @AfterSuite
    public void tearDown(){
        app.stop();
    }


}
