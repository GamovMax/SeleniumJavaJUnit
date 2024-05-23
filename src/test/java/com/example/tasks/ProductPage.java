package com.example.tasks;

import org.openqa.selenium.*;

public class ProductPage {

    private final WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        for (int i = 1; i < 4; i++)
        {
            driver.findElement(By.cssSelector("li>a.link")).click();
            try {
                if (driver.findElement(By.name("options[Size]")).isDisplayed()) {
                    driver.findElement(By.name("options[Size]")).click();
                    driver.findElement(By.name("options[Size]")).sendKeys(Keys.ARROW_DOWN);
                    driver.findElement(By.name("options[Size]")).sendKeys(Keys.ENTER);
                    driver.findElement(By.name("add_cart_product")).click();
                }
            } catch (NoSuchElementException e) {
                // обработка ситуации, когда элемент не был найден
                driver.findElement(By.name("add_cart_product")).click();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.linkText("Home")).click();
        }
    }
}
