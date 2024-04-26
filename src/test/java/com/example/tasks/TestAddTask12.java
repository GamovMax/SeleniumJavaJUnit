package com.example.tasks;
import org.junit.Test;
import java.util.Random;

import static constants.Constant.Urls.URL_ADMIN;

public class TestAddTask12 extends BasePage.BasePage {

    @Test
    public void Add(){

        get(URL_ADMIN);

        maximize();
        loginPass();

        click_linkText("Catalog");

        click_partialLinkText("dd New Produc");

        click_cssSelector("input[data-type=\"toggle\"][value=\"1\"]");

        Random random = new Random();
        int randomNumber = random.nextInt(1000000000);

        String name = "Name" + randomNumber;

        click_cssSelector("input[name='name[en]']");
        sendKeys_cssSelector("input[name='name[en]']", name);

        click_linkText("Information");

        click_name("keywords");
        sendKeys_name("keywords", name);

        click_linkText("Prices");

        click_name("gross_prices[USD]");
        sendKeys_name("gross_prices[USD]", "1");

        click_name("save");

    }
}
