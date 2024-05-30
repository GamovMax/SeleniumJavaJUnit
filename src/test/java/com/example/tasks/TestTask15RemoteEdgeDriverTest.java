package com.example.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TestTask15RemoteEdgeDriverTest {
    public static void main(String[] args) {
        WebDriver driver;
//        FirefoxOptions firefoxOptions = new FirefoxOptions();
        EdgeOptions edgeOptions = new EdgeOptions();

        // Указываем адрес удаленного узла Selenium Grid
        String gridUrl = "http://192.168.111.31:4444/wd/hub";

        try {
            // Инициализация драйвера для браузера Mozilla Firefox на удаленном узле
//            driver = new RemoteWebDriver(new URL(gridUrl), firefoxOptions);
            driver = new RemoteWebDriver(new URL(gridUrl), edgeOptions);

            driver.manage().window().maximize();
            driver.get("https://www.google.com");

            // Дополнительные шаги теста
            System.out.println(driver.getTitle());

            // Закрытие браузера и завершение сеанса
            driver.quit();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
