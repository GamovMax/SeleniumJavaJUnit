package com.example.tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainTest extends BasePage.BasePage {

        private Object JOptionPane;


//    @Before
//    public void setUp() {
//        //System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
//        //driver = new ChromeDriver();
//        //Map<String, Object> vars = new HashMap<String, Object>();
//
//    }

//    @After
//    public void tearDown() {
//        //Scanner scanner = new Scanner(System.in);
//        //System.out.println("Для завершения автотеста нажмите клавишу Enter!");
//        //scanner.nextLine(); // Этот метод будет ожидать нажатия клавиши Enter
//        //System.out.println("Автотест завершён!");
//
//        //WebDriverWait wait;
//        //wait = new WebDriverWait(driver,1000);
//        //Alert prompt = null;
//        //prompt.sendKeys("Для завершения автотеста нажмите кнопку 'Ок'");
//        driver.quit();
//    }

    @Test
    public void testMethod() {

//        driver = new ChromeDriver();
        driver.get("https://translate.yandex.ru/?source_lang=en&target_lang=ru");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.manage().window().setSize(new Dimension(1050, 735));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector(".verticalMenuNavItem:nth-child(2)")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector(".verticalMenuNavItem:nth-child(3)")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector(".verticalMenuNavItem:nth-child(4)")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector(".verticalMenuNavItem:nth-child(5)")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector(".verticalMenuNavItem:nth-child(6)")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        driver.close();
        driver.quit();
    }

    @Test
    public void test1() {
//        driver = new ChromeDriver();
        driver.get("http://192.168.111.16/litecart/admin/");
        driver.manage().window().setSize(new Dimension(1440, 860));

        loginPass();

        driver.findElement(By.xpath("//li[@id=\'app-\']/a/span[2]")).click();
        driver.findElement(By.cssSelector("#doc-logotype .name")).click();
        driver.findElement(By.linkText("Catalog")).click();
        driver.findElement(By.cssSelector("#doc-product_groups .name")).click();
        driver.findElement(By.cssSelector("#doc-option_groups .name")).click();
        driver.findElement(By.cssSelector("#doc-manufacturers .name")).click();
        driver.findElement(By.cssSelector("#doc-suppliers .name")).click();
        driver.findElement(By.cssSelector("#doc-delivery_statuses .name")).click();
        driver.findElement(By.cssSelector("#doc-sold_out_statuses .name")).click();
        driver.findElement(By.cssSelector("#doc-quantity_units .name")).click();
        driver.findElement(By.cssSelector("#doc-csv .name")).click();
        driver.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[3]")).click();
        driver.findElement(By.linkText("Currencies")).click();
        driver.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[5]")).click();
        driver.findElement(By.cssSelector("#doc-csv .name")).click();
        driver.findElement(By.cssSelector("#doc-newsletter .name")).click();
        driver.findElement(By.linkText("Geo Zones")).click();
        driver.findElement(By.linkText("Languages")).click();
        driver.findElement(By.cssSelector("#doc-storage_encoding .name")).click();
        driver.findElement(By.linkText("Modules")).click();
        driver.findElement(By.cssSelector("#doc-customer .name")).click();
        driver.findElement(By.cssSelector("#doc-shipping .name")).click();
        driver.findElement(By.cssSelector("#doc-payment .name")).click();
        driver.findElement(By.cssSelector("#doc-order_total .name")).click();
        driver.findElement(By.cssSelector("#doc-order_success .name")).click();
        driver.findElement(By.cssSelector("#doc-order_action .name")).click();
        driver.findElement(By.linkText("Orders")).click();
        driver.findElement(By.cssSelector("#doc-order_statuses .name")).click();
        driver.findElement(By.linkText("Pages")).click();
        driver.findElement(By.linkText("Reports")).click();
        driver.findElement(By.cssSelector("#doc-most_sold_products .name")).click();
        driver.findElement(By.cssSelector("#doc-most_shopping_customers .name")).click();
        driver.findElement(By.linkText("Settings")).click();
        driver.findElement(By.linkText("Defaults")).click();
        driver.findElement(By.linkText("General")).click();
        driver.findElement(By.linkText("Listings")).click();
        driver.findElement(By.linkText("Images")).click();
        driver.findElement(By.linkText("Checkout")).click();
        driver.findElement(By.linkText("Advanced")).click();
        driver.findElement(By.linkText("Security")).click();
        driver.findElement(By.linkText("Slides")).click();
        driver.findElement(By.linkText("Tax")).click();
        driver.findElement(By.linkText("Tax Rates")).click();
        driver.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[15]")).click();
        driver.findElement(By.cssSelector("#doc-scan .name")).click();
        driver.findElement(By.cssSelector("#doc-csv .name")).click();
        driver.findElement(By.linkText("Users")).click();
        driver.findElement(By.linkText("vQmods")).click();
//        driver.close();
        driver.quit();
    }


    @Test
    public void test2() {
//        driver = new ChromeDriver();
        driver.get("http://192.168.111.16/litecart/admin/login.php");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.manage().window().setSize(new Dimension(1440, 860));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginPass();
//        driver.close();
        driver.quit();

//        int seconds = 10;
//        // Преобразование целочисленного значения в Duration
//        Duration duration = Duration.ofSeconds(seconds);
//
//        driver.get("http://192.168.111.16/litecart/admin/login.php");
//        driver.manage().window().setSize(new Dimension(1440, 860));
//
//        WebDriverWait wait = new WebDriverWait(driver, duration); // Инициализация explicit wait с таймаутом 10 секунд
//
//        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
//        usernameInput.click();
//
//        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
//        usernameInput.sendKeys("admin");
//
//        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));
//        loginButton.click();
    }

    @Test
    public void fire() {
        driverF = new FirefoxDriver();
        driverF.get("http://192.168.111.16/litecart/admin/");
        driverF.manage().window().setSize(new Dimension(1440, 860));

        loginPassF();

        driverF.findElement(By.xpath("//li[@id=\'app-\']/a/span[2]")).click();
        driverF.findElement(By.cssSelector("#doc-logotype .name")).click();
        driverF.findElement(By.linkText("Catalog")).click();
        driverF.findElement(By.cssSelector("#doc-product_groups .name")).click();
        driverF.findElement(By.cssSelector("#doc-option_groups .name")).click();
        driverF.findElement(By.cssSelector("#doc-manufacturers .name")).click();
        driverF.findElement(By.cssSelector("#doc-suppliers .name")).click();
        driverF.findElement(By.cssSelector("#doc-delivery_statuses .name")).click();
        driverF.findElement(By.cssSelector("#doc-sold_out_statuses .name")).click();
        driverF.findElement(By.cssSelector("#doc-quantity_units .name")).click();
        driverF.findElement(By.cssSelector("#doc-csv .name")).click();
        driverF.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[3]")).click();
        driverF.findElement(By.linkText("Currencies")).click();
        driverF.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[5]")).click();
        driverF.findElement(By.cssSelector("#doc-csv .name")).click();
        driverF.findElement(By.cssSelector("#doc-newsletter .name")).click();
        driverF.findElement(By.linkText("Geo Zones")).click();
        driverF.findElement(By.linkText("Languages")).click();
        driverF.findElement(By.cssSelector("#doc-storage_encoding .name")).click();
        driverF.findElement(By.linkText("Modules")).click();
        driverF.findElement(By.cssSelector("#doc-customer .name")).click();
        driverF.findElement(By.cssSelector("#doc-shipping .name")).click();
        driverF.findElement(By.cssSelector("#doc-payment .name")).click();
        driverF.findElement(By.cssSelector("#doc-order_total .name")).click();
        driverF.findElement(By.cssSelector("#doc-order_success .name")).click();
        driverF.findElement(By.cssSelector("#doc-order_action .name")).click();
        driverF.findElement(By.linkText("Orders")).click();
        driverF.findElement(By.cssSelector("#doc-order_statuses .name")).click();
        driverF.findElement(By.linkText("Pages")).click();
        driverF.findElement(By.linkText("Reports")).click();
        driverF.findElement(By.cssSelector("#doc-most_sold_products .name")).click();
        driverF.findElement(By.cssSelector("#doc-most_shopping_customers .name")).click();
        driverF.findElement(By.linkText("Settings")).click();
        driverF.findElement(By.linkText("Defaults")).click();
        driverF.findElement(By.linkText("General")).click();
        driverF.findElement(By.linkText("Listings")).click();
        driverF.findElement(By.linkText("Images")).click();
        driverF.findElement(By.linkText("Checkout")).click();
        driverF.findElement(By.linkText("Advanced")).click();
        driverF.findElement(By.linkText("Security")).click();
        driverF.findElement(By.linkText("Slides")).click();
        driverF.findElement(By.linkText("Tax")).click();
        driverF.findElement(By.linkText("Tax Rates")).click();
        driverF.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[15]")).click();
        driverF.findElement(By.cssSelector("#doc-scan .name")).click();
        driverF.findElement(By.cssSelector("#doc-csv .name")).click();
        driverF.findElement(By.linkText("Users")).click();
        driverF.findElement(By.linkText("vQmods")).click();
//        driverF.close();
        driverF.quit();
    }

    @Test
    public void Edge() {
        driverE = new EdgeDriver();
        driverE.get("http://192.168.111.16/litecart/admin/");
        driverE.manage().window().setSize(new Dimension(1440, 860));

        loginPassE();

        driverE.findElement(By.xpath("//li[@id=\'app-\']/a/span[2]")).click();
        driverE.findElement(By.cssSelector("#doc-logotype .name")).click();
        driverE.findElement(By.linkText("Catalog")).click();
        driverE.findElement(By.cssSelector("#doc-product_groups .name")).click();
        driverE.findElement(By.cssSelector("#doc-option_groups .name")).click();
        driverE.findElement(By.cssSelector("#doc-manufacturers .name")).click();
        driverE.findElement(By.cssSelector("#doc-suppliers .name")).click();
        driverE.findElement(By.cssSelector("#doc-delivery_statuses .name")).click();
        driverE.findElement(By.cssSelector("#doc-sold_out_statuses .name")).click();
        driverE.findElement(By.cssSelector("#doc-quantity_units .name")).click();
        driverE.findElement(By.cssSelector("#doc-csv .name")).click();
        driverE.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[3]")).click();
        driverE.findElement(By.linkText("Currencies")).click();
        driverE.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[5]")).click();
        driverE.findElement(By.cssSelector("#doc-csv .name")).click();
        driverE.findElement(By.cssSelector("#doc-newsletter .name")).click();
        driverE.findElement(By.linkText("Geo Zones")).click();
        driverE.findElement(By.linkText("Languages")).click();
        driverE.findElement(By.cssSelector("#doc-storage_encoding .name")).click();
        driverE.findElement(By.linkText("Modules")).click();
        driverE.findElement(By.cssSelector("#doc-customer .name")).click();
        driverE.findElement(By.cssSelector("#doc-shipping .name")).click();
        driverE.findElement(By.cssSelector("#doc-payment .name")).click();
        driverE.findElement(By.cssSelector("#doc-order_total .name")).click();
        driverE.findElement(By.cssSelector("#doc-order_success .name")).click();
        driverE.findElement(By.cssSelector("#doc-order_action .name")).click();
        driverE.findElement(By.linkText("Orders")).click();
        driverE.findElement(By.cssSelector("#doc-order_statuses .name")).click();
        driverE.findElement(By.linkText("Pages")).click();
        driverE.findElement(By.linkText("Reports")).click();
        driverE.findElement(By.cssSelector("#doc-most_sold_products .name")).click();
        driverE.findElement(By.cssSelector("#doc-most_shopping_customers .name")).click();
        driverE.findElement(By.linkText("Settings")).click();
        driverE.findElement(By.linkText("Defaults")).click();
        driverE.findElement(By.linkText("General")).click();
        driverE.findElement(By.linkText("Listings")).click();
        driverE.findElement(By.linkText("Images")).click();
        driverE.findElement(By.linkText("Checkout")).click();
        driverE.findElement(By.linkText("Advanced")).click();
        driverE.findElement(By.linkText("Security")).click();
        driverE.findElement(By.linkText("Slides")).click();
        driverE.findElement(By.linkText("Tax")).click();
        driverE.findElement(By.linkText("Tax Rates")).click();
        driverE.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[15]")).click();
        driverE.findElement(By.cssSelector("#doc-scan .name")).click();
        driverE.findElement(By.cssSelector("#doc-csv .name")).click();
        driverE.findElement(By.linkText("Users")).click();
        driverE.findElement(By.linkText("vQmods")).click();
//        driverE.close();
        driverE.quit();
    }

}