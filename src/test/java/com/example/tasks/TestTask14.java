package com.example.tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static constants.Constant.Urls.*;

public class TestTask14 extends BasePage.BasePage{
    @Test
    public void Task14(){

        get(URL_ADMIN);
        loginPass(driverChrome);
        clickLinkText("Countries");
        clickLinkText("Add New Country");

        // Найдем все элементы, соответствующие CSS селектору
        List<WebElement> elements = driverChrome.findElements(By.cssSelector("a[target='_blank']>i.fa-external-link"));

        for (int i = 0; i < 7; i++)
        {
            elements.get(i).click();

            // Получаем список всех вкладок
            ArrayList<String> tabs = new ArrayList<>(driverChrome.getWindowHandles());

            // Закрываем вторую вкладку
            driverChrome.switchTo().window(tabs.get(1));

            if (i!=3)
                {driverChrome.findElement(By.cssSelector("a.mw-logo"));}
            else
                {driverChrome.findElement(By.className("infa-h-logo"));}

            driverChrome.close();

            // Переключаемся на первую вкладку
            driverChrome.switchTo().window(tabs.get(0));
        }
    }
}
