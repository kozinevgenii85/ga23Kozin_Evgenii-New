package com.evgenii.trello.tests.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNavigationBar extends TestBase {

    @Test
    public void navigationBarTest(){

        app.getNavigation().click(By.xpath(""), 5);
    }
}
