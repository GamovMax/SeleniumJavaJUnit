package com.example.tasks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.example.tasks.MainPage.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import static com.example.tasks.MainPage.driver;

public class TestAddTask12 {
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() {
        driver.quit();

    }
    @Test
    public void Add(){
        driver.get("http://192.168.111.16/litecart/admin/login.php");
        driver.manage().window().maximize();
        loginPass();

        driver.findElement(By.linkText("Catalog")).click();
        driver.findElement(By.partialLinkText("dd New Produc")).click();
        driver.findElement(By.cssSelector("input[data-type=\"toggle\"][value=\"1\"]")).click();

        Random random = new Random();
        int randomNumber = random.nextInt(1000000000);

        String name = "Name" + randomNumber;

        driver.findElement(By.cssSelector("input[name='name[en]']")).click();
        driver.findElement(By.cssSelector("input[name='name[en]']")).sendKeys(name);

        driver.findElement(By.linkText("Information")).click();

        driver.findElement(By.name("keywords")).click();
        driver.findElement(By.name("keywords")).sendKeys(name);

        driver.findElement(By.linkText("Prices")).click();

        driver.findElement(By.name("gross_prices[USD]")).click();
        driver.findElement(By.name("gross_prices[USD]")).sendKeys("1");

        driver.findElement(By.name("save")).click();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
