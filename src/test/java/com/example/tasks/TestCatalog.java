package com.example.tasks;
import org.junit.Test;
import static constants.Constant.Urls.URL_CLIENT;

public class TestCatalog extends BasePage.BasePage {

    @Test
    public void Heading() {
        get(URL_CLIENT);

        findElementXpath("//div[@id=\"box-most-popular\"]/div/ul/li[1]/a[1]/div[1]/div");
        findElementXpath("//div[@id=\"box-most-popular\"]/div/ul/li[2]/a[1]/div[1]/div");
        findElementXpath("//div[@id=\"box-most-popular\"]/div/ul/li[3]/a[1]/div[1]/div");
        findElementXpath("//div[@id=\"box-most-popular\"]/div/ul/li[4]/a[1]/div[1]/div");
        findElementXpath("//div[@id=\"box-most-popular\"]/div/ul/li[5]/a[1]/div[1]/div");
    }
}