package com.evgenii.trello.tests.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamHelper extends HelperBase {
    public TeamHelper(WebDriver wd) {
        super(wd);
    }

    public void teamCreationMethod(){
        createBoardTeam(By.name("add"));
        createTeam(By.xpath("//button[@data-test-id='header-create-team-button']"));
        teamNameFillForm(By.className("_1CLyNodCAa-vQi"), "Evgenii");
        //confirmLogin(By.className("css-3gw83x"));
        teamTypeDropDown(By.xpath("//div[@data-test-id='header-create-team-type-input-operations']"));
        teamDescriptionFillForm(By.className("_15aIJYNKhrO4vB"));
        continueTeamCretaion(By.className("_1aS0LdGertk5P7"));
        teamMembers(By.className("autocomplete-input"));
        InviteToTeam(By.xpath("//button[@class='autocomplete-btn primary fullWidthButton']"));
        returnToHomePage();
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

    public void createTeam(By locator) {
        click(locator);
    }

    public void continueTeamCretaion(By locator) {
        click(locator);
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

    public void deleteThisTeam() {
        click(By.className("quiet-button"));
        confirm();
    }

    public void inviteTeamLater(){
        if(isElementPresent(By.cssSelector("[data-test-id=show-later-button]"))){
            click(By.cssSelector("[data-test-id=show-later-button]"));
        }
    }

//    public void openTeamSettings() { домашнее задание
//        openFirstTeam();
//        openSettings();
//    }
//
//    public void openSettings() {
//        click(By.xpath(""));
//    }
}
