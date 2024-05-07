package com.example.tasks;

import org.junit.Test;
import static constants.Constant.Urls.URL_ADMIN;

public class TestHeading extends BasePage.BasePage {

    @Test
    public void Heading() {
        
        get(URL_ADMIN);
        maximize();
        loginPass();
        click_xpath("//li[@id=\'app-\']/a/span[2]");
        findElement_cssSelector("h1");
        click_cssSelector("#doc-logotype .name");
        findElement_cssSelector("h1");
        click_linkText("Catalog");
        findElement_cssSelector("h1");
        click_cssSelector("#doc-product_groups .name");
        findElement_cssSelector("h1");
        click_cssSelector("#doc-option_groups .name");
        findElement_cssSelector("h1");
        click_cssSelector("#doc-manufacturers .name");
        findElement_cssSelector("h1");
        click_linkText("Suppliers");
        findElement_cssSelector("h1");
        click_linkText("Delivery Statuses");
        findElement_cssSelector("h1");
        click_linkText("Sold Out Statuses");
        findElement_cssSelector("h1");
        click_linkText("Quantity Units");
        findElement_cssSelector("h1");
        click_linkText("CSV Import/Export");
        findElement_cssSelector("h1");
        click_xpath("(//li[@id=\'app-\']/a/span[2])[3]");
        findElement_cssSelector("h1");
        click_linkText("Currencies");
        findElement_cssSelector("h1");
        click_linkText("Customers");
        findElement_cssSelector("h1");
        click_cssSelector("#doc-csv .name");
        findElement_cssSelector("h1");
        click_linkText("Newsletter");
        findElement_cssSelector("h1");
        click_linkText("Geo Zones");
        findElement_cssSelector("h1");
        click_linkText("Languages");
        findElement_cssSelector("h1");
        click_linkText("Storage Encoding");
        findElement_cssSelector("h1");
        click_linkText("Modules");
        findElement_cssSelector("h1");
        click_linkText("Customer");
        findElement_cssSelector("h1");
        click_linkText("Shipping");
        findElement_cssSelector("h1");
        click_linkText("Payment");
        findElement_cssSelector("h1");
        click_linkText("Order Total");
        findElement_cssSelector("h1");
        click_linkText("Order Success");
        findElement_cssSelector("h1");
        click_linkText("Order Action");
        findElement_cssSelector("h1");
        click_linkText("Orders");
        click_id("content");
        click_linkText("Order Statuses");
        findElement_cssSelector("h1");
        click_linkText("Pages");
        findElement_cssSelector("h1");
        click_linkText("Reports");
        findElement_cssSelector("h1");
        click_linkText("Most Sold Products");
        findElement_cssSelector("h1");
        click_linkText("Most Shopping Customers");
        findElement_cssSelector("h1");
        click_linkText("Settings");
        findElement_cssSelector("h1");
        click_linkText("Defaults");
        findElement_cssSelector("h1");
        click_linkText("General");
        findElement_cssSelector("h1");
        click_linkText("Listings");
        findElement_cssSelector("h1");
        click_linkText("Images");
        findElement_cssSelector("h1");
        click_linkText("Checkout");
        findElement_cssSelector("h1");
        click_linkText("Advanced");
        findElement_cssSelector("h1");
        click_linkText("Security");
        findElement_cssSelector("h1");
        click_linkText("Slides");
        findElement_cssSelector("h1");
        click_linkText("Tax");
        findElement_cssSelector("h1");
        click_cssSelector("#doc-tax_rates .name");
        findElement_cssSelector("h1");
        click_linkText("Translations");
        findElement_cssSelector("h1");
        click_cssSelector("#doc-scan .name");
        findElement_cssSelector("h1");
        click_linkText("CSV Import/Export");
        findElement_cssSelector("h1");
        click_linkText("Users");
        findElement_cssSelector("h1");
        click_linkText("vQmods");
        findElement_cssSelector("h1");       
    }
}