package com.BridgeLabz.WeekOne;

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.firefox.FirefoxDriver;
 import org.openqa.selenium.firefox.FirefoxOptions;
 import org.openqa.selenium.firefox.FirefoxProfile;
 import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadTestFireFoxOnly {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\AutomationFiles\\Drivers\\geckodriver.exe\\");

        FirefoxOptions ffOptions = new FirefoxOptions();

        ffOptions.addPreference("browser.download.dir", "C:\\Random");
        ffOptions.addPreference("browser.download.folderList", 2);

        ffOptions.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip;");

        ffOptions.addPreference("browser.download.manager.showWhenStarting", false);
        ffOptions.addPreference("pdfjs.disabled", true);

        // Create Firefox browser based on the profile just created.
        FirefoxDriver ffDriver = new FirefoxDriver(ffOptions);


        // For tomcat 9.0.zip.
        ffDriver.get("https://www.selenium.dev/downloads/");
        ffDriver.get("http://www.seleniumhq.org/download/");

        Thread.sleep(2000);
        WebElement test = ffDriver.findElement(By.xpath("//a[contains(text(),'3.141.59 (November 14, 2018)')]"));
        Thread.sleep(2000);
        test.click();
        Thread.sleep(2000);
        test.click();
        Thread.sleep(3000);
    }
}