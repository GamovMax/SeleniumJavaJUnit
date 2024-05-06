package com.example.tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.example.tasks.MainPage.driver;
import static com.example.tasks.MainPage.loginPass;

public class TestHeading {


    @Test
    public void Heading() {

        driver = new ChromeDriver();
        driver.get("http://192.168.111.16/litecart/admin/");
        driver.manage().window().maximize();

        loginPass();

        driver.findElement(By.xpath("//li[@id=\'app-\']/a/span[2]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-logotype .name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Catalog")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-product_groups .name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-option_groups .name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-manufacturers .name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Suppliers")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Delivery Statuses")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Sold Out Statuses")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Quantity Units")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("CSV Import/Export")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[3]")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Currencies")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Customers")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-csv .name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Newsletter")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Geo Zones")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Languages")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Storage Encoding")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Modules")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Customer")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Shipping")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Payment")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Order Total")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Order Success")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Order Action")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Orders")).click();
        driver.findElement(By.id("content")).click();
        driver.findElement(By.linkText("Order Statuses")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Pages")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Reports")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Most Sold Products")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Most Shopping Customers")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Settings")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Defaults")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("General")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Listings")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Images")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Checkout")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Advanced")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Security")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Slides")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Tax")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-tax_rates .name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Translations")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#doc-scan .name")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("CSV Import/Export")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("Users")).click();
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.linkText("vQmods")).click();
        driver.findElement(By.cssSelector("h1"));

        //driver.close();
        driver.quit();
}
}