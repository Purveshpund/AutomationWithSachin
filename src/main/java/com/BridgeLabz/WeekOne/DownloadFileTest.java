package com.BridgeLabz.WeekOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadFileTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\AutomationFiles\\Drivers\\geckodriver.exe\\");
        FirefoxProfile profile = new FirefoxProfile();
        String key = "browser.helperApps.neverAsk.saveToDisk";
        String value = "application/zip";
        profile.setPreference(key, value);
        profile.setPreference("browser.download.folderList", 1);
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setCapability(FirefoxDriver.PROFILE, profile);
        WebDriver driver = new FirefoxDriver(cap);
        driver.get("http://www.seleniumhq.org/download/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'3.141.59 (November 14, 2018)')]")).click();
        Thread.sleep(3000);

    }
}