package com.example.tasks;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTask19 {
    @Test
    public void Task19() {
        WebDriver driver = new ChromeDriver();

        // Открытие главной страницы
        MainPage19 mainPage = new MainPage19(driver);
        mainPage.openPage("http://192.168.111.16/litecart/en/");

        // Добавление в корзину
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();

        // Переход на страницу корзины
        driver.get("http://192.168.111.16/litecart/en/checkout");

        // Удаление товара из корзины
        CartPage cartPage = new CartPage(driver);
        cartPage.removeFromCart();

        // Закрытие браузера
        driver.quit();
    }
}
