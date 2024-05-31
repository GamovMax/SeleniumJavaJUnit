package BasePage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;
import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;
import static constants.Constant.loginpswd.LOGIN_PASS;

public class BasePage {

    public static WebDriver driverChrome;
    public static WebDriver driverFirefox;
    public static WebDriver driverEdge;

    @Before
    public void setUp() {
        driverChrome = new ChromeDriver();
        driverChrome.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        maximize();
    }

    @After
    public void tearDown() {
        driverChrome.quit();
    }

    public static void findElementXpath(String locatorXpath){ driverChrome.findElement(By.xpath(locatorXpath)); }

    public static void findElementCssSelector(String locatorCssSelector){ driverChrome.findElement(By.cssSelector(locatorCssSelector)); }

    public static void wait(int numberOfSeconds){
        try {
            Thread.sleep(numberOfSeconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isDisplayedName(String locatorName){ return driverChrome.findElement(By.name(locatorName)).isDisplayed(); }

    public static void pressDown(String locatorName){ driverChrome.findElement(By.name(locatorName)).sendKeys(Keys.ARROW_DOWN); }

    public static void pressEnter(String locatorName){ driverChrome.findElement(By.name(locatorName)).sendKeys(Keys.ENTER); }

    public static void clickLinkText(String locatorLinkText) {
        driverChrome.findElement(By.linkText(locatorLinkText)).click();
    }

    public static void clickPartialLinkText(String locatorPartialLinkText) {
        driverChrome.findElement(By.partialLinkText(locatorPartialLinkText)).click();
    }

    public static void clickXpath(String locatorXpath) {
        driverChrome.findElement(By.xpath(locatorXpath)).click();
    }

    public static void clickCssSelector(String locatorCssSelector) {
        driverChrome.findElement(By.cssSelector(locatorCssSelector)).click();
    }

    public static void clickName(String locatorName) {
        driverChrome.findElement(By.name(locatorName)).click();
    }

    public static void clickClassName(String locatorClassName) {
        driverChrome.findElement(By.className(locatorClassName)).click();
    }

    public static void sendKeysClassName(String locatorClassName, String string) {
        driverChrome.findElement(By.className(locatorClassName)).sendKeys(string);
    }

    public static void clickId(String locatorId) {
        driverChrome.findElement(By.id(locatorId)).click();
    }

    public static void sendKeysCssSelector(String locatorCssSelector, String string) {
        driverChrome.findElement(By.cssSelector(locatorCssSelector)).sendKeys(string);
    }

    public static void sendKeysName(String locatorName, String string) {
        driverChrome.findElement(By.name(locatorName)).sendKeys(string);
    }

    public static void get(String url) {
        driverChrome.get(url);
    }

    public static void back() {
        driverChrome.navigate().back();
    }

    public static void maximize() {
        driverChrome.manage().window().maximize();
    }

    public static void loginPassChrome() {
        driverChrome.findElement(By.name("username")).click();
        driverChrome.findElement(By.name("username")).sendKeys(LOGIN_PASS);
        driverChrome.findElement(By.name("password")).click();
        driverChrome.findElement(By.name("password")).sendKeys(LOGIN_PASS);
        driverChrome.findElement(By.name("login")).click();
    }

    public static void loginPassFirefox() {
        driverFirefox.findElement(By.name("username")).click();
        driverFirefox.findElement(By.name("username")).sendKeys(LOGIN_PASS);
        driverFirefox.findElement(By.name("password")).click();
        driverFirefox.findElement(By.name("password")).sendKeys(LOGIN_PASS);
        driverFirefox.findElement(By.name("login")).click();
    }

    public static void loginPassEdge() {
        driverEdge.findElement(By.name("username")).click();
        driverEdge.findElement(By.name("username")).sendKeys(LOGIN_PASS);
        driverEdge.findElement(By.name("password")).click();
        driverEdge.findElement(By.name("password")).sendKeys(LOGIN_PASS);
        driverEdge.findElement(By.name("login")).click();
    }
}
