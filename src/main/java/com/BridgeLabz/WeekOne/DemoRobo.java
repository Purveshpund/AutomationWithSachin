package com.BridgeLabz.WeekOne;
/*
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.KeyEvent;
public class DemoRobo {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\AutomationFiles\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:www.morningstar.com");
        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_N);
        Thread .sleep(1000);
        robot.keyRelease(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.mouseMove(1000, 500);
    }
}
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoRobo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\AutomationFiles\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        Thread.sleep(2000);
        WebElement search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        Actions act = new Actions(driver);
        act.sendKeys(search, "Iphone").perform();
  }
}

