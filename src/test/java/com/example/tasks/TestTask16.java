package com.example.tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class TestTask16 {
    public static final String USERNAME = "bsuser_doJhCO";
    public static final String AUTOMATE_KEY = "vvqJoX44UpCpfbdeC6K2";

    public static void main(String[] args) {
        WebDriver driver;

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "latest");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");

        caps.setCapability("project", "YourProjectName");
        caps.setCapability("build", "Build1");
        caps.setCapability("name", "SampleTest");

        try {
            driver = new RemoteWebDriver(new URL("https://bsuser_doJhCO:vvqJoX44UpCpfbdeC6K2@hub-cloud.browserstack.com/wd/hub"), caps);
            driver.get("https://www.google.com");
            System.out.println(driver.getTitle());
            driver.quit();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
