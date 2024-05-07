package com.example.tasks;

import org.junit.Test;

public class TestFirstTask2 extends BasePage.BasePage {
    @Test
    public void task2() {
        get("http://192.168.111.16/litecart/admin/login.php");
        maximize();
        loginPass();
    }
}
