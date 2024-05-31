package com.example.tasks;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static constants.Constant.Urls.URL_ADMIN;

public class TestAbc extends BasePage.BasePage{

    @Test
    public void Country() {

        driverChrome = new ChromeDriver();
        get(URL_ADMIN + "?app=countries&doc=countries");
        loginPassChrome();

        List<String> countries = new ArrayList<>();
        List<String> countriesWithZones = new ArrayList<>();

        List<WebElement> countryRows = driverChrome.findElements(By.cssSelector("table tr.row"));

        for (WebElement row : countryRows) {
            WebElement countryLink = row.findElement(By.cssSelector("td:nth-child(5) a"));
            countries.add(countryLink.getText());

            int zoneCount = Integer.parseInt(row.findElement(By.cssSelector("td:nth-child(6)")).getText());
            if (zoneCount > 0) {
                String countryLinkUrl = row.findElement(By.cssSelector("td:nth-child(5) a")).getAttribute("href");
                countriesWithZones.add(countryLinkUrl);
            }
        }

        List<String> sortedCountries = new ArrayList<>(countries);
        Collections.sort(sortedCountries);

        if (countries.equals(sortedCountries)) {
            System.out.println("Страны расположены в алфавитном порядке.");
        } else {
            System.out.println("Страны НЕ расположены в алфавитном порядке.");
        }

        for (String countryUrl : countriesWithZones) {
            get(countryUrl);


            //WebElement inpEl = driverChrome.findElement(By.cssSelector("#content > form > table:nth-child(2) > tbody > tr:nth-child(4) > td > input[type=text]"));
            //WebElement inpEl = driverChrome.findElement(By.xpath("//td[@id=\"content\"]/form/table[1]/tbody/tr[4]/td/input"));
            WebElement inpEl = driverChrome.findElement(By.xpath("//td[@id=\"content\"]//tr[4]//input"));
            //WebElement inpEl = driverChrome.findElement(By.xpath("//input[@value=\"United States\"]"));
            //WebElement inpEl = driverChrome.findElement(By.xpath("//input[@value='United States']"));
            String str = inpEl.getAttribute("value");
            List<String> names = new ArrayList<>();

            List<WebElement> nameInputs = driverChrome.findElements(By.cssSelector("table#table-zones input[name^='zones'][name$='[name]']"));

            for (WebElement nameInput : nameInputs) {
                String name = nameInput.getAttribute("value");
                names.add(name);
            }

            List<String> sortedNames = new ArrayList<>(names);
            Collections.sort(sortedNames);

            if (names.equals(sortedNames))
                {
                System.out.println("Геозоны для страны под названием \"" + str + "\" на странице " + countryUrl + " расположены в алфавитном порядке.");
                }
            else
                {
                System.out.println("Геозоны для страны под названием \"" + str + "\" на странице " + countryUrl + " НЕ расположены в алфавитном порядке.");
                }
            }

            driverChrome.quit();

    }
}
