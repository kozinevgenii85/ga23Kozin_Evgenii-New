package com.evgenii.trello.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.navigate().to("https://trello.com/");
        login("kozinevgenii85@gmail.com", "Stekla136");

    }



    public void fillLoginForm(String userEmail, String userPassword) {
        type(By.cssSelector("input#user"), userEmail);
        type(By.cssSelector("input#password"), userPassword);
    }

    public void type(By locator, String text) {
        clickLogIn(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void clickLogIn(By locator) {
        confirmLogin(locator);
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }


    public void fillNameBoard(String nameBoard) {
        type(By.className("_23NUW98LaZfBpQ"), nameBoard);
    }

    public void confirmBoardCreation(By locator) {
        click(locator);
    }

    public void returnToHomePage() {
        click(By.name("house"));
        click(By.name("house"));
    }

    public void confirmLogin(By locator) {
        wd.findElement(locator).click();

    }

    public void initLogin(By locator) {
        click(locator);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }


    public void createBoard(By locator) {
        click(locator);
    }

    public void createBoardTeam(By locator) {
        click(locator);
    }

    public void teamNameFillForm(By locator, String teamName) {
        type(locator, teamName);
    }

    public void teamTypeDropDown(By locator) {
        click(locator);
    }

    public void teamDescriptionFillForm(By locator) {
        type(locator, "New my team");
    }

    public void teamMembers(By locator) {
        type(locator, "kozinevgenii85@gmail.com");
    }

    public void InviteToTeam(By locator) {
        click(locator);
        click(locator);
    }
    public void login(String email, String password) {
        clickLogIn(By.cssSelector("a.btn.btn-sm.btn-link"));
        fillLoginForm(email, password);
        clickLogIn(By.cssSelector("input#login"));
    }


    public void createTeam(By locator) {
        click(locator);
    }

    public void continueTeamCretaion(By locator) {
        click(locator);
    }
}
