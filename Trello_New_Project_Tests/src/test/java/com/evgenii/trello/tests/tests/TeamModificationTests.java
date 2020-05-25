package com.evgenii.trello.tests.tests;

import org.testng.annotations.Test;

public class TeamModificationTests extends TestBase {

    @Test
    public void  TestTeamModification() throws InterruptedException {
         //firstTeamInList
        app.getTeam().openFirstTeam();
        //editTeamProfile
        app.getTeam().editTeamProfile();
        //editNameProfile
        app.getTeam().editNameProfile();
        //saveEditNameProfile
        app.getTeam().saveEditNameProfile();
        //changeTeamVisibility
        app.getTeam().changeTeamVisibility();

        Thread.sleep(3000);
        app.getTeam().returnToHomePage();
        Thread.sleep(3000);


    }
}
