package com.BridgeLabz.WeekOne;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;
public class TaskOne {
    public static void main(String[] Args) throws InterruptedException {
        //System.setProperty("webdriver.gecko.driver","C:\\AutomationFiles\\Drivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\AutomationFiles\\Drivers\\chromedriver.exe");
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Automation");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Test");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("test@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("test@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password_step_input")).sendKeys("PassWord12");
        Thread.sleep(1000);
        Select selectDay = new Select(driver.findElement(By.id("day")));
        selectDay.selectByIndex(5);
        Thread.sleep(1000);
        Select selectMonth = new Select(driver.findElement(By.id("month")));
        selectMonth.selectByValue("5");
        Thread.sleep(1000);
        Select selectYear = new Select(driver.findElement(By.id("year")));
        selectYear.selectByVisibleText("1995");
        Thread.sleep(1000);
        List<WebElement> gender = driver.findElements(By.name("sex"));
        gender.get(1).click();
        Thread.sleep(1000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(60000);
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File(".\\screenshot\\TaskOne.png");
    }
}