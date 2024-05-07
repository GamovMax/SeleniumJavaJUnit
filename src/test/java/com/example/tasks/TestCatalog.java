package com.example.tasks;
import org.junit.Test;

public class TestCatalog extends BasePage.BasePage {

    @Test
    public void Heading() {
        get("http://192.168.111.16/litecart/en/");
        maximize();
        findElement_xpath("//div[@id=\"box-most-popular\"]/div/ul/li[1]/a[1]/div[1]/div");
        findElement_xpath("//div[@id=\"box-most-popular\"]/div/ul/li[2]/a[1]/div[1]/div");
        findElement_xpath("//div[@id=\"box-most-popular\"]/div/ul/li[3]/a[1]/div[1]/div");
        findElement_xpath("//div[@id=\"box-most-popular\"]/div/ul/li[4]/a[1]/div[1]/div");
        findElement_xpath("//div[@id=\"box-most-popular\"]/div/ul/li[5]/a[1]/div[1]/div");
    }
}
