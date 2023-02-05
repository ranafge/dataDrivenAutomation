package org.automation.testingworld.testcases;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.automation.testingworld.base.DriverInstance;
import org.automation.testingworld.datagenerators.DataGenerator;
import org.automation.testingworld.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TC_001_ValidateLoginFunctionality extends DriverInstance {

    @Test(dataProvider = "excelData", dataProviderClass = DataGenerator.class)
    public void tc_001_login_functionality(String username, String pass) throws Exception {
        LoginPage loginpage = new LoginPage(driver);

        loginpage.enterUserName(username);
        loginpage.enterPassword(pass);
        loginpage.clickLoginButton();
    }

    @DataProvider(name = "Static")
    public Object[][] testDataGenerator() {
        Object[][] data = {{"uname1", "pass"}, {"uname1", "pass"}, {"uname1", "pass"}};
        return data;
    }


}
