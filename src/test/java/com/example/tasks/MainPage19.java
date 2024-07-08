package com.example.tasks;

import org.openqa.selenium.WebDriver;

public class MainPage19 {

    private final WebDriver driver;

    public MainPage19(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String pageName) {
        driver.get(pageName);
        driver.manage().window().maximize();
    }
}
