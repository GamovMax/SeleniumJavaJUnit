package com.example.tasks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;

import static com.example.tasks.MainPage.*;
public class TestPrice {

    @Test
    public void Price() {

        driver = new ChromeDriver();

        driver.get("http://192.168.111.16/litecart/en/");
        driver.manage().window().maximize();


        WebElement element_n1 = driver.findElement(By.cssSelector("a.link[title='Yellow Duck']>div.name"));
        WebElement element_n2 = driver.findElement(By.cssSelector("a.link[title='Green Duck']>div.name"));

        WebElement element_p1_1 = driver.findElement(By.cssSelector("a.link[title='Yellow Duck']>div.price-wrapper>s.regular-price"));
        WebElement element_p1_2 = driver.findElement(By.cssSelector("a.link[title='Yellow Duck']>div.price-wrapper>strong.campaign-price"));
        WebElement element_p2 = driver.findElement(By.cssSelector("a.link[title='Green Duck']>div.price-wrapper>span.price"));

        WebElement element_a1 = driver.findElement(By.cssSelector("a.link[title='Yellow Duck']"));
        WebElement element_a2 = driver.findElement(By.cssSelector("a.link[title='Green Duck']"));

        String str_n1 = element_n1.getText();
        String str_n2 = element_n2.getText();

        String str_p1_1 = element_p1_1.getText();
        String str_p1_2 = element_p1_2.getText();
        String str_p2 = element_p2.getText();

        String str_a1 = element_a1.getAttribute("href");
        String str_a2 = element_a2.getAttribute("href");

        driver.get(str_a1);


        if ((str_n1.equals(driver.findElement(By.cssSelector("h1.title")).getText())) && (str_p1_1.equals(driver.findElement(By.cssSelector("s.regular-price")).getText())) && (str_p1_2.equals(driver.findElement(By.cssSelector("strong.campaign-price")).getText())))
            System.out.println("\nChrome: Cтраницы \"Yellow Duck\" совпадают");
        else
            System.out.println("Chrome: Cтраницы \"Yellow Duck\" НЕ совпадают");

        driver.get(str_a2);

        if ((str_n2.equals(driver.findElement(By.cssSelector("h1.title")).getText())) && (str_p2.equals(driver.findElement(By.cssSelector("span.price[itemprop='price']")).getText())))
            System.out.println("Chrome: Cтраницы \"Green Duck\" совпадают");
        else
            System.out.println("Chrome: Cтраницы \"Green Duck\" НЕ совпадают");

        driver.quit();
    }

    @Test
    public void PriceF() {

        driver = new FirefoxDriver();

        driver.get("http://192.168.111.16/litecart/en/");
        driver.manage().window().maximize();


        WebElement element_n1 = driver.findElement(By.cssSelector("a.link[title='Yellow Duck']>div.name"));
        WebElement element_n2 = driver.findElement(By.cssSelector("a.link[title='Green Duck']>div.name"));

        WebElement element_p1_1 = driver.findElement(By.cssSelector("a.link[title='Yellow Duck']>div.price-wrapper>s.regular-price"));
        WebElement element_p1_2 = driver.findElement(By.cssSelector("a.link[title='Yellow Duck']>div.price-wrapper>strong.campaign-price"));
        WebElement element_p2 = driver.findElement(By.cssSelector("a.link[title='Green Duck']>div.price-wrapper>span.price"));

        WebElement element_a1 = driver.findElement(By.cssSelector("a.link[title='Yellow Duck']"));
        WebElement element_a2 = driver.findElement(By.cssSelector("a.link[title='Green Duck']"));

        String str_n1 = element_n1.getText();
        String str_n2 = element_n2.getText();

        String str_p1_1 = element_p1_1.getText();
        String str_p1_2 = element_p1_2.getText();
        String str_p2 = element_p2.getText();

        String str_a1 = element_a1.getAttribute("href");
        String str_a2 = element_a2.getAttribute("href");

        driver.get(str_a1);


        if ((str_n1.equals(driver.findElement(By.cssSelector("h1.title")).getText())) && (str_p1_1.equals(driver.findElement(By.cssSelector("s.regular-price")).getText())) && (str_p1_2.equals(driver.findElement(By.cssSelector("strong.campaign-price")).getText())))
            System.out.println("\nFirefox: Cтраницы \"Yellow Duck\" совпадают");
        else
            System.out.println("Firefox: Cтраницы \"Yellow Duck\" НЕ совпадают");

        driver.get(str_a2);

        if ((str_n2.equals(driver.findElement(By.cssSelector("h1.title")).getText())) && (str_p2.equals(driver.findElement(By.cssSelector("span.price[itemprop='price']")).getText())))
            System.out.println("Firefox: Cтраницы \"Green Duck\" совпадают");
        else
            System.out.println("Firefox: Cтраницы \"Green Duck\" НЕ совпадают");

        driver.quit();
    }

    @Test
    public void PriceE() {

        driver = new EdgeDriver();

        driver.get("http://192.168.111.16/litecart/en/");
        driver.manage().window().maximize();


        WebElement element_n1 = driver.findElement(By.cssSelector("a.link[title='Yellow Duck']>div.name"));
        WebElement element_n2 = driver.findElement(By.cssSelector("a.link[title='Green Duck']>div.name"));

        WebElement element_p1_1 = driver.findElement(By.cssSelector("a.link[title='Yellow Duck']>div.price-wrapper>s.regular-price"));
        WebElement element_p1_2 = driver.findElement(By.cssSelector("a.link[title='Yellow Duck']>div.price-wrapper>strong.campaign-price"));
        WebElement element_p2 = driver.findElement(By.cssSelector("a.link[title='Green Duck']>div.price-wrapper>span.price"));

        WebElement element_a1 = driver.findElement(By.cssSelector("a.link[title='Yellow Duck']"));
        WebElement element_a2 = driver.findElement(By.cssSelector("a.link[title='Green Duck']"));

        String str_n1 = element_n1.getText();
        String str_n2 = element_n2.getText();

        String str_p1_1 = element_p1_1.getText();
        String str_p1_2 = element_p1_2.getText();
        String str_p2 = element_p2.getText();

        String str_a1 = element_a1.getAttribute("href");
        String str_a2 = element_a2.getAttribute("href");

        driver.get(str_a1);


        if ((str_n1.equals(driver.findElement(By.cssSelector("h1.title")).getText())) && (str_p1_1.equals(driver.findElement(By.cssSelector("s.regular-price")).getText())) && (str_p1_2.equals(driver.findElement(By.cssSelector("strong.campaign-price")).getText())))
            System.out.println("\nEdge: Cтраницы \"Yellow Duck\" совпадают");
        else
            System.out.println("Edge: Cтраницы \"Yellow Duck\" НЕ совпадают");

        driver.get(str_a2);

        if ((str_n2.equals(driver.findElement(By.cssSelector("h1.title")).getText())) && (str_p2.equals(driver.findElement(By.cssSelector("span.price[itemprop='price']")).getText())))
            System.out.println("Edge: Cтраницы \"Green Duck\" совпадают");
        else
            System.out.println("Edge: Cтраницы \"Green Duck\" НЕ совпадают");

        driver.quit();
    }
}
