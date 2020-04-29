package com.evgenii.trello.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TeamCreationsTests extends TestBase{

    @Test
    public void testCreationTeam() throws InterruptedException {
        clickLogIn(By.cssSelector("a.btn.btn-sm.btn-link"));
        fillLoginForm("kozinevgenii85@gmail.com", "Stekla136");
        clickLogIn(By.cssSelector("input#login"));
        createBoardTeam(By.name("add"));
        click(By.xpath("//button[@data-test-id='header-create-team-button']"));
        teamNameFillForm(By.className("_1CLyNodCAa-vQi"));
        confirmLogin(By.className("css-3gw83x"));
        teamTypeDropDown(By.xpath("//div[@data-test-id='header-create-team-type-input-operations']"));
        TeamDescriptionFillForm(By.className("_15aIJYNKhrO4vB"));
        click(By.className("_1aS0LdGertk5P7"));
        TeamMembers(By.className("autocomplete-input"));
        InviteToTeam(By.xpath("//button[@class='autocomplete-btn primary fullWidthButton']"));
        returnToHomePage(By.name("house"));
        Thread.sleep(3000);


    }


}
