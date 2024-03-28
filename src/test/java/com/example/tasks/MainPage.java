package com.example.tasks;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://www.jetbrains.com/
public class MainPage {

  public SelenideElement seeDeveloperToolsButton = $x("//*[@data-test-marker='Developer Tools']");
  public SelenideElement findYourToolsButton = $x("//*[@data-test='suggestion-action']");
  public SelenideElement toolsMenu = $x("//div[@data-test='main-menu-item' and @data-test-marker = 'Developer Tools']");
  public SelenideElement searchButton = $("[data-test='site-header-search-action']");
  public static final String LOGIN_PASS = "admin";

  public static WebDriver driver;
  public static WebDriver driverF;
  public static WebDriver driverE;

  public static void loginPass() {
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys(LOGIN_PASS);
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys(LOGIN_PASS);
    driver.findElement(By.name("login")).click();
  }

  public static void loginPassF() {
    driverF.findElement(By.name("username")).click();
    driverF.findElement(By.name("username")).sendKeys(LOGIN_PASS);
    driverF.findElement(By.name("password")).click();
    driverF.findElement(By.name("password")).sendKeys(LOGIN_PASS);
    driverF.findElement(By.name("login")).click();
  }

  public static void loginPassE() {
    driverE.findElement(By.name("username")).click();
    driverE.findElement(By.name("username")).sendKeys(LOGIN_PASS);
    driverE.findElement(By.name("password")).click();
    driverE.findElement(By.name("password")).sendKeys(LOGIN_PASS);
    driverE.findElement(By.name("login")).click();
  }
}
