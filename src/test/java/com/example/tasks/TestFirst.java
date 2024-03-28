package com.example.tasks;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.example.tasks.MainPage.driver;
import static com.example.tasks.MainPage.loginPass;

public class TestFirst {
    @Test
    public void task2() {
        driver = new ChromeDriver();
        driver.get("http://192.168.111.16/litecart/admin/login.php");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       driver.manage().window().setSize(new Dimension(1440, 860));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginPass();
        driver.close();
        driver.quit();

    }
}
