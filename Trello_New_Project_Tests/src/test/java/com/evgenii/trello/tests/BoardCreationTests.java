package com.evgenii.trello.tests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions(){
        if (!app.isOnBoardsPage()){
            app.click(By.xpath("[href$=boards]"));

        }
        if(app.getBoardsCount()==0){
            app.createBoardMethod();
        }
    }

        @Test
        public void testBoardCreation() throws InterruptedException {
            int before = app.getBoardsCount();
            Thread.sleep(3000);
            app.createBoardTeam(By.name("add"));
            app.createBoard(By.className("_2jR0BZMM5cBReR"));
            app.fillNameBoard("111155");
            app.click(By.name("down"));
            app.click(By.xpath("//li[1]/button[@class='_2jR0BZMM5cBReR']"));
            app.confirmBoardCreation(By.className("_3UeOvlU6B5KUnS"));

            app.returnToHomePage();
            Thread.sleep(3000);

            int after = app.getBoardsCount();
            System.out.println("was: " +before+ " now: " +after);
            Assert.assertEquals(after, before+1);




        }
}
