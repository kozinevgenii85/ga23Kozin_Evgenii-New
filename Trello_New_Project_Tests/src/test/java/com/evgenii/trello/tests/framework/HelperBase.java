package com.evgenii.trello.tests.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperBase {
    WebDriver wd;


    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void type(By locator, String text) {
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void returnToHomePage() {
        click(By.name("house"), 5);
        click(By.name("house"), 5);
    }

    public void click(By locator, int timeOutSec) {
        new WebDriverWait(wd, timeOutSec).until(ExpectedConditions.presenceOfElementLocated(locator)).click();
    }

    public void createBoardTeam(By locator) {
        click(locator, 5);
    }

    public void confirm() {
        click(By.cssSelector(".js-confirm "), 5);
    }

    public boolean isElementPresent(By locator){
        return wd.findElements(locator).size()>0;
    }
}
