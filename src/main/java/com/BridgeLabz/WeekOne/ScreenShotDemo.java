package com.BridgeLabz.WeekOne;

import java.io.File;
import java.time.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\AutomationFiles\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.morningstar.com");
        int day = LocalDate.now().getDayOfMonth();
        int month = LocalDate.now().getMonthValue();
        int min = LocalDateTime.now().getMinute();
        String filename = day + "" + month + "" + min;
        try {
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File saveto = new File("C:\\Users\\ppund\\IdeaProjects\\AutomationWithSachin\\src\\FileDir\\Snip" + filename + ".jpg");
            FileHandler.copy(source, saveto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ScreenShot Captured");
    }

}

