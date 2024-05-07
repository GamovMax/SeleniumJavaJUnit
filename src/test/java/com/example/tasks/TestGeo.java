package com.example.tasks;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;
import static constants.Constant.Urls.URL_ADMIN;
import static constants.Constant.loginpswd.LOGIN_PASS;

public class TestGeo{

    @Test
    public void Geo() {
        WebDriver driver = new ChromeDriver();

        driver.get(URL_ADMIN + "?app=geo_zones&doc=geo_zones");

        driver.manage().window().maximize();

        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).sendKeys(LOGIN_PASS);
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys(LOGIN_PASS);
        driver.findElement(By.name("login")).click();

        // Находим все ссылки на страны
        List<WebElement> countryLinks = driver.findElements(By.xpath("//td[@id=\"content\"]//td[3]/a"));
        List<String> countryURLs = new ArrayList<>();
        for (WebElement link : countryLinks) {
            countryURLs.add(link.getAttribute("href"));
        }

        // Проверяем каждую страну
        for (String url : countryURLs) {
            driver.get(url);

            // Находим все геозоны для данной страны
            List<WebElement> zones = driver.findElements(By.cssSelector("table#table-zones tr:not(.header):not(.footer)"));
            List<String> zoneNames = new ArrayList<>();
            for (WebElement zone : zones) {
                zoneNames.add(zone.findElement(By.xpath("//*[@id=\"table-zones\"]/tbody/tr/td[3]/select")).getText().trim());
            }

            // Проверяем, что зоны расположены в алфавитном порядке
            boolean sorted = true;
            for (int i = 1; i < zoneNames.size(); i++) {
                if (zoneNames.get(i - 1).compareTo(zoneNames.get(i)) > 0) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                System.out.println("Для страны под названием \"" + driver.findElement(By.xpath("//td[@id=\"content\"]//tr[1]//input")).getAttribute("value") + "\" геозоны расположены в алфавитном порядке.");
            } else {
                System.out.println("Для страны под названием \"" + driver.findElement(By.xpath("//td[@id=\"content\"]//tr[1]//input")).getAttribute("value") + "\" геозоны НЕ расположены в алфавитном порядке.");
            }
        }
        driver.quit();
    }
}
