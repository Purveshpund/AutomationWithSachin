package com.BridgeLabz.WeekOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\AutomationFiles\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body.ng-scope:nth-child(2) div.container div.row div.col-md-3 > input:nth-child(5)")).sendKeys("C:\\Random\\TempFile.txt");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body.ng-scope:nth-child(2) div.container div.row div.col-md-9 table.table:nth-child(3) tbody:nth-child(2) tr.ng-scope td:nth-child(5) > button.btn.btn-success.btn-xs:nth-child(1)")).click();

    }
}
