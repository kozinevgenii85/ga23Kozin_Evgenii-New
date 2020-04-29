package com.evgenii.trello.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase{

        @Test
        public void testBoardCreation() throws InterruptedException {
            initLogin(By.cssSelector("a.btn.btn-sm.btn-link"));
            fillLoginForm("kozinevgenii85@gmail.com", "Stekla136");
            confirmLogin(By.cssSelector("input#login"));
            Thread.sleep(5000);
            //Create
            createBoardTeam(By.name("add"));
            //CreateBoard
            createBoard(By.className("_2jR0BZMM5cBReR"));
            Thread.sleep(5000);
            fillBoardForm("111155");
            confirmBoardCreation(By.className("_3UeOvlU6B5KUnS"));
            //
            returnToHomePage(By.name("house"));



        }
}
