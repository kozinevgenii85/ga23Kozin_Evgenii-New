package com.evgenii.trello.tests.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardHelper extends  HelperBase{

    public BoardHelper(WebDriver wd) {
        super(wd);
    }

    public void fillNameBoard(String nameBoard) {
        type(By.className("_23NUW98LaZfBpQ"), nameBoard);
    }

    public void confirmBoardCreation(By locator) {
        click(locator);
    }

    public void createBoardMethod(){
        createBoardTeam(By.name("add"));
        createBoard(By.className("_2jR0BZMM5cBReR"));
        fillNameBoard("111155");
        click(By.name("down"));
        click(By.xpath("//li[1]/button[@class='_2jR0BZMM5cBReR']"));
        confirmBoardCreation(By.className("_3UeOvlU6B5KUnS"));
        returnToHomePage();
    }

    public void createBoard(By locator) {
        click(locator);
    }

    public void permanentlyDeleteClose() {
        click(By.cssSelector(".js-delete"));
        confirm();
    }

    public void initBoardDeletionInMoreMenu() {
        clickCloseBoardFromMoreMenu();
        confirm();

    }

    public void clickCloseBoardFromMoreMenu() {
        click(By.cssSelector(".js-close-board"));
    }

    public void openFirstPersonalBoard() {
        click(By.xpath("//*[@class='icon-lg icon-member']/../../..//li"));
    }

    public int getBoardsCount() {
        return wd.findElements(By.cssSelector("[.board-tile-details-name]")).size()-1;

    }

    public void inviteToBoard() {
        click(By.className("js-open-manage-board-members"));
        type(By.className("autocomplete-input"), "kozinevgenii85@gmail.com");
        click(By.className("autocomplete-btn"));
    }

    public void addNewList() throws InterruptedException {
        click(By.xpath("//span[@class = 'placeholder']"));
        Thread.sleep(3000);
        type(By.xpath("//input[@name = 'name']"), "New list");
        Thread.sleep(3000);
        click(By.xpath("//input[@type='submit']"));
        Thread.sleep(3000);
    }

    public boolean isOnBoardsPage() {
        String url = wd.getCurrentUrl();
        return url.contains("boards");
    }

    public void clickMoreButton() {
//        click(By.cssSelector(".js-show-sidebar"));
        click(By.cssSelector(".js-open-more"));
    }
}
