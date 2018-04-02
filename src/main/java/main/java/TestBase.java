package main.java;

import FW.APmanager;
import org.testng.annotations.*;

public class TestBase {

    protected APmanager app;
    GroupData groupdata = new GroupData();

    @BeforeClass
    public void setup()
    {
        app = new APmanager();
        //1. Открыть браузер и развернуть на весь экран.
//        app.startDriver();
    }

    @BeforeMethod
    public void setupTests()
    {
        //2. Зайти на yandex.ru.
        app.home.getHomePage(groupdata.homePage);
    }


    @AfterClass
    public void tearDown(){
        app.quitDriver();
    }


}
