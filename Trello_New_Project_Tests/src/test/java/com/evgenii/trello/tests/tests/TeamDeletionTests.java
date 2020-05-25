package com.evgenii.trello.tests.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamDeletionTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditionsTeam() throws InterruptedException {
        if(app.getTeam().getTeamDeletedCounts()>0);

        {
            app.getTeam().teamCreationMethod();
        }
    }

    @Test
    public void testTeamDeletion() throws InterruptedException {


        int before = app.getTeam().getTeamDeletedCounts();
        //openFirstTeam
        app. getTeam().openFirstTeam();
        //deleteThisTeam
        app.getTeam().deleteThisTeam();
        Thread.sleep(3000);
        app.getTeam().returnToHomePage();

        Thread.sleep(3000);
        int after = app.getTeam().getTeamDeletedCounts();
        System.out.println(" was: " + before + " now: " + after);
        Assert.assertEquals(after, before - 1);




    }


}
