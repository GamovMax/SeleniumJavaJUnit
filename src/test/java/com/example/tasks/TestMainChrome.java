package com.example.tasks;

import org.junit.Test;
import static constants.Constant.Urls.URL_ADMIN;

public class TestMainChrome extends BasePage.BasePage{

    @Test
    public void testMethod() {
        get("https://translate.yandex.ru/?source_lang=en&target_lang=ru");
        wait(2000);
        //maximize();
        wait(2000);
        clickCssSelector(".verticalMenuNavItem:nth-child(2)");
        wait(2000);
        clickCssSelector(".verticalMenuNavItem:nth-child(3)");
        wait(2000);
        clickCssSelector(".verticalMenuNavItem:nth-child(4)");
        wait(2000);
        clickCssSelector(".verticalMenuNavItem:nth-child(5)");
        wait(2000);
        clickCssSelector(".verticalMenuNavItem:nth-child(6)");
        wait(2000);
    }

    @Test
    public void test1() {
        get(URL_ADMIN);
        loginPassChrome();
        clickXpath("//li[@id=\'app-\']/a/span[2]");
        clickCssSelector("#doc-logotype .name");
        clickLinkText("Catalog");        
        clickCssSelector("#doc-product_groups .name");
        clickCssSelector("#doc-option_groups .name");
        clickCssSelector("#doc-manufacturers .name");
        clickCssSelector("#doc-suppliers .name");
        clickCssSelector("#doc-delivery_statuses .name");
        clickCssSelector("#doc-sold_out_statuses .name");
        clickCssSelector("#doc-quantity_units .name");
        clickCssSelector("#doc-csv .name");
        clickXpath("(//li[@id=\'app-\']/a/span[2])[3]");
        clickLinkText("Currencies");        
        clickXpath("(//li[@id=\'app-\']/a/span[2])[5]");
        clickCssSelector("#doc-csv .name");
        clickCssSelector("#doc-newsletter .name");
        clickLinkText("Geo Zones");
        clickLinkText("Languages");
        clickCssSelector("#doc-storage_encoding .name");
        clickLinkText("Modules");
        clickCssSelector("#doc-customer .name");
        clickCssSelector("#doc-shipping .name");
        clickCssSelector("#doc-payment .name");
        clickCssSelector("#doc-order_total .name");
        clickCssSelector("#doc-order_success .name");
        clickCssSelector("#doc-order_action .name");
        clickLinkText("Orders");
        clickCssSelector("#doc-order_statuses .name");
        clickLinkText("Pages");
        clickLinkText("Reports");
        clickCssSelector("#doc-most_sold_products .name");
        clickCssSelector("#doc-most_shopping_customers .name");
        clickLinkText("Settings");
        clickLinkText("Defaults");
        clickLinkText("General");
        clickLinkText("Listings");
        clickLinkText("Images");
        clickLinkText("Checkout");
        clickLinkText("Advanced");
        clickLinkText("Security");
        clickLinkText("Slides");
        clickLinkText("Tax");
        clickLinkText("Tax Rates");
        clickXpath("(//li[@id=\'app-\']/a/span[2])[15]");
        clickCssSelector("#doc-scan .name");
        clickCssSelector("#doc-csv .name");
        clickLinkText("Users");
        clickLinkText("vQmods");
    }


    @Test
    public void test2() {
        get(URL_ADMIN + "login.php");
        //maximize();
        wait(2000);
        //maximize();
        wait(2000);
        loginPassChrome();
    }
}