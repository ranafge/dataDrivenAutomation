package org.automation.testingworld.base;

import org.automation.testingworld.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class DriverInstance {
    public WebDriver driver;

    @BeforeMethod
    public void initiateDriverInstance() throws Exception {
        if (Utility.fetchProperty("browserName").toString().equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (Utility.fetchProperty("browserName").toString().equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.get(Utility.fetchProperty("applicationUrl").toString());

    }

    @AfterMethod
    public void closeDriverInstance() {
        driver.quit();
    }
}
