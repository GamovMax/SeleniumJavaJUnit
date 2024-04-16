package com.example.tasks;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Random;
import java.util.concurrent.TimeUnit;

import static com.example.tasks.MainPage.*;

public class TestReg {

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
    public void Reg()
    {
        driver.get("http://192.168.111.16/litecart/en/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("form[name='login_form'] > table > tbody > tr:nth-child(5) > td > a")).click();

        driver.findElement(By.cssSelector("input[name='firstname']")).click();
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("1");

        driver.findElement(By.cssSelector("input[name='lastname']")).click();
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("2");

        driver.findElement(By.cssSelector("input[name='address1']")).click();
        driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("3");

        driver.findElement(By.cssSelector("input[name='postcode']")).click();
        driver.findElement(By.cssSelector("input[name='postcode']")).sendKeys("36601");

        driver.findElement(By.cssSelector("input[name='city']")).click();
        driver.findElement(By.cssSelector("input[name='city']")).sendKeys("4");

//        driver.findElement(By.cssSelector("span.selection")).click();
        driver.findElement(By.className("selection")).click();

//        driver.findElement(By.cssSelector("input.select2-search__field")).click();
//        driver.findElement(By.cssSelector("input.select2-search__field")).sendKeys("United States");
//        driver.findElement(By.cssSelector("input.select2-search__field")).sendKeys(Keys.ENTER);

        driver.findElement(By.className("select2-search__field")).click();
        driver.findElement(By.className("select2-search__field")).sendKeys("United States");
//        driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
        driver.findElement(By.className("select2-results__option--highlighted")).click();

        Random random = new Random();
        int randomNumber = random.nextInt(1000000000);

        String email = randomNumber + "@gmail.com";

        driver.findElement(By.cssSelector("input[name='email']")).click();
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys(email);

        driver.findElement(By.cssSelector("input[name='phone']")).click();
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("+79023455621");

        driver.findElement(By.cssSelector("input[name='password']")).click();
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("qwe123ASD");

        driver.findElement(By.cssSelector("input[name='confirmed_password']")).click();
        driver.findElement(By.cssSelector("input[name='confirmed_password']")).sendKeys("qwe123ASD");

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        driver.findElement(By.cssSelector("button[name='create_account']")).click();

        driver.findElement(By.cssSelector("div>ul.list-vertical>li:nth-child(4)>a")).click();

        driver.findElement(By.cssSelector("input[name='email']")).click();
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys(email);

        driver.findElement(By.cssSelector("input[name='password']")).click();
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("qwe123ASD");

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        driver.findElement(By.cssSelector("button[name='login']")).click();

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        driver.findElement(By.cssSelector("div>ul.list-vertical>li:nth-child(4)>a")).click();

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
