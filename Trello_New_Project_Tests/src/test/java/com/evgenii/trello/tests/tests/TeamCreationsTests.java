package com.evgenii.trello.tests.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TeamCreationsTests extends TestBase{

    @Test
    public void testCreationTeam() throws InterruptedException {
        app.getTeam().createBoardTeam(By.name("add"));
        app.getTeam().createTeam(By.xpath("//button[@data-test-id='header-create-team-button']"));
        app.getTeam().teamNameFillForm(By.className("_1CLyNodCAa-vQi"), "Evgenii");
        app.getSesion().confirmLogin(By.className("css-3gw83x"));
        //app.inviteTeamLater();
        app.getTeam().teamTypeDropDown(By.xpath("//div[@data-test-id='header-create-team-type-input-sales crm']"));
        app.getTeam().teamDescriptionFillForm(By.className("_15aIJYNKhrO4vB"));
        app.getTeam().continueTeamCretaion(By.className("_1aS0LdGertk5P7"));
        app.getTeam().teamMembers(By.className("autocomplete-input"));
        app.getTeam().InviteToTeam(By.xpath("//button[@class='autocomplete-btn primary fullWidthButton']"));
        app.getTeam().returnToHomePage();
        Thread.sleep(3000);


    }


}
