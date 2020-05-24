package com.evgenii.trello.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardDeletionTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
            if (!app.isOnBoardsPage()){
                app.click(By.xpath("[href$=boards]"));

            }
        if(app.getBoardsCount()==0){
            app.createBoardMethod();
        }
    }



    @Test
    public void testBoardDeletion() throws InterruptedException {
        int before = app.getBoardsCount();
        app.openFirstPersonalBoard();
        app.clickMoreButton();
        app.initBoardDeletionInMoreMenu();
        app.permanentlyDeleteClose();
        //Thread.sleep(3000);
        app.returnToHomePage();
        Thread.sleep(3000);
        int after = app.getBoardsCount();
        System.out.println("was: " + before + " now: " + after);
        Assert.assertEquals(after,before-1);

    }


}