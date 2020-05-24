package com.evgenii.trello.tests.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperBase {
    WebDriver wd;
    WebDriverWait wait;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void type(By locator, String text) {
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void returnToHomePage() {
        click(By.name("house"));
        click(By.name("house"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void createBoardTeam(By locator) {
        click(locator);
    }

    public void confirm() {
        click(By.cssSelector(".js-confirm "));
    }

    public boolean isElementPresent(By locator){
        return wd.findElements(locator).size()>0;
    }
}
