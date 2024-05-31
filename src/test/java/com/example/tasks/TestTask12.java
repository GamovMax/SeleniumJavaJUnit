package com.example.tasks;
import org.junit.Test;
import java.util.Random;

import static constants.Constant.Urls.URL_ADMIN;

public class TestTask12 extends BasePage.BasePage {

    @Test
    public void Add(){

        get(URL_ADMIN);

        loginPassChrome();

        clickLinkText("Catalog");

        clickPartialLinkText("dd New Produc");

        clickCssSelector("input[data-type=\"toggle\"][value=\"1\"]");

        Random random = new Random();
        int randomNumber = random.nextInt(1000000000);

        String name = "Name" + randomNumber;

        clickCssSelector("input[name='name[en]']");
        sendKeysCssSelector("input[name='name[en]']", name);

        clickLinkText("Information");

        clickName("keywords");
        sendKeysName("keywords", name);

        clickLinkText("Prices");

        clickName("gross_prices[USD]");
        sendKeysName("gross_prices[USD]", "1");

        clickName("save");

    }
}