package com.example.tasks;

import org.junit.Test;
import static constants.Constant.Urls.URL_ADMIN;

public class TestFirstTask2 extends BasePage.BasePage {
    @Test
    public void task2() {
        get(URL_ADMIN + "login.php");
        //maximize();
        loginPass();
    }
}