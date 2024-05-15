//task15

package com.example.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class RemoteTest {
    public static void main(String[] args) {
        WebDriver driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome"); // Указываем браузер
        capabilities.setPlatform(org.openqa.selenium.Platform.WINDOWS); // Указываем платформу

        try {
            driver = new RemoteWebDriver(new URL("http://192.168.111.31:4444/wd/hub"), capabilities);
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
            System.out.println(driver.getTitle());
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}