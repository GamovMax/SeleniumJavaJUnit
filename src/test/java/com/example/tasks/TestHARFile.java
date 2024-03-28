package com.example.tasks;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import org.junit.Test;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class TestHARFile {
    @Test
    public <ChromeDevToolsService> void HARFile() throws IOException
    {
        BrowserMobProxy proxy = new BrowserMobProxyServer();
        proxy.start(0);

        Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);

        ChromeOptions options = new ChromeOptions();
        options.setProxy(seleniumProxy);

        WebDriver driver = new ChromeDriver(options);

        try {
            // Ваш код автотеста здесь

            // Пример теста, который вызывает исключение
            driver.get("http://192.168.111.16/litecart/en/");
            throw new RuntimeException("Тест упал");

        } catch (Exception e) {
            proxy.newHar("failedTest");
            proxy.endHar();
            proxy.stop();
            driver.quit();}
    }
}
