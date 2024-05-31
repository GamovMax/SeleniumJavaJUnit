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

    public static WebDriver driver;
    public static WebDriver driverFirefox;
    public static WebDriver driverEdge;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public static void findElement_xpath(String locatorxpath){ driver.findElement(By.xpath(locatorxpath)); }

    public static void findElement_cssSelector(String locatorcssSelector){ driver.findElement(By.cssSelector(locatorcssSelector)); }

    public static void wait(int numberofseconds){
        try {
            Thread.sleep(numberofseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean is_displayed_name(String locatorname){ return driver.findElement(By.name(locatorname)).isDisplayed(); }

    public static void press_down(String locatorname){ driver.findElement(By.name(locatorname)).sendKeys(Keys.ARROW_DOWN); }

    public static void press_enter(String locatorname){ driver.findElement(By.name(locatorname)).sendKeys(Keys.ENTER); }

    public static void click_linkText(String link_text) {
        driver.findElement(By.linkText(link_text)).click();
    }

    public static void click_partialLinkText(String locatorpartialLinkText) {
        driver.findElement(By.partialLinkText(locatorpartialLinkText)).click();
    }

    public static void click_xpath(String locatorxpath) {
        driver.findElement(By.xpath(locatorxpath)).click();
    }

    public static void click_cssSelector(String locatorcssSelector) {
        driver.findElement(By.cssSelector(locatorcssSelector)).click();
    }

    public static void click_name(String locatorname) {
        driver.findElement(By.name(locatorname)).click();
    }

    public static void click_classname(String locatorclassname) {
        driver.findElement(By.className(locatorclassname)).click();
    }

    public static void sendKeys_classname(String locatorclassname, String string) {
        driver.findElement(By.className(locatorclassname)).sendKeys(string);
    }


    public static void click_id(String locatorid) {
        driver.findElement(By.id(locatorid)).click();
    }

    public static void sendKeys_cssSelector(String locatorcssSelector, String string) {
        driver.findElement(By.cssSelector(locatorcssSelector)).sendKeys(string);
    }

    public static void sendKeys_name(String locatorname, String string) {
        driver.findElement(By.name(locatorname)).sendKeys(string);
    }

    public static void get(String url) {
        driver.get(url);
    }

    public static void back() {
        driver.navigate().back();
    }

    public static void maximize() {
        driver.manage().window().maximize();
    }

    public static void loginPass() {
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).sendKeys(LOGIN_PASS);
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys(LOGIN_PASS);
        driver.findElement(By.name("login")).click();
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
