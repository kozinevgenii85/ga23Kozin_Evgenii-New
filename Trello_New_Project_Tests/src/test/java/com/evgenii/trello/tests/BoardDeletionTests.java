package com.evgenii.trello.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoardDeletionTests extends TestBase {

    @Test
    public  void testBoardDeletion() throws InterruptedException {
        //openListBoards();
        //Thread.sleep(3000);

        openFirstPersonalBoard();
        clickMoreButton();
        clickCloseBoardInMoreMenu();
        confirmCloseBoard();
        permanentlyDeleteClose();
        clickBottomDelete();
        returnToHomePage();

    }

    public void openFirstPersonalBoard() {
    }


    public void openListBoards() {
      click(By.xpath("//span[@class='MEu8ZECLGMLeab']"));

    }


}
