package com.evgenii.trello.tests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class BoardModificationTests extends TestBase {

    @Test
    public void ModificationBoardTest() throws InterruptedException {

        app.getBoard().openFirstPersonalBoard();
        Thread.sleep(3000);
        int before = app.getBoard().getEditBoardsCount();
        Thread.sleep(3000);
        app.getBoard().addNewList();
        Thread.sleep(3000);
        app.getBoard().inviteToBoard();
       int after = app.getBoard().getEditBoardsCount();
        Thread.sleep(3000);
        System.out.println("saw:" +before+ " now: " +after);
        Assert.assertEquals(after, before+1);


        Thread.sleep(3000);
        app.getBoard().returnToHomePage();
        Thread.sleep(3000);







    }



}
