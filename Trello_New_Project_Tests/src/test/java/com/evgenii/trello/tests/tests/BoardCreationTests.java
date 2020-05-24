package com.evgenii.trello.tests.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase{

//    @BeforeMethod
//    public void ensurePreconditions(){
//        if (!app.isOnBoardsPage()){
//            app.click(By.xpath("[href$=boards]"));
//
//        }
//        if(app.getBoardsCount()==0){
//            app.createBoardMethod();
//        }
//    }

        @Test
        public void testBoardCreation() throws InterruptedException {
//            int before = app.getBoardsCount();
//            Thread.sleep(3000);
            app.getBoard().createBoardTeam(By.name("add"));
            app.getBoard().createBoard(By.className("_2jR0BZMM5cBReR"));
            app.getBoard().fillNameBoard("111155");
            app.getBoard().click(By.name("down"));
            app.getBoard().click(By.xpath("//li[1]/button[@class='_2jR0BZMM5cBReR']"));
            app.getBoard().confirmBoardCreation(By.className("_3UeOvlU6B5KUnS"));

            app.getBoard().returnToHomePage();
            Thread.sleep(3000);

//            int after = app.getBoardsCount();
//            Thread.sleep(3000);

//            System.out.println("was: " +before+ " now: " +after);
//            Thread.sleep(3000);
//            Assert.assertEquals(after, before+1);




        }
}
