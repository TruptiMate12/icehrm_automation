package com.icehrm_automation.LoginTest;
import org.testng.annotations.Test;
import com.icehrm_automation.utility.ExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ExcelTest {

    @DataProvider
    public Object [][]  getTestData(){
        ExcelUtil excelUtil = new ExcelUtil();
       // String filePath = "C:\\\\excel.xlsx\\";
      String filePath = "C:\\Users\\Lenovo\\Downloads\\TestData.xlsx";
       String sheetName = "credentials";
        //String sheetName = "Sheet1";
        return excelUtil.getExcelData(filePath, sheetName);
    }

    @Test(dataProvider = "getTestData")
    public void test(String username, String password){
        System.out.println(username + " "+ password);
    }

}



	
