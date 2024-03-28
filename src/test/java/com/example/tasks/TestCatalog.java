package com.example.tasks;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.example.tasks.MainPage.driver;

public class TestCatalog {

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }
    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void Heading() {

        driver.get("http://192.168.111.16/litecart/en/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@id=\"box-most-popular\"]/div/ul/li[1]/a[1]/div[1]/div"));
        driver.findElement(By.xpath("//div[@id=\"box-most-popular\"]/div/ul/li[2]/a[1]/div[1]/div"));
        driver.findElement(By.xpath("//div[@id=\"box-most-popular\"]/div/ul/li[3]/a[1]/div[1]/div"));
        driver.findElement(By.xpath("//div[@id=\"box-most-popular\"]/div/ul/li[4]/a[1]/div[1]/div"));
        driver.findElement(By.xpath("//div[@id=\"box-most-popular\"]/div/ul/li[5]/a[1]/div[1]/div"));
    }
}
