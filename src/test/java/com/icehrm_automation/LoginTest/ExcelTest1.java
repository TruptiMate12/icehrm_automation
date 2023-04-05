package com.icehrm_automation.LoginTest;

import com.icehrm_automation.utility.BaseClass;
import com.icehrm_automation.utility.EmpDetails;
import com.icehrm_automation.utility.ExcelUtil;
import com.icehrm_automation.utility.ExcelUtil1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTest1 extends BaseClass {
	@BeforeClass
	public void LaunchBrowser()
	{
		launchBrowser("");
		
	}

//    @DataProvider
//    public Object[][] getTestData() {
//        ExcelUtil excelUtil = new ExcelUtil();
//       // String filePath = "C:\\Users\\Lenovo\\Downloads\\TestData.xlsx";
//        String filePath = "C:\\Users\\Lenovo\\Downloads\\excel1.xlsx";
//        String sheetName = "";
//        return excelUtil.getExcelData(filePath, sheetName);
//    }
//
//    @Test(dataProvider = "getTestData")
//    public void test(String username, String password) {
//        System.out.println(username + " " + password);
//    }

    @DataProvider
    public Object[][] getEmpData() {
        ExcelUtil1 excelUtil = new ExcelUtil1();
      //  String filePath = "/Users/harshad_dange/Documents/Book1.xlsx";
      //  String sheetName = "TestData";
        String filePath = "C:\\Users\\Lenovo\\Downloads\\excel1.xlsx";
        String sheetName = "TestData";
        return excelUtil.getEmpData(filePath, sheetName);
    }

    @Test(dataProvider = "getEmpData")
    public void empTest(EmpDetails empDetails) {
//    	double id=empDetails.getId();
//    	System.out.println(id);
        click(By.id("EmployeeMenu"));
        click(By.id("add_new"));
        enterText(By.id("empNum"), String.valueOf(empDetails.getId()));
        enterText(By.id("firstName"), empDetails.getFirstName());
        enterText(By.id("mname"), empDetails.getMiddleName());
        enterText(By.id("lastName"), empDetails.getLastName());
        click(By.id("save"));

    }
}
