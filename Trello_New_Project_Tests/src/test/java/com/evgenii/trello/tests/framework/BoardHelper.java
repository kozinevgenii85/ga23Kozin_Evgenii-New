package com.evgenii.trello.tests.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardHelper extends  HelperBase {

    public BoardHelper(WebDriver wd) {
        super(wd);
    }

    public void fillNameBoard(String nameBoard) {
        type(By.className("_23NUW98LaZfBpQ"), nameBoard);
    }

    public void confirmBoardCreation(By locator) {
        click(locator, 5);
    }

    public void createBoardMethod() {
        createBoardTeam(By.name("add"));
        createBoard(By.className("_2jR0BZMM5cBReR"));
        fillNameBoard("111155");
        click(By.name("down"), 5);
        click(By.xpath("//li[1]/button[@class='_2jR0BZMM5cBReR']"), 5);
        confirmBoardCreation(By.className("_3UeOvlU6B5KUnS"));
        returnToHomePage();
    }

    public void createBoard(By locator) {
        click(locator, 5);
    }

    public void permanentlyDeleteClose() {
        click(By.cssSelector(".js-delete"), 5);
        confirm();
    }

    public void initBoardDeletionInMoreMenu() {
        clickCloseBoardFromMoreMenu();
        confirm();

    }

    public void clickCloseBoardFromMoreMenu() {
        click(By.cssSelector(".js-close-board"), 5);
    }

    public void openFirstPersonalBoard() {
        click(By.xpath("//*[@class='icon-lg icon-member']/../../..//li"), 5);
    }


    public void inviteToBoard() {
        click(By.className("js-open-manage-board-members"), 5);
        type(By.className("autocomplete-input"), "kozinevgenii85@gmail.com");
        click(By.className("autocomplete-btn"), 5);
    }

    public void addNewList() throws InterruptedException {
        click(By.className("placeholder"), 0);
        Thread.sleep(3000);
        type(By.name("name"), "New list");
        Thread.sleep(3000);
        click(By.className("js-save-edit"), 5);
        Thread.sleep(3000);
    }

    public boolean isOnBoardsPage() {
        String url = wd.getCurrentUrl();
        return url.contains("boards");
    }

    public void clickMoreButton() {
        if (wd.findElements(By.className("js-hide-sidebar")).size()!=0) {
            click(By.className("js-hide-sidebar"), 0);
            click(By.className("js-show-sidebar"), 0);
            click(By.className("js-open-more"), 0);
        }else {click(By.className("js-show-sidebar"), 0);
            click(By.className("js-open-more"), 0);}


    }

    public void geVoidMore() {
        if (wd.findElements(By.className("mod-show-menu js-show-sidebar")).size()!= 0) {
            click(By.className("mod-show-menu js-show-sidebar"), 0);
        }
    }


    public int getEditBoardsCount() {//подсчет количества листов
        return wd.findElements(By.className("list")).size();
    }

    public int getBoardsDeletedCount() {//подсчет количества досок
        return wd.findElements(By.className("boards-page-board-section-list-item")).size();

    }

    public int getCreatedBoardsCount() {//подсчет количества досок
        return wd.findElements(By.className("boards-page-board-section-list-item")).size();

    }


}
