package com.evgenii.trello.tests;


import okhttp3.Route;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase{


        @Test
        public void testBoardCreation() throws InterruptedException {
            int before = getBoardsCount();
            Thread.sleep(3000);
            createBoardTeam(By.name("add"));
            createBoard(By.className("_2jR0BZMM5cBReR"));
            fillNameBoard("111155");
            click(By.name("down"));
            click(By.xpath("//li[1]/button[@class='_2jR0BZMM5cBReR']"));
            confirmBoardCreation(By.className("_3UeOvlU6B5KUnS"));

            returnToHomePage();
            Thread.sleep(3000);

            int after = getBoardsCount();
            System.out.println("was: " +before+ " now: " +after);
            Assert.assertEquals(after, before+1);




        }
}
