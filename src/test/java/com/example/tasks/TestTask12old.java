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
//        driver.manage().window().//maximize();
        //maximize();
        loginPass();

//        driver.findElement(By.linkText("Catalog")).click();
        click_linkText("Catalog");
//        driver.findElement(By.partialLinkText("dd New Produc")).click();
        click_partialLinkText("dd New Produc");
//        driver.findElement(By.cssSelector("input[data-type=\"toggle\"][value=\"1\"]")).click();
        click_cssSelector("input[data-type=\"toggle\"][value=\"1\"]");

        Random random = new Random();
        int randomNumber = random.nextInt(1000000000);

        String name = "Name" + randomNumber;

//        driver.findElement(By.cssSelector("input[name='name[en]']")).click();
        click_cssSelector("input[name='name[en]']");
//        driver.findElement(By.cssSelector("input[name='name[en]']")).sendKeys(name);
        sendKeys_cssSelector("input[name='name[en]']", name);

//        driver.findElement(By.linkText("Information")).click();
        click_linkText("Information");

//        driver.findElement(By.name("keywords")).click();
        click_name("keywords");
//        driver.findElement(By.name("keywords")).sendKeys(name);
        sendKeys_name("keywords", name);

//        driver.findElement(By.linkText("Prices")).click();
        click_linkText("Prices");

//        driver.findElement(By.name("gross_prices[USD]")).click();
        click_name("gross_prices[USD]");
//        driver.findElement(By.name("gross_prices[USD]")).sendKeys("1");
        sendKeys_name("gross_prices[USD]", "1");

//        driver.findElement(By.name("save")).click();
        click_name("save");

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
