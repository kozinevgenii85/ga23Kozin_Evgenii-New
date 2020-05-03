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

    public void click(By locator) {
        wd.findElement(locator).click();
    }
    public void createBoardMethod(){
        createBoardTeam(By.name("add"));
        createBoard(By.className("_2jR0BZMM5cBReR"));
        fillNameBoard("111155");
        click(By.name("down"));
        click(By.xpath("//li[1]/button[@class='_2jR0BZMM5cBReR']"));
        confirmBoardCreation(By.className("_3UeOvlU6B5KUnS"));
        returnToHomePage();
    }
    public void teamCreationMethod(){
        createBoardTeam(By.name("add"));
        createTeam(By.xpath("//button[@data-test-id='header-create-team-button']"));
        teamNameFillForm(By.className("_1CLyNodCAa-vQi"), "Evgenii");
        confirmLogin(By.className("css-3gw83x"));
        teamTypeDropDown(By.xpath("//div[@data-test-id='header-create-team-type-input-operations']"));
        teamDescriptionFillForm(By.className("_15aIJYNKhrO4vB"));
        continueTeamCretaion(By.className("_1aS0LdGertk5P7"));
        teamMembers(By.className("autocomplete-input"));
        InviteToTeam(By.xpath("//button[@class='autocomplete-btn primary fullWidthButton']"));
        returnToHomePage();
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

    public void permanentlyDeleteClose() {
        click(By.cssSelector(".js-delete"));
        confirm();
    }

    public void initBoardDeletionInMoreMenu() {
        clickCloseBoardFromMoreMenu();
        confirm();

    }

    public void confirm() {
        click(By.cssSelector(".js-confirm "));
    }

    public void clickCloseBoardFromMoreMenu() {
        click(By.cssSelector(".js-close-board"));
    }

    public void clickMoreButton() {
        click(By.cssSelector(".js-open-more"));
    }

    public void openFirstPersonalBoard() {
        click(By.xpath("//*[@class='icon-lg icon-member']/../../..//li"));
    }

    public int getBoardsCount() {
        return wd.findElements(By.xpath("//*[@class='icon-lg icon-member']/../../..//li")).size()-1;

    }



    public int getTeamCounts() {
        return wd.findElements(By.xpath("//span[@data-test-id='home-team-tab-name']")).size();
    }

    public void openFirstTeam() {
        click(By.xpath("//span[@data-test-id='home-team-tab-name']"));
        click(By.xpath("//li[@class='pgEbaAFZBA0N5R']//li[4]"));
    }

    public void editTeamProfile() {
        click(By.className("css-j8fq0c"));
    }

    public void editNameProfile() {
        click(By.id("displayName"));
        teamNameFillForm(By.id("displayName"), "VasiaTeam");
    }

    public void saveEditNameProfile() {
        click(By.className("css-1ool8lk"));
    }

    public void changeTeamVisibility() {
        click(By.xpath("//a[@class='button-link u-text-align-center']"));
        click(By.xpath("//a[@class='highlight-icon js-select-public']//span[@class='icon-sm icon-public']"));
    }

    public void inviteToBoard() {
        click(By.className("js-open-manage-board-members"));
        type(By.className("autocomplete-input"), "kozinevgenii85@gmail.com");
        click(By.className("autocomplete-btn"));
    }

    public void addNewList() {
        click(By.xpath("//a[@class='open-add-list js-open-add-list']"));
        type(By.xpath("//input[@class='list-name-input']"), "New list");
        click(By.xpath("//input[@type='submit']"));
    }

    public void deleteThisTeam() {
        click(By.className("quiet-button"));
        confirm();
    }
}
