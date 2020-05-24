package com.evgenii.trello.tests;

import org.testng.annotations.Test;

public class TeamEditTests extends TestBase {

    @Test
    public void testTeamEdit() throws InterruptedException {
        //firstTeamInList
        app.openFirstTeam();
        //editTeamProfile
        app.editTeamProfile();
        //editNameProfile
        app.editNameProfile();
        //saveEditNameProfile
        app.saveEditNameProfile();
        //changeTeamVisibility
        app.changeTeamVisibility();

        Thread.sleep(3000);
        app.returnToHomePage();
        Thread.sleep(3000);



    }

}
