package com.evgenii.trello.tests.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void fillLoginForm(String userEmail, String userPassword) {
        type(By.cssSelector("input#user"), userEmail);
        type(By.cssSelector("input#password"), userPassword);
    }

    public void clickLogIn(By locator) {
        confirmLogin(locator);
    }

    public void confirmLogin(By locator) {
        wd.findElement(locator).click();

    }

    public void login(String email, String password) {
        clickLogIn(By.cssSelector("a.btn.btn-sm.btn-link"));
        fillLoginForm(email, password);
        clickLogIn(By.cssSelector("input#login"));
    }
}
