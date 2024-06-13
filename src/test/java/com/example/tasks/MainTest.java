package com.example.tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

import static BasePage.BasePage.*;
import static constants.Constant.Urls.*;

public class MainTest {

    @Test
    public void fire() {
        driverFirefox = new FirefoxDriver();
        driverFirefox.get(URL_ADMIN);
//        driverFirefox.manage().window().setSize(new Dimension(1440, 860));
        driverFirefox.manage().window().maximize();

        loginPass(driverFirefox);

        List<String> links = new ArrayList<>();
        List<WebElement> elements = driverFirefox.findElements(By.cssSelector("li#app-"));

        // Записываем все ссылки в массив
        for (WebElement element : elements)
        {
            links.add(element.findElement(By.tagName("a")).getAttribute("href"));
        }

        for (String link : links)
        {
            driverFirefox.get(link);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

            List<WebElement> subElements = driverFirefox.findElements(By.cssSelector("li#app->ul.docs>li>a"));
            if (!subElements.isEmpty())
            {
                List<String> subLinks = new ArrayList<>(); // Очищаем массив подссылок
                for (WebElement subElement : subElements)
                {
                    subLinks.add(subElement.getAttribute("href"));
                }

                if(subLinks.size()!=1)
                {
                    for (int i = 1; i < subLinks.size(); i++)
                    {
                        driverFirefox.get(subLinks.get(i));
//                        try {
//                            Thread.sleep(1000);
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
                    }
                }
            }

        }

        /*driverFirefox.findElement(By.xpath("//li[@id=\'app-\']/a/span[2]")).click();
        driverFirefox.findElement(By.cssSelector("#doc-logotype .name")).click();
        driverFirefox.findElement(By.linkText("Catalog")).click();
        driverFirefox.findElement(By.cssSelector("#doc-product_groups .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-option_groups .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-manufacturers .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-suppliers .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-delivery_statuses .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-sold_out_statuses .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-quantity_units .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-csv .name")).click();
        driverFirefox.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[3]")).click();
        driverFirefox.findElement(By.linkText("Currencies")).click();
        driverFirefox.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[5]")).click();
        driverFirefox.findElement(By.cssSelector("#doc-csv .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-newsletter .name")).click();
        driverFirefox.findElement(By.linkText("Geo Zones")).click();
        driverFirefox.findElement(By.linkText("Languages")).click();
        driverFirefox.findElement(By.cssSelector("#doc-storage_encoding .name")).click();
        driverFirefox.findElement(By.linkText("Modules")).click();
        driverFirefox.findElement(By.cssSelector("#doc-customer .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-shipping .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-payment .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-order_total .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-order_success .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-order_action .name")).click();
        driverFirefox.findElement(By.linkText("Orders")).click();
        driverFirefox.findElement(By.cssSelector("#doc-order_statuses .name")).click();
        driverFirefox.findElement(By.linkText("Pages")).click();
        driverFirefox.findElement(By.linkText("Reports")).click();
        driverFirefox.findElement(By.cssSelector("#doc-most_sold_products .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-most_shopping_customers .name")).click();
        driverFirefox.findElement(By.linkText("Settings")).click();
        driverFirefox.findElement(By.linkText("Defaults")).click();
        driverFirefox.findElement(By.linkText("General")).click();
        driverFirefox.findElement(By.linkText("Listings")).click();
        driverFirefox.findElement(By.linkText("Images")).click();
        driverFirefox.findElement(By.linkText("Checkout")).click();
        driverFirefox.findElement(By.linkText("Advanced")).click();
        driverFirefox.findElement(By.linkText("Security")).click();
        driverFirefox.findElement(By.linkText("Slides")).click();
        driverFirefox.findElement(By.linkText("Tax")).click();
        driverFirefox.findElement(By.linkText("Tax Rates")).click();
        driverFirefox.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[15]")).click();
        driverFirefox.findElement(By.cssSelector("#doc-scan .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-csv .name")).click();
        driverFirefox.findElement(By.linkText("Users")).click();
        driverFirefox.findElement(By.linkText("vQmods")).click();*/
        driverFirefox.quit();
    }

    @Test
    public void Edge() {
        driverEdge = new EdgeDriver();
        driverEdge.get(URL_ADMIN);
//        driverEdge.manage().window().setSize(new Dimension(1440, 860));
        driverEdge.manage().window().maximize();
        loginPass(driverEdge);

        driverEdge.findElement(By.xpath("//li[@id=\'app-\']/a/span[2]")).click();
        driverEdge.findElement(By.cssSelector("#doc-logotype .name")).click();
        driverEdge.findElement(By.linkText("Catalog")).click();
        driverEdge.findElement(By.cssSelector("#doc-product_groups .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-option_groups .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-manufacturers .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-suppliers .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-delivery_statuses .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-sold_out_statuses .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-quantity_units .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-csv .name")).click();
        driverEdge.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[3]")).click();
        driverEdge.findElement(By.linkText("Currencies")).click();
        driverEdge.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[5]")).click();
        driverEdge.findElement(By.cssSelector("#doc-csv .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-newsletter .name")).click();
        driverEdge.findElement(By.linkText("Geo Zones")).click();
        driverEdge.findElement(By.linkText("Languages")).click();
        driverEdge.findElement(By.cssSelector("#doc-storage_encoding .name")).click();
        driverEdge.findElement(By.linkText("Modules")).click();
        driverEdge.findElement(By.cssSelector("#doc-customer .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-shipping .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-payment .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-order_total .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-order_success .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-order_action .name")).click();
        driverEdge.findElement(By.linkText("Orders")).click();
        driverEdge.findElement(By.cssSelector("#doc-order_statuses .name")).click();
        driverEdge.findElement(By.linkText("Pages")).click();
        driverEdge.findElement(By.linkText("Reports")).click();
        driverEdge.findElement(By.cssSelector("#doc-most_sold_products .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-most_shopping_customers .name")).click();
        driverEdge.findElement(By.linkText("Settings")).click();
        driverEdge.findElement(By.linkText("Defaults")).click();
        driverEdge.findElement(By.linkText("General")).click();
        driverEdge.findElement(By.linkText("Listings")).click();
        driverEdge.findElement(By.linkText("Images")).click();
        driverEdge.findElement(By.linkText("Checkout")).click();
        driverEdge.findElement(By.linkText("Advanced")).click();
        driverEdge.findElement(By.linkText("Security")).click();
        driverEdge.findElement(By.linkText("Slides")).click();
        driverEdge.findElement(By.linkText("Tax")).click();
        driverEdge.findElement(By.linkText("Tax Rates")).click();
        driverEdge.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[15]")).click();
        driverEdge.findElement(By.cssSelector("#doc-scan .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-csv .name")).click();
        driverEdge.findElement(By.linkText("Users")).click();
        driverEdge.findElement(By.linkText("vQmods")).click();
        driverEdge.quit();
    }
}