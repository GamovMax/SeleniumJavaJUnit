package com.example.tasks;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://www.jetbrains.com/
public class MainPage {

  public SelenideElement seeDeveloperToolsButton = $x("//*[@data-test-marker='Developer Tools']");
  public SelenideElement findYourToolsButton = $x("//*[@data-test='suggestion-action']");
  public SelenideElement toolsMenu = $x("//div[@data-test='main-menu-item' and @data-test-marker = 'Developer Tools']");
  public SelenideElement searchButton = $("[data-test='site-header-search-action']");
  public static final String LOGIN_PASS = "admin";

  /*public static WebDriver driver;
  public static WebDriver driverF;
  public static WebDriver driverE;

  @Before
  public void setUp() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
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
  }*/
}
