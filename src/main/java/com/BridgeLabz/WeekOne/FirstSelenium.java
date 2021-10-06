package com.BridgeLabz.WeekOne;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class FirstSelenium {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\AutomationFiles\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        WebDriver driverTwo=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driverTwo.get("https://www.amazon.com/");
        //getPageSource is method of webdriver which return in string  source code of that webpage
        String source=driver.getPageSource();
        String source2=driverTwo.getPageSource();
        System.out.println(source);
        System.out.println(source2);
        driver.manage().window().maximize();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
        // close closes whats in focus and quit qits all
    }
}
