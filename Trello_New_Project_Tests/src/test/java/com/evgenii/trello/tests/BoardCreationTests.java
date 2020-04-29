package com.evgenii.trello.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase{

        @Test
        public void testBoardCreation() throws InterruptedException {
            createBoardTeam(By.name("add"));
            createBoard(By.className("_2jR0BZMM5cBReR"));
            fillNameBoard("111155");
            confirmBoardCreation(By.className("_3UeOvlU6B5KUnS"));
            returnToHomePage();



        }
}
