package com.example.tasks;

import org.junit.Test;

import java.util.Random;

public class TestTask12old extends BasePage.BasePage {
//    @Before
//    public void setUp() {
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//    @After
//    public void tearDown() {
//        driver.quit();
//
//    }
    @Test
    public void Add(){
//        driver.get("http://192.168.111.16/litecart/admin/login.php");
        get("http://192.168.111.16/litecart/admin/login.php");
//        driver.manage().window().
        loginPass(driverChrome);

//        driver.findElement(By.linkText("Catalog")).click();
        clickLinkText("Catalog");
//        driver.findElement(By.partialLinkText("dd New Produc")).click();
        clickPartialLinkText("dd New Produc");
//        driver.findElement(By.cssSelector("input[data-type=\"toggle\"][value=\"1\"]")).click();
        clickCssSelector("input[data-type=\"toggle\"][value=\"1\"]");

        Random random = new Random();
        int randomNumber = random.nextInt(1000000000);

        String name = "Name" + randomNumber;

//        driver.findElement(By.cssSelector("input[name='name[en]']")).click();
        clickCssSelector("input[name='name[en]']");
//        driver.findElement(By.cssSelector("input[name='name[en]']")).sendKeys(name);
        sendKeysCssSelector("input[name='name[en]']", name);

//        driver.findElement(By.linkText("Information")).click();
        clickLinkText("Information");

//        driver.findElement(By.name("keywords")).click();
        clickName("keywords");
//        driver.findElement(By.name("keywords")).sendKeys(name);
        sendKeysName("keywords", name);

//        driver.findElement(By.linkText("Prices")).click();
        clickLinkText("Prices");

//        driver.findElement(By.name("gross_prices[USD]")).click();
        clickName("gross_prices[USD]");
//        driver.findElement(By.name("gross_prices[USD]")).sendKeys("1");
        sendKeysName("gross_prices[USD]", "1");

//        driver.findElement(By.name("save")).click();
        clickName("save");

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
