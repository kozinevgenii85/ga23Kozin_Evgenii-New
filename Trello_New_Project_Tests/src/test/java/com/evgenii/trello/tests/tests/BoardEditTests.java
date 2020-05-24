package com.evgenii.trello.tests.tests;

import org.testng.annotations.Test;

public class BoardEditTests extends TestBase {

    @Test
    public void editBoardTest() throws InterruptedException {

        app.getBoard().openFirstPersonalBoard();
        Thread.sleep(3000);
        //addList
       //int before = getEditBoardsCount();
        //Thread.sleep(3000);
        app.getBoard().addNewList();
        Thread.sleep(3000);
       //inviteToBoard
       app.getBoard().inviteToBoard();
//       int after = getEditBoardsCount();
//        Thread.sleep(3000);
//        System.out.println("saw:" +before+ " now: " +after);
//        Assert.assertEquals(after, before+1);


        Thread.sleep(3000);
        app.getBoard().returnToHomePage();
        Thread.sleep(3000);







    }

//    public int getEditBoardsCount() {
//        return app.wd.findElements(By.className("list")).size();
//    }

}
