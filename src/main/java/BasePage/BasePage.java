package BasePage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
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
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public static void click_linkText(String str) {
        driver.findElement(By.linkText(str)).click();
    }

    public static void click_partialLinkText(String str) {
        driver.findElement(By.partialLinkText(str)).click();
    }

    public static void click_cssSelector(String str) {
        driver.findElement(By.cssSelector(str)).click();
    }

    public static void click_name(String str) {
        driver.findElement(By.name(str)).click();
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
