package com.example.tasks;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TestScreen {

    private Object Optional;

    @Test
    public void Screen() throws IOException, AWTException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://192.168.111.16/litecart/en/");
        driver.manage().window().maximize();

        Robot robot = new Robot();

        try
        {
            throw new RuntimeException("Test failure");
        }
        catch (Exception a)
        {

            robot.keyPress(KeyEvent.VK_F12);
            robot.keyRelease(KeyEvent.VK_F12);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            robot.keyPress(KeyEvent.VK_CONTROL);

            robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
            robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);

            robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
            robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);


            robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
            robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);

            robot.keyRelease(KeyEvent.VK_CONTROL);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            driver.navigate().refresh();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // Захватываем изображение экрана с помощью Robot
            BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

            ImageIO.write(screenShot, "png", new File("fullscreen_screenshot.png"));
        }

        driver.quit();
    }
}
