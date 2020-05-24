package com.evgenii.trello.tests.tests;

import org.testng.annotations.Test;

public class BoardDeletionTests extends TestBase {

//    @BeforeMethod
//    public void ensurePreconditions(){
//            if (!app.isOnBoardsPage()){
//                app.click(By.xpath("[href$=boards]"));
//
//            }
//        if(app.getBoardsCount()==0){
//            app.createBoardMethod();
//        }
//    }






    @Test
    public void testBoardDeletion() throws InterruptedException {
//        int before = app.getBoardsCount();
        app.getBoard().openFirstPersonalBoard();
        app.getBoard().clickMoreButton();
        app.getBoard().initBoardDeletionInMoreMenu();
        app.getBoard().permanentlyDeleteClose();
        Thread.sleep(3000);
        app.getBoard().returnToHomePage();
//        Thread.sleep(3000);
//        int after = app.getBoardsCount();
//        System.out.println("was: " + before + " now: " + after);
//        Assert.assertEquals(after,before-1);

    }


}