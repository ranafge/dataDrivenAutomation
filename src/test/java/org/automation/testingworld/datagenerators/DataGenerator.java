package org.automation.testingworld.datagenerators;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;

public class DataGenerator {

    @DataProvider(name = "excelData")
    public static Object[][] testDataGenerator2() throws Exception {
        FileInputStream file = new FileInputStream("./TestData/loginData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet loginSheet = workbook.getSheet("login");
        int numberOfData = loginSheet.getPhysicalNumberOfRows();

        Object[][] testData = new Object[numberOfData][2];

        for (int i = 0; i < numberOfData; i++) {
            XSSFRow row = loginSheet.getRow(i);
            XSSFCell username = row.getCell(0);
            XSSFCell password = row.getCell(1);
            testData[i][0] = username.getStringCellValue();
            testData[i][1] = password.getStringCellValue();
        }
        return testData;


    }
}
