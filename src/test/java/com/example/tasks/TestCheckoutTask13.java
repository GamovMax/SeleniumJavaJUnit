package com.example.tasks;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

import static constants.Constant.Urls.URL_CLIENT;

public class TestCheckoutTask13 extends BasePage.BasePage {

    @Test
    public void Checkout(){

        get(URL_CLIENT);
        maximize();

        for (int i=1; i<4; i++)
        {
            click_cssSelector("li>a.link");

            try {
                if (driver.findElement(By.name("options[Size]")).isDisplayed()) {
                    click_name("options[Size]");
                    driver.findElement(By.name("options[Size]")).sendKeys(Keys.ARROW_DOWN);
                    driver.findElement(By.name("options[Size]")).sendKeys(Keys.ENTER);
                    click_name("add_cart_product");
                }
            } catch (NoSuchElementException e) {
                // обработка ситуации, когда элемент не был найден
                click_name("add_cart_product");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            click_linkText("Home");
        }

        click_partialLinkText("Checkout");

        click_cssSelector("ul.shortcuts>li:nth-child(1)");

        for (int i=1; i<4; i++)
        {
            click_name("remove_cart_item");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
