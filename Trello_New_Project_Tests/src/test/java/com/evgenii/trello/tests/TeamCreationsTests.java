package com.evgenii.trello.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TeamCreationsTests extends TestBase{

    @Test
    public void testCreationTeam() throws InterruptedException {
        app.createBoardTeam(By.name("add"));
        app.createTeam(By.xpath("//button[@data-test-id='header-create-team-button']"));
        app.teamNameFillForm(By.className("_1CLyNodCAa-vQi"), "Evgenii");
        app.confirmLogin(By.className("css-3gw83x"));
        //app.inviteTeamLater();
        app.teamTypeDropDown(By.xpath("//div[@data-test-id='header-create-team-type-input-sales crm']"));
        app.teamDescriptionFillForm(By.className("_15aIJYNKhrO4vB"));
        app.continueTeamCretaion(By.className("_1aS0LdGertk5P7"));
        app.teamMembers(By.className("autocomplete-input"));
        app.InviteToTeam(By.xpath("//button[@class='autocomplete-btn primary fullWidthButton']"));
        app.returnToHomePage();
        Thread.sleep(3000);


    }


}
