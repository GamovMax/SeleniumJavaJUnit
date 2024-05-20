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
        click_cssSelector(".verticalMenuNavItem:nth-child(2)");
        wait(2000);
        click_cssSelector(".verticalMenuNavItem:nth-child(3)");
        wait(2000);
        click_cssSelector(".verticalMenuNavItem:nth-child(4)");
        wait(2000);
        click_cssSelector(".verticalMenuNavItem:nth-child(5)");
        wait(2000);
        click_cssSelector(".verticalMenuNavItem:nth-child(6)");
        wait(2000);
    }

    @Test
    public void test1() {
        get(URL_ADMIN);
        //maximize();
        loginPass();
        click_xpath("//li[@id=\'app-\']/a/span[2]");
        click_cssSelector("#doc-logotype .name");
        click_linkText("Catalog");        
        click_cssSelector("#doc-product_groups .name");
        click_cssSelector("#doc-option_groups .name");
        click_cssSelector("#doc-manufacturers .name");
        click_cssSelector("#doc-suppliers .name");
        click_cssSelector("#doc-delivery_statuses .name");
        click_cssSelector("#doc-sold_out_statuses .name");
        click_cssSelector("#doc-quantity_units .name");
        click_cssSelector("#doc-csv .name");
        click_xpath("(//li[@id=\'app-\']/a/span[2])[3]");
        click_linkText("Currencies");        
        click_xpath("(//li[@id=\'app-\']/a/span[2])[5]");
        click_cssSelector("#doc-csv .name");
        click_cssSelector("#doc-newsletter .name");
        click_linkText("Geo Zones");
        click_linkText("Languages");
        click_cssSelector("#doc-storage_encoding .name");
        click_linkText("Modules");
        click_cssSelector("#doc-customer .name");
        click_cssSelector("#doc-shipping .name");
        click_cssSelector("#doc-payment .name");
        click_cssSelector("#doc-order_total .name");
        click_cssSelector("#doc-order_success .name");
        click_cssSelector("#doc-order_action .name");
        click_linkText("Orders");
        click_cssSelector("#doc-order_statuses .name");
        click_linkText("Pages");
        click_linkText("Reports");
        click_cssSelector("#doc-most_sold_products .name");
        click_cssSelector("#doc-most_shopping_customers .name");
        click_linkText("Settings");
        click_linkText("Defaults");
        click_linkText("General");
        click_linkText("Listings");
        click_linkText("Images");
        click_linkText("Checkout");
        click_linkText("Advanced");
        click_linkText("Security");
        click_linkText("Slides");
        click_linkText("Tax");
        click_linkText("Tax Rates");
        click_xpath("(//li[@id=\'app-\']/a/span[2])[15]");
        click_cssSelector("#doc-scan .name");
        click_cssSelector("#doc-csv .name");
        click_linkText("Users");
        click_linkText("vQmods");
    }


    @Test
    public void test2() {
        get(URL_ADMIN + "login.php");
        //maximize();
        wait(2000);
        //maximize();
        wait(2000);
        loginPass();
    }
}