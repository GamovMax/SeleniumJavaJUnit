package com.example.tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainTest_old extends BasePage.BasePage {

        private Object JOptionPane;


//    @Before
//    public void setUp() {
//        //System.setProperty("webdriverChrome.chrome.driverChrome", "path_to_chromedriverChrome");
//        //driverChrome = new ChromedriverChrome();
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
//        //WebdriverChromeWait wait;
//        //wait = new WebdriverChromeWait(driverChrome,1000);
//        //Alert prompt = null;
//        //prompt.sendKeys("Для завершения автотеста нажмите кнопку 'Ок'");
//        driverChrome.quit();
//    }

    @Test
    public void testMethod() {

//        driverChrome = new ChromedriverChrome();
        driverChrome.get("https://translate.yandex.ru/?source_lang=en&target_lang=ru");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driverChrome.manage().window().setSize(new Dimension(1050, 735));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driverChrome.findElement(By.cssSelector(".verticalMenuNavItem:nth-child(2)")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driverChrome.findElement(By.cssSelector(".verticalMenuNavItem:nth-child(3)")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driverChrome.findElement(By.cssSelector(".verticalMenuNavItem:nth-child(4)")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driverChrome.findElement(By.cssSelector(".verticalMenuNavItem:nth-child(5)")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driverChrome.findElement(By.cssSelector(".verticalMenuNavItem:nth-child(6)")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        driverChrome.close();
        driverChrome.quit();
    }

    @Test
    public void test1() {
//        driverChrome = new ChromedriverChrome();
        driverChrome.get("http://192.168.111.16/litecart/admin/");
//        driverChrome.manage().window().setSize(new Dimension(1440, 860));
        loginPassChrome();

//        driverChrome.findElement(By.xpath("//li[@id=\'app-\']/a/span[2]")).click();
        clickXpath("//li[@id=\'app-\']/a/span[2]");
        driverChrome.findElement(By.cssSelector("#doc-logotype .name")).click();
        driverChrome.findElement(By.linkText("Catalog")).click();
        driverChrome.findElement(By.cssSelector("#doc-product_groups .name")).click();
        driverChrome.findElement(By.cssSelector("#doc-option_groups .name")).click();
        driverChrome.findElement(By.cssSelector("#doc-manufacturers .name")).click();
        driverChrome.findElement(By.cssSelector("#doc-suppliers .name")).click();
        driverChrome.findElement(By.cssSelector("#doc-delivery_statuses .name")).click();
        driverChrome.findElement(By.cssSelector("#doc-sold_out_statuses .name")).click();
        driverChrome.findElement(By.cssSelector("#doc-quantity_units .name")).click();
        driverChrome.findElement(By.cssSelector("#doc-csv .name")).click();
//        driverChrome.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[3]")).click();
        clickXpath("(//li[@id=\'app-\']/a/span[2])[3]");
        driverChrome.findElement(By.linkText("Currencies")).click();
//        driverChrome.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[5]")).click();
        clickXpath("(//li[@id=\'app-\']/a/span[2])[5]");
        driverChrome.findElement(By.cssSelector("#doc-csv .name")).click();
        driverChrome.findElement(By.cssSelector("#doc-newsletter .name")).click();
        driverChrome.findElement(By.linkText("Geo Zones")).click();
        driverChrome.findElement(By.linkText("Languages")).click();
        driverChrome.findElement(By.cssSelector("#doc-storage_encoding .name")).click();
        driverChrome.findElement(By.linkText("Modules")).click();
        driverChrome.findElement(By.cssSelector("#doc-customer .name")).click();
        driverChrome.findElement(By.cssSelector("#doc-shipping .name")).click();
        driverChrome.findElement(By.cssSelector("#doc-payment .name")).click();
        driverChrome.findElement(By.cssSelector("#doc-order_total .name")).click();
        driverChrome.findElement(By.cssSelector("#doc-order_success .name")).click();
        driverChrome.findElement(By.cssSelector("#doc-order_action .name")).click();
        driverChrome.findElement(By.linkText("Orders")).click();
        driverChrome.findElement(By.cssSelector("#doc-order_statuses .name")).click();
        driverChrome.findElement(By.linkText("Pages")).click();
        driverChrome.findElement(By.linkText("Reports")).click();
        driverChrome.findElement(By.cssSelector("#doc-most_sold_products .name")).click();
        driverChrome.findElement(By.cssSelector("#doc-most_shopping_customers .name")).click();
        driverChrome.findElement(By.linkText("Settings")).click();
        driverChrome.findElement(By.linkText("Defaults")).click();
        driverChrome.findElement(By.linkText("General")).click();
        driverChrome.findElement(By.linkText("Listings")).click();
        driverChrome.findElement(By.linkText("Images")).click();
        driverChrome.findElement(By.linkText("Checkout")).click();
        driverChrome.findElement(By.linkText("Advanced")).click();
        driverChrome.findElement(By.linkText("Security")).click();
        driverChrome.findElement(By.linkText("Slides")).click();
        driverChrome.findElement(By.linkText("Tax")).click();
        driverChrome.findElement(By.linkText("Tax Rates")).click();
//        driverChrome.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[15]")).click();
        clickXpath("(//li[@id=\'app-\']/a/span[2])[15]");
        driverChrome.findElement(By.cssSelector("#doc-scan .name")).click();
        driverChrome.findElement(By.cssSelector("#doc-csv .name")).click();
        driverChrome.findElement(By.linkText("Users")).click();
        driverChrome.findElement(By.linkText("vQmods")).click();
//        driverChrome.close();
//        driverChrome.quit();

    }


    @Test
    public void test2() {
//        driverChrome = new ChromedriverChrome();
        driverChrome.get("http://192.168.111.16/litecart/admin/login.php");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driverChrome.manage().window().setSize(new Dimension(1440, 860));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginPassChrome();
//        driverChrome.close();
        driverChrome.quit();

//        int seconds = 10;
//        // Преобразование целочисленного значения в Duration
//        Duration duration = Duration.ofSeconds(seconds);
//
//        driverChrome.get("http://192.168.111.16/litecart/admin/login.php");
//        driverChrome.manage().window().setSize(new Dimension(1440, 860));
//
//        WebdriverChromeWait wait = new WebdriverChromeWait(driverChrome, duration); // Инициализация explicit wait с таймаутом 10 секунд
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
        driverFirefox = new FirefoxDriver();
        driverFirefox.get("http://192.168.111.16/litecart/admin/");
        driverFirefox.manage().window().setSize(new Dimension(1440, 860));

        loginPassFirefox();

        driverFirefox.findElement(By.xpath("//li[@id=\'app-\']/a/span[2]")).click();
        driverFirefox.findElement(By.cssSelector("#doc-logotype .name")).click();
        driverFirefox.findElement(By.linkText("Catalog")).click();
        driverFirefox.findElement(By.cssSelector("#doc-product_groups .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-option_groups .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-manufacturers .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-suppliers .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-delivery_statuses .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-sold_out_statuses .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-quantity_units .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-csv .name")).click();
        driverFirefox.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[3]")).click();
        driverFirefox.findElement(By.linkText("Currencies")).click();
        driverFirefox.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[5]")).click();
        driverFirefox.findElement(By.cssSelector("#doc-csv .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-newsletter .name")).click();
        driverFirefox.findElement(By.linkText("Geo Zones")).click();
        driverFirefox.findElement(By.linkText("Languages")).click();
        driverFirefox.findElement(By.cssSelector("#doc-storage_encoding .name")).click();
        driverFirefox.findElement(By.linkText("Modules")).click();
        driverFirefox.findElement(By.cssSelector("#doc-customer .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-shipping .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-payment .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-order_total .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-order_success .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-order_action .name")).click();
        driverFirefox.findElement(By.linkText("Orders")).click();
        driverFirefox.findElement(By.cssSelector("#doc-order_statuses .name")).click();
        driverFirefox.findElement(By.linkText("Pages")).click();
        driverFirefox.findElement(By.linkText("Reports")).click();
        driverFirefox.findElement(By.cssSelector("#doc-most_sold_products .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-most_shopping_customers .name")).click();
        driverFirefox.findElement(By.linkText("Settings")).click();
        driverFirefox.findElement(By.linkText("Defaults")).click();
        driverFirefox.findElement(By.linkText("General")).click();
        driverFirefox.findElement(By.linkText("Listings")).click();
        driverFirefox.findElement(By.linkText("Images")).click();
        driverFirefox.findElement(By.linkText("Checkout")).click();
        driverFirefox.findElement(By.linkText("Advanced")).click();
        driverFirefox.findElement(By.linkText("Security")).click();
        driverFirefox.findElement(By.linkText("Slides")).click();
        driverFirefox.findElement(By.linkText("Tax")).click();
        driverFirefox.findElement(By.linkText("Tax Rates")).click();
        driverFirefox.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[15]")).click();
        driverFirefox.findElement(By.cssSelector("#doc-scan .name")).click();
        driverFirefox.findElement(By.cssSelector("#doc-csv .name")).click();
        driverFirefox.findElement(By.linkText("Users")).click();
        driverFirefox.findElement(By.linkText("vQmods")).click();
//        driverFirefox.close();
        driverFirefox.quit();
    }

    @Test
    public void Edge() {
        driverEdge = new EdgeDriver();
        driverEdge.get("http://192.168.111.16/litecart/admin/");
        driverEdge.manage().window().setSize(new Dimension(1440, 860));

        loginPassEdge();

        driverEdge.findElement(By.xpath("//li[@id=\'app-\']/a/span[2]")).click();
        driverEdge.findElement(By.cssSelector("#doc-logotype .name")).click();
        driverEdge.findElement(By.linkText("Catalog")).click();
        driverEdge.findElement(By.cssSelector("#doc-product_groups .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-option_groups .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-manufacturers .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-suppliers .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-delivery_statuses .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-sold_out_statuses .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-quantity_units .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-csv .name")).click();
        driverEdge.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[3]")).click();
        driverEdge.findElement(By.linkText("Currencies")).click();
        driverEdge.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[5]")).click();
        driverEdge.findElement(By.cssSelector("#doc-csv .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-newsletter .name")).click();
        driverEdge.findElement(By.linkText("Geo Zones")).click();
        driverEdge.findElement(By.linkText("Languages")).click();
        driverEdge.findElement(By.cssSelector("#doc-storage_encoding .name")).click();
        driverEdge.findElement(By.linkText("Modules")).click();
        driverEdge.findElement(By.cssSelector("#doc-customer .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-shipping .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-payment .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-order_total .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-order_success .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-order_action .name")).click();
        driverEdge.findElement(By.linkText("Orders")).click();
        driverEdge.findElement(By.cssSelector("#doc-order_statuses .name")).click();
        driverEdge.findElement(By.linkText("Pages")).click();
        driverEdge.findElement(By.linkText("Reports")).click();
        driverEdge.findElement(By.cssSelector("#doc-most_sold_products .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-most_shopping_customers .name")).click();
        driverEdge.findElement(By.linkText("Settings")).click();
        driverEdge.findElement(By.linkText("Defaults")).click();
        driverEdge.findElement(By.linkText("General")).click();
        driverEdge.findElement(By.linkText("Listings")).click();
        driverEdge.findElement(By.linkText("Images")).click();
        driverEdge.findElement(By.linkText("Checkout")).click();
        driverEdge.findElement(By.linkText("Advanced")).click();
        driverEdge.findElement(By.linkText("Security")).click();
        driverEdge.findElement(By.linkText("Slides")).click();
        driverEdge.findElement(By.linkText("Tax")).click();
        driverEdge.findElement(By.linkText("Tax Rates")).click();
        driverEdge.findElement(By.xpath("(//li[@id=\'app-\']/a/span[2])[15]")).click();
        driverEdge.findElement(By.cssSelector("#doc-scan .name")).click();
        driverEdge.findElement(By.cssSelector("#doc-csv .name")).click();
        driverEdge.findElement(By.linkText("Users")).click();
        driverEdge.findElement(By.linkText("vQmods")).click();
//        driverEdge.close();
        driverEdge.quit();
    }

}