package com.evgenii.trello.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardDeletionTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        if(getBoardsCount()==0){
            createBoardMethod();
        }
    }

    @Test
    public void testBoardDeletion() throws InterruptedException {
        int before = getBoardsCount();
        openFirstPersonalBoard();
        clickMoreButton();
        initBoardDeletionInMoreMenu();
        permanentlyDeleteClose();
        //Thread.sleep(3000);
        returnToHomePage();
        Thread.sleep(3000);
        int after = getBoardsCount();
        System.out.println("was: " + before + " now: " + after);
        Assert.assertEquals(after,before-1);

    }


}