package org.automation.testingworld.assertions;

import org.openqa.selenium.WebDriver;

public class Compare {
    public boolean validatePageUrl(WebDriver driver, String expUrl) {
        boolean flag = false;
        if(driver.getCurrentUrl().equalsIgnoreCase(expUrl)) {
            flag=true;
        }
        return flag;
    }

}
