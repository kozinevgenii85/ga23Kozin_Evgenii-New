package com.evgenii.trello.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamDeletionTests extends TestBase{

//    @BeforeMethod
//    public void ensurePreconditionsTeam() throws InterruptedException {
//        if(getTeamCounts()==0);
//        Thread.sleep(3000);
//        {
//            teamCreationMethod();
//        }
//    }

    @Test
    public void testTeamDeletion() throws InterruptedException {


        int before = app.getTeamCounts();
        //openFirstTeam
        app.openFirstTeam();
        //deleteThisTeam
        app.deleteThisTeam();
        Thread.sleep(3000);
        app.returnToHomePage();

        Thread.sleep(3000);
        int after = app.getTeamCounts();
        System.out.println(" was: " + before + " now: " + after);
        Assert.assertEquals(after, before - 1);




    }


}
