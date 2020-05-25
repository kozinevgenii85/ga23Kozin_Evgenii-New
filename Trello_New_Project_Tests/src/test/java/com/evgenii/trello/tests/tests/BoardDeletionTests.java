package com.evgenii.trello.tests.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardDeletionTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
            if (!app.getBoard().isOnBoardsPage()){
                app.getBoard().click(By.name("house"), 5);

            }
        if(app.getBoard().getBoardsDeletedCount()==0){
            app.getBoard().createBoardMethod();
        }
    }






    @Test
    public void testBoardDeletion() throws InterruptedException {
        //app.getBoard().click(By.xpath(""));
       int before = app.getBoard().getBoardsDeletedCount();
        Thread.sleep(3000);
        app.getBoard().openFirstPersonalBoard();
        app.getBoard().clickMoreButton();
        app.getBoard().initBoardDeletionInMoreMenu();
        app.getBoard().permanentlyDeleteClose();
        Thread.sleep(3000);
        app.getBoard().returnToHomePage();
        Thread.sleep(3000);

        int after = app.getBoard().getBoardsDeletedCount();
        System.out.println("was: " + before + " now: " + after);
        Assert.assertEquals(after,before-1);

    }


}