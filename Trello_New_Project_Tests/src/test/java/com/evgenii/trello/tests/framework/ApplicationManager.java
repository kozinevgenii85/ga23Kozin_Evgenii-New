package com.evgenii.trello.tests.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
WebDriver wd;
    BoardHelper board;
    TeamHelper team;
    HelperBase helper;
    SessionHelper session;

    public void init() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.navigate().to("https://trello.com/");
        session = new SessionHelper(wd);
        session.login("kozinevgenii85@gmail.com", "Stekla136");

        board = new BoardHelper(wd);
        team = new TeamHelper(wd);
        helper = new HelperBase(wd);
    }

    public void stop() {

        wd.quit();
    }

    public BoardHelper getBoard() {
        return board;
    }

    public TeamHelper getTeam() {
        return team;
    }


    public SessionHelper getSesion() {
        return session;
    }
}
