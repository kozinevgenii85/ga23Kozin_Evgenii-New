package com.evgenii.trello.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardEditTests extends TestBase {

    @Test
    public void editBoardTest() throws InterruptedException {

        app.openFirstPersonalBoard();
        //addList
        int before = getEditBoardsCount();
        app.addNewList();
        //inviteToBoard
        app.inviteToBoard();
        int after = getEditBoardsCount();
        System.out.println("saw:" +before+ " now: " +after);
        Assert.assertEquals(after, before+1);


        Thread.sleep(3000);
        app.returnToHomePage();
        Thread.sleep(3000);







    }

    private int getEditBoardsCount() {
        return app.wd.findElements(By.className("list")).size();
    }

}
