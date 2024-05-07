package com.example.tasks;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import static constants.Constant.Urls.URL_ADMIN;
import static constants.Constant.loginpswd.LOGIN_PASS;

public class TestFirefoxNightly {

    @Test
    public void Nightly() {
        System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Firefox Nightly\\firefox.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Firefox Nightly\\firefox.exe");

        WebDriver driverN = new FirefoxDriver(options);

        driverN.get(URL_ADMIN);

        driverN.manage().window().maximize();
        driverN.findElement(By.name("username")).click();
        driverN.findElement(By.name("username")).sendKeys(LOGIN_PASS);
        driverN.findElement(By.name("password")).click();
        driverN.findElement(By.name("password")).sendKeys(LOGIN_PASS);
        driverN.findElement(By.name("login")).click();

        driverN.findElement(By.xpath("//li[@id=\'app-\']/a/span[2]")).click();
        driverN.findElement(By.cssSelector("#doc-logotype .name")).click();
        driverN.findElement(By.linkText("Catalog")).click();
        driverN.findElement(By.cssSelector("#doc-product_groups .name")).click();
        driverN.findElement(By.cssSelector("#doc-option_groups .name")).click();
        driverN.findElement(By.cssSelector("#doc-manufacturers .name")).click();
        driverN.findElement(By.cssSelector("#doc-suppliers .name")).click();
        driverN.findElement(By.cssSelector("#doc-delivery_statuses .name")).click();
        driverN.findElement(By.cssSelector("#doc-sold_out_statuses .name")).click();
        driverN.findElement(By.cssSelector("#doc-quantity_units .name")).click();
        driverN.findElement(By.cssSelector("#doc-csv .name")).click();
        driverN.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[3]")).click();
        driverN.findElement(By.linkText("Currencies")).click();
        driverN.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[5]")).click();
        driverN.findElement(By.cssSelector("#doc-csv .name")).click();
        driverN.findElement(By.cssSelector("#doc-newsletter .name")).click();
        driverN.findElement(By.linkText("Geo Zones")).click();
        driverN.findElement(By.linkText("Languages")).click();
        driverN.findElement(By.cssSelector("#doc-storage_encoding .name")).click();
        driverN.findElement(By.linkText("Modules")).click();
        driverN.findElement(By.cssSelector("#doc-customer .name")).click();
        driverN.findElement(By.cssSelector("#doc-shipping .name")).click();
        driverN.findElement(By.cssSelector("#doc-payment .name")).click();
        driverN.findElement(By.cssSelector("#doc-order_total .name")).click();
        driverN.findElement(By.cssSelector("#doc-order_success .name")).click();
        driverN.findElement(By.cssSelector("#doc-order_action .name")).click();
        driverN.findElement(By.linkText("Orders")).click();
        driverN.findElement(By.cssSelector("#doc-order_statuses .name")).click();
        driverN.findElement(By.linkText("Pages")).click();
        driverN.findElement(By.linkText("Reports")).click();
        driverN.findElement(By.cssSelector("#doc-most_sold_products .name")).click();
        driverN.findElement(By.cssSelector("#doc-most_shopping_customers .name")).click();
        driverN.findElement(By.linkText("Settings")).click();
        driverN.findElement(By.linkText("Defaults")).click();
        driverN.findElement(By.linkText("General")).click();
        driverN.findElement(By.linkText("Listings")).click();
        driverN.findElement(By.linkText("Images")).click();
        driverN.findElement(By.linkText("Checkout")).click();
        driverN.findElement(By.linkText("Advanced")).click();
        driverN.findElement(By.linkText("Security")).click();
        driverN.findElement(By.linkText("Slides")).click();
        driverN.findElement(By.linkText("Tax")).click();
        driverN.findElement(By.linkText("Tax Rates")).click();
        driverN.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[15]")).click();
        driverN.findElement(By.cssSelector("#doc-scan .name")).click();
        driverN.findElement(By.cssSelector("#doc-csv .name")).click();
        driverN.findElement(By.linkText("Users")).click();
        driverN.findElement(By.linkText("vQmods")).click();
        driverN.quit();
    }
}
