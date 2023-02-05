
package org.automation.testingworld.pages;
import org.automation.testingworld.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String userName) throws Exception {
        driver.findElement(By.id(Utility.fetchLocatorValue("login_username_id"))).sendKeys(userName);

    }
    public void  enterPassword(String passWord) throws Exception{
        driver.findElement(By.id(Utility.fetchLocatorValue("login_password_id"))).sendKeys(passWord);
    }

    public void clickLoginButton() throws Exception {
        driver.findElement(By.xpath(Utility.fetchLocatorValue("login_signin_xpath"))).clear();
    }
}
