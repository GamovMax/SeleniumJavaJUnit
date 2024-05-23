package com.example.tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private final WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void removeFromCart() {
        for (int i = 1; i < 4; i++)
        {
            try {
                try {
                    Thread.sleep(1900);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                driver.findElement(By.name("remove_cart_item")).click();
            }
            catch (Exception e){

                try {
                    driver.findElement(By.linkText("<< Back")).click();
                }
                catch (Exception a){
                    driver.findElement(By.partialLinkText("Checkout")).click();
                }
            }

        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
