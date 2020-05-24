package com.evgenii.trello.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TeamCreationsTests extends TestBase{

    @Test
    public void testCreationTeam() throws InterruptedException {
        createBoardTeam(By.name("add"));
        createTeam(By.xpath("//button[@data-test-id='header-create-team-button']"));
        teamNameFillForm(By.className("_1CLyNodCAa-vQi"), "Evgenii");
        confirmLogin(By.className("css-3gw83x"));
        inviteTeamLater();
        teamTypeDropDown(By.xpath("//div[@data-test-id='header-create-team-type-input-operations']"));
        teamDescriptionFillForm(By.className("_15aIJYNKhrO4vB"));
        continueTeamCretaion(By.className("_1aS0LdGertk5P7"));
        teamMembers(By.className("autocomplete-input"));
        InviteToTeam(By.xpath("//button[@class='autocomplete-btn primary fullWidthButton']"));
        returnToHomePage();
        Thread.sleep(3000);


    }


}
