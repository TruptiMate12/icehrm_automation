package com.icehrm_automation.utility;
import com.icehrm_automation.utility.BaseClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTest extends BaseClass {
	String firstName = "Trupti";
	String lastName = "Mate";
	String empId = "001";
	String nationality="Indian";
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is launch browser method from @BeforeMethod");
		launchBrowser("chrome");
		driver.navigate().to("https://cybersuccess.icehrm.com/");
		
        enterText (By.id("username"),"admin");
        enterText(By.id("password"),"2zuzfakn");
        click(By.xpath("//button[contains(text(),'Log in')]"));
        click(By.xpath("//span[text()='Employees']"));
        click(By.xpath("//ul[@id='admin_Employees']/li[1]/a"));
        
	}
	@Test
	public void addEmp() {
		System.out.println("This is createEmp method from @Test");
		click(By.xpath("//div[@id='EmployeeTable']/descendant::span[contains(text(),'Add New')]"));
		
				enterText(By.xpath("//input[@id=\"employee_id\"]"),empId);
				enterText(By.xpath("//input[@id=\"first_name\"]"),firstName);
				enterText(By.xpath("//input[@id=\"last_name\"]"),lastName);
				WebElement ddown=driver.findElement(By.xpath("//input[@id='rc_select_0']"));
				Select select = new Select(ddown);
				select.selectByValue("American");
				
			 select.selectByIndex(4);
			 List<WebElement>DayElement = driver.findElements(By.xpath("//td[@class='ant-picker-cell ant-picker-cell-is-view']"));
				for(WebElement DElement : DayElement)
				{
					String Day=DElement.getText();
					if(Day.equals("27"))
					{
						DElement.click();
					}
				}
				click(By.xpath("//span[text()='Save']"));
	}
	@Test
	public void verifyEmp()
	{
		System.out.println("This is verifyEmp method from @Test");
		
	}
	@AfterMethod
	public void tearDown()
	{
		System.out.println("This is tearDown method from @AfterMethod");
	}
	
	
	}


