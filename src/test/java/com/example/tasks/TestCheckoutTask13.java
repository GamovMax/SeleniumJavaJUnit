package com.example.tasks;
import org.junit.Test;
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
                if (is_displayed("options[Size]")) {
                    click_name("options[Size]");
                    press_down("options[Size]");
                    press_enter("options[Size]");
                    click_name("add_cart_product");
                }
            } catch (NoSuchElementException e) {
                // обработка ситуации, когда элемент не был найден
                click_name("add_cart_product");
            }
            wait(1000);
            click_linkText("Home");
        }

        click_partialLinkText("Checkout");
        click_cssSelector("ul.shortcuts>li:nth-child(1)");
        for (int i=1; i<4; i++)
        {
            click_name("remove_cart_item");
            wait(3000);
        }
    }
}
