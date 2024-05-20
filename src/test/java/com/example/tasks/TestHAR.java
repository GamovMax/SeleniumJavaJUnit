package com.example.tasks;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import org.junit.Test;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TestHAR {


    @Test
    public void HAR() throws IOException {

        BrowserMobProxy proxy = new BrowserMobProxyServer();
        proxy.start(0);

        Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);

        ChromeDriver driver = new ChromeDriver(); // Инициализируем Chrome driver

        proxy.newHar("example"); // Начинаем запись HAR

        // Здесь выполняются ваши тестовые действия с Selenium WebDriver

        // Пример падения теста
        try {
            driver.get("http://192.168.111.16/litecart/en/");
            driver.manage().window().maximize();


            // Simulate test failure
            throw new Exception("Test failure");
        } catch (Exception e) {
            // Обработка ошибки, например, сохранение HAR-файла
            try {
                proxy.getHar().writeTo(new File("test_failure.har"));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

        driver.quit(); // Закрываем браузер
        proxy.stop(); // Останавливаем BrowserMob Proxy
    }
}
