package com.evgenii.trello.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TeamEditTests extends TestBase {

    @Test
    public void testTeamEdit() throws InterruptedException {
        //firstTeamInList
        openFirstTeam();
        //editTeamProfile
        editTeamProfile();
        //editNameProfile
        editNameProfile();
        //saveEditNameProfile
        saveEditNameProfile();
        //changeTeamVisibility
        changeTeamVisibility();

        Thread.sleep(3000);
        returnToHomePage();
        Thread.sleep(3000);



    }

}
