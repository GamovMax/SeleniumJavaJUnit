package com.example.tasks;

import org.junit.Test;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.logging.Level;

public class TestTask17 extends BasePage.BasePage {

    @Test
    public void Task17()
    {
        get("http://192.168.111.16/litecart/admin/?app=catalog&doc=catalog&category_id=1");
        loginPass();
        click_linkText("Blue Duck");
        back();
        click_linkText("Green Duck");
        back();
        click_linkText("Purple Duck");
        back();
        click_linkText("Red Duck");
        back();
        click_linkText("Yellow Duck");
        back();
        click_linkText("Duck new");
        back();
        click_linkText("Duck new_551");
        back();
        click_linkText("Test_Alien");
        back();
        click_linkText("Test_Alien_");
        back();

        // Получить логи браузера определенного типа (например, LogType.BROWSER)
        LogEntries logs = driver.manage().logs().get(LogType.BROWSER);

        // Проверить, что в логах отсутствуют сообщения указанного уровня (например, WARNING)
        for (LogEntry entry : logs) {

            if (entry.getLevel().toString().equals("DEBUG")) {
                System.out.println("В логе найдено сообщение, используемое для отладки: " + entry.getMessage());
            }
            else if (entry.getLevel().toString().equals("INFO")) {
                System.out.println("В логе найдено информационное сообщение: " + entry.getMessage());
            }
            else if (entry.getLevel().toString().equals("WARNING")) {
                System.out.println("Найдено предупреждение в логе: " + entry.getMessage());
            }
            else if (entry.getLevel().toString().equals("ERROR")) {
                System.out.println("В логе найдено сообщение об ошибке: " + entry.getMessage());
            }
            else if (entry.getLevel().toString().equals("CRITICAL")) {
                System.out.println("В логе найдена критическая ошибка: " + entry.getMessage());
            }
            else if (entry.getLevel().toString().equals("CRITICAL")) {
                System.out.println("В логе найдена критическая ошибка: " + entry.getMessage());
            }
            else if (entry.getLevel().toString().equals("FATAL")) {
                System.out.println("В логе найдена критическая ошибка, которая приводит к аварийному завершению работы программы: " + entry.getMessage());
            }
            else if (entry.getLevel().equals(Level.SEVERE)) {
                System.out.println("Обнаружено сообщение уровня SEVERE в логе браузера: " + entry.getMessage());
                // Здесь можно добавить соответствующие действия в случае обнаружения сообщения заданного уровня
            }
            else if (entry.getLevel().equals("WARNING")) {
                System.out.println("WARNING log found: " + entry.getMessage());
                // Дополнительные действия при нахождении WARNING в логе
            }

        }

//        wait(9000);
    }
}