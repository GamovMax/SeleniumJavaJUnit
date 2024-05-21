package com.example.tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestTask18 {
    @Test
    public void Task18()
    {
        // Указываем адрес и порт прокси-сервера
        String proxyServer = "localhost:8888";

        // Создаем объект Proxy и устанавливаем адрес прокси
        Proxy proxy = new Proxy();
        proxy.setHttpProxy(proxyServer);
        proxy.setSslProxy(proxyServer);

        // Настройки для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.setProxy(proxy);

        // Инициализация драйвера с настройками прокси
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        // Пример использования драйвера с прокси

        driver.get("https://translate.yandex.ru/?source_lang=en&target_lang=ru");
        driver.findElement(By.cssSelector(".verticalMenuNavItem:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".verticalMenuNavItem:nth-child(3)")).click();
        driver.findElement(By.cssSelector(".verticalMenuNavItem:nth-child(4)")).click();
        driver.findElement(By.cssSelector(".verticalMenuNavItem:nth-child(5)")).click();
        driver.findElement(By.cssSelector(".verticalMenuNavItem:nth-child(6)")).click();
        // Закрытие драйвера
        driver.quit();
    }
}
