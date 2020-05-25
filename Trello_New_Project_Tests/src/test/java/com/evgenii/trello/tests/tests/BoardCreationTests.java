package com.evgenii.trello.tests.tests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions(){
        if (!app.getBoard().isOnBoardsPage()){
            app.getBoard().click(By.name("house"), 5);

        }
        if(app.getBoard().getCreatedBoardsCount()==0){
            app.getBoard().createBoardMethod();
        }
    }

        @Test
        public void testBoardCreation() throws InterruptedException {
            int before = app.getBoard().getCreatedBoardsCount();
            Thread.sleep(3000);
            app.getBoard().createBoardTeam(By.name("add"));
            app.getBoard().createBoard(By.className("_2jR0BZMM5cBReR"));
            app.getBoard().fillNameBoard("111155");
            app.getBoard().click(By.name("down"), 5);
            app.getBoard().click(By.xpath("//li[1]/button[@class='_2jR0BZMM5cBReR']"), 5);
            app.getBoard().confirmBoardCreation(By.className("_3UeOvlU6B5KUnS"));

            app.getBoard().returnToHomePage();


            int after = app.getBoard().getCreatedBoardsCount();
            System.out.println("was: " +before+ " now: " +after);
            Assert.assertEquals(after ,before+1 );




        }
}
