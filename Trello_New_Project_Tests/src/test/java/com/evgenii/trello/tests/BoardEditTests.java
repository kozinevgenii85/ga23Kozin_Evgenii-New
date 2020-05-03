package com.evgenii.trello.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardEditTests extends TestBase {

    @Test
    public void editBoardTest() throws InterruptedException {

        openFirstPersonalBoard();
        //addList
        int before = getEditBoardsCount();
        addNewList();
        //inviteToBoard
        inviteToBoard();
        int after = getEditBoardsCount();
        System.out.println("saw:" +before+ " now: " +after);
        Assert.assertEquals(after, before+1);


        Thread.sleep(3000);
        returnToHomePage();
        Thread.sleep(3000);







    }

    private int getEditBoardsCount() {
        return wd.findElements(By.className("list")).size();
    }

}
