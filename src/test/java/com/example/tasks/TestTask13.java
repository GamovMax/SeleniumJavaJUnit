package com.example.tasks;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import static constants.Constant.Urls.URL_CLIENT;

public class TestTask13 extends BasePage.BasePage {

    @Test
    public void Task13(){
        get(URL_CLIENT);
        for (int i = 1; i < 4; i++)
        {
            clickCssSelector("li>a.link");
            try {
                if (isDisplayedName("options[Size]")) {
                    clickName("options[Size]");
                    pressDown("options[Size]");
                    pressEnter("options[Size]");
                    clickName("add_cart_product");
                }
            } catch (NoSuchElementException e) {
                // обработка ситуации, когда элемент не был найден
                clickName("add_cart_product");
            }
            wait(1000);
            clickLinkText("Home");
        }

        clickPartialLinkText("Checkout");
//        clickCssSelector("ul.shortcuts>li:nth-child(1)");

        for (int i = 1; i < 4; i++)
        {
            try {
                wait(1900);
                clickName("remove_cart_item");
            }
            catch (Exception e){

                try {
                    driverChrome.findElement(By.linkText("<< Back")).click();
                }
                catch (Exception a){
                    clickPartialLinkText("Checkout");
                }
            }

        }

        wait(3000);
    }
}