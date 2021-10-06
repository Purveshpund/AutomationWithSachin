package com.BridgeLabz.WeekOne;
// So this file contains script for two prog to run simultaniously  for hori and verti scrolling
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;

public class JavaScriptScrollTest {
    public static <webelement> void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\AutomationFiles\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriver driverTwo = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.morningstar.com/");
        Thread.sleep(3000);
        WebElement coordinate = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[2]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/*[1]"));
        Point coOrdi = new Point();
        coOrdi.x = coordinate.getLocation().getX();
        coOrdi.y = coordinate.getLocation().getY();
        System.out.println("X Co-coordinate value is : " +coOrdi.x);
        System.out.println("Y Co-coordinate value is : " +coOrdi.y);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(" + coOrdi.x + "," + coOrdi.y + ")");

        driverTwo.get("https://www.thesmartmove.se/international/?ref=onepagelove");
        Thread.sleep(2000);
        JavascriptExecutor javascriptExecutorTwo = (JavascriptExecutor) driverTwo;
        javascriptExecutorTwo.executeScript("window.scrollBy(1000,0)");
    }
}