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
    public static WebDriver driverF;
    public static WebDriver driverE;

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

    public static void findElement_xpath(String str){ driver.findElement(By.xpath(str)); }

    public static void findElement_cssSelector(String str){ driver.findElement(By.cssSelector(str)); }

    public static void wait(int number){
        try {
            Thread.sleep(number);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean is_displayed_name(String str){ return driver.findElement(By.name(str)).isDisplayed(); }

    public static void press_down(String str){ driver.findElement(By.name(str)).sendKeys(Keys.ARROW_DOWN); }

    public static void press_enter(String str){ driver.findElement(By.name(str)).sendKeys(Keys.ENTER); }

    public static void click_linkText(String str) {
        driver.findElement(By.linkText(str)).click();
    }

    public static void click_partialLinkText(String str) {
        driver.findElement(By.partialLinkText(str)).click();
    }

    public static void click_xpath(String str) {
        driver.findElement(By.xpath(str)).click();
    }

    public static void click_cssSelector(String str) {
        driver.findElement(By.cssSelector(str)).click();
    }

    public static void click_name(String str) {
        driver.findElement(By.name(str)).click();
    }

    public static void click_classname(String str) {
        driver.findElement(By.className(str)).click();
    }

    public static void sendKeys_classname(String str1, String str2) {
        driver.findElement(By.className(str1)).sendKeys(str2);
    }


    public static void click_id(String str) {
        driver.findElement(By.id(str)).click();
    }

    public static void sendKeys_cssSelector(String str1, String str2) {
        driver.findElement(By.cssSelector(str1)).sendKeys(str2);
    }

    public static void sendKeys_name(String str1, String str2) {
        driver.findElement(By.name(str1)).sendKeys(str2);
    }

    public static void get(String str) {
        driver.get(str);
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
