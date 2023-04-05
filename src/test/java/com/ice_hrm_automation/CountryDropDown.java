package com. ice_hrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CountryDropDown{

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://cybersuccess.icehrm.com/");
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("2zuzfakn");
        driver.findElement(By.xpath("//button[@type='button']")).submit();
        Thread.sleep(5000);
       /*String empText = driver.findElement(By.xpath("//span[text()='Employees']")).getText();
        if(empdText.equals("Employees")) {
           System.out.println("Successfully landed on the homepage of an application");
        }
        else 
        {
        	throw new Exception("Failed to login to application");
        }*/
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Employees']")).click();
        driver.findElement(By.xpath("//ul[@id='admin_Employees']/li/a")).click();
        driver.findElement(By.xpath("//button[@type='button']/span[2]")).click();
        Thread.sleep(5000);
        WebElement searchButton = driver.findElement(By.xpath("//button[@type='button']/span[2]"));
        
        if(searchButton.isDisplayed()) {
        	//System.out.println("successfully able to navigate on PIM module");
        	if(searchButton.isEnabled()) {
        		//System.out.println("search button is enabled on the screen");
        	}else {
        		System.out.println("search button is disabled on the screen");
        	}
        	}else {
        		
        	System.out.println("unable to navigate on PIM module");
        }
        driver.findElement(By.xpath("//span[@class='ant-select-selection-search']/input")).click();
        List<WebElement> empStatusDropDownVals = driver.findElements(By.xpath("//span[text()='Select Nationality']"));
        driver.findElement(By.xpath("//span[@title='Indian']")).getText();
        for(int i = 0; i<empStatusDropDownVals.size();i++) {
        	WebElement element = empStatusDropDownVals.get(i);
        	String value=element.getText();
        	if(value.equals("Indian")) {
        		System.out.println(value);
        		element.click();
        		break;
        	}
        }
        //String selectedValue= driver.findElement(By.xpath("//span[@class='ant-select-selection-search']/input")).getText();
        String selectValue= driver.findElement(By.xpath("//span[@title='Indian']")).getText();
        if(selectValue.equals("Indian")) {
        	System.out.println("successfully able to select Part-Time Contract in Employment Status Dropdown");
        } else {
        	throw new Exception("unabled to select Part-Time Contract in Employment Status Dropdown");
        }
        driver.close();

        
        	}
        		
        	
        }