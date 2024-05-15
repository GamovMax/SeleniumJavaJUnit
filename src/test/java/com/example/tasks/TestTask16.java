package com.example.tasks;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class TestTask16 {
    public static final String USERNAME = "bsuser_doJhCO";
    public static final String AUTOMATE_KEY = "vvqJoX44UpCpfbdeC6K2";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    WebDriver driver;

    @Test
    public void testChromeMac() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome"); // Указываем браузер
        capabilities.setPlatform(org.openqa.selenium.Platform.MAC); // Указываем платформу

        driver = new RemoteWebDriver(new URL(URL), capabilities);

        // Ваш тестовый сценарий
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());

        driver.quit();
    }

    @Test
    public void testChromeWindows() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome"); // Указываем браузер
        capabilities.setPlatform(org.openqa.selenium.Platform.WINDOWS); // Указываем платформу

        driver = new RemoteWebDriver(new URL(URL), capabilities);

        // Ваш тестовый сценарий
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());

        driver.quit();
    }

    @Test
    public void testFirefoxWindows() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox"); // Указываем браузер
        capabilities.setPlatform(org.openqa.selenium.Platform.WINDOWS); // Указываем платформу

        driver = new RemoteWebDriver(new URL(URL), capabilities);

        // Ваш тестовый сценарий
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());

        driver.quit();
    }

    @Test
    public void testFirefoxMac() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox"); // Указываем браузер
        capabilities.setPlatform(org.openqa.selenium.Platform.MAC); // Указываем платформу

        driver = new RemoteWebDriver(new URL(URL), capabilities);

        // Ваш тестовый сценарий
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());

        driver.quit();
    }

    @Test
    public void testSafariMac() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("safari"); // Указываем браузер
        capabilities.setPlatform(org.openqa.selenium.Platform.MAC); // Указываем платформу

        driver = new RemoteWebDriver(new URL(URL), capabilities);

        // Ваш тестовый сценарий
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());

        driver.quit();
    }

    @Test
    public void testSafariWindows() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("safari"); // Указываем браузер
        capabilities.setPlatform(org.openqa.selenium.Platform.WINDOWS); // Указываем платформу

        driver = new RemoteWebDriver(new URL(URL), capabilities);

        // Ваш тестовый сценарий
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());

        driver.quit();
    }

    @Test
    public void testEdgeWindows() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("edge"); // Указываем браузер
        capabilities.setPlatform(org.openqa.selenium.Platform.WINDOWS); // Указываем платформу

        driver = new RemoteWebDriver(new URL(URL), capabilities);

        // Ваш тестовый сценарий
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());

        driver.quit();
    }

    @Test
    public void testEdgeMac() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("edge"); // Указываем браузер
        capabilities.setPlatform(org.openqa.selenium.Platform.MAC); // Указываем платформу

        driver = new RemoteWebDriver(new URL(URL), capabilities);

        // Ваш тестовый сценарий
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());

        driver.quit();
    }

    @Test
    public void testOperaWindows() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("OPERA"); // Указываем браузер
        capabilities.setPlatform(org.openqa.selenium.Platform.WINDOWS); // Указываем платформу

        driver = new RemoteWebDriver(new URL(URL), capabilities);

        // Ваш тестовый сценарий
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());

        driver.quit();
    }

    @Test
    public void testOperaMac() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("OPERA"); // Указываем браузер
        capabilities.setPlatform(org.openqa.selenium.Platform.MAC); // Указываем платформу

        driver = new RemoteWebDriver(new URL(URL), capabilities);

        // Ваш тестовый сценарий
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());

        driver.quit();
    }
}
