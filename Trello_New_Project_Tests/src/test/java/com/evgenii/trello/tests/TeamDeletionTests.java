package com.evgenii.trello.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
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


        int before = getTeamCounts();
        //openFirstTeam
        openFirstTeam();
        //deleteThisTeam
        deleteThisTeam();
        Thread.sleep(3000);
        returnToHomePage();

        Thread.sleep(3000);
        int after = getTeamCounts();
        System.out.println(" was: " + before + " now: " + after);
        Assert.assertEquals(after, before - 1);




    }


}
