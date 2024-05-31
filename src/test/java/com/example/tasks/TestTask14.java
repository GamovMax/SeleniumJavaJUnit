//        !!!Сделать цикл с параметром (for)!!!

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

//        !!!Сделать цикл с параметром (for)!!!

        get(URL_ADMIN);
        loginPassChrome();
        clickLinkText("Countries");
        clickLinkText("Add New Country");

        // Найдем все элементы, соответствующие CSS селектору
        List<WebElement> elements = driverChrome.findElements(By.cssSelector("a[target='_blank']>i.fa-external-link"));

        elements.get(0).click();

        // Получаем список всех вкладок
        ArrayList<String> tabs = new ArrayList<>(driverChrome.getWindowHandles());

        // Закрываем вторую вкладку
        driverChrome.switchTo().window(tabs.get(1));
        driverChrome.findElement(By.cssSelector("a.mw-logo"));
        driverChrome.close();

        // Переключаемся на первую вкладку
        driverChrome.switchTo().window(tabs.get(0));

//---------------------------------------------------------------------------
//---------------------------------------------------------------------------

        elements.get(1).click();

        // Получаем список всех вкладок
        tabs = new ArrayList<>(driverChrome.getWindowHandles());

        // Закрываем вторую вкладку
        driverChrome.switchTo().window(tabs.get(1));
        driverChrome.findElement(By.cssSelector("a.mw-logo"));
        driverChrome.close();

        // Переключаемся на первую вкладку
        driverChrome.switchTo().window(tabs.get(0));

//---------------------------------------------------------------------------
//---------------------------------------------------------------------------

        elements.get(2).click();

        // Получаем список всех вкладок
        tabs = new ArrayList<>(driverChrome.getWindowHandles());

        // Закрываем вторую вкладку
        driverChrome.switchTo().window(tabs.get(1));
        driverChrome.findElement(By.cssSelector("a.mw-logo"));
        driverChrome.close();

        // Переключаемся на первую вкладку
        driverChrome.switchTo().window(tabs.get(0));

//---------------------------------------------------------------------------
//---------------------------------------------------------------------------

        elements.get(3).click();

        // Получаем список всех вкладок
        tabs = new ArrayList<>(driverChrome.getWindowHandles());

        // Закрываем вторую вкладку
        driverChrome.switchTo().window(tabs.get(1));
        driverChrome.findElement(By.className("infa-h-logo"));
        driverChrome.close();

        // Переключаемся на первую вкладку
        driverChrome.switchTo().window(tabs.get(0));

//---------------------------------------------------------------------------
//---------------------------------------------------------------------------

        elements.get(4).click();

        // Получаем список всех вкладок
        tabs = new ArrayList<>(driverChrome.getWindowHandles());

        // Закрываем вторую вкладку
        driverChrome.switchTo().window(tabs.get(1));
        driverChrome.findElement(By.cssSelector("a.mw-logo"));
        driverChrome.close();

        // Переключаемся на первую вкладку
        driverChrome.switchTo().window(tabs.get(0));

//---------------------------------------------------------------------------
//---------------------------------------------------------------------------

        elements.get(5).click();

        // Получаем список всех вкладок
        tabs = new ArrayList<>(driverChrome.getWindowHandles());

        // Закрываем вторую вкладку
        driverChrome.switchTo().window(tabs.get(1));
        driverChrome.findElement(By.cssSelector("a.mw-logo"));
        driverChrome.close();

        // Переключаемся на первую вкладку
        driverChrome.switchTo().window(tabs.get(0));

//---------------------------------------------------------------------------
//---------------------------------------------------------------------------

        elements.get(6).click();

        // Получаем список всех вкладок
        tabs = new ArrayList<>(driverChrome.getWindowHandles());

        // Закрываем вторую вкладку
        driverChrome.switchTo().window(tabs.get(1));
        driverChrome.findElement(By.cssSelector("a.mw-logo"));
        driverChrome.close();

        // Переключаемся на первую вкладку
        driverChrome.switchTo().window(tabs.get(0));

    }
}
