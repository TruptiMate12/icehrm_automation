package com. ice_hrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class DropDownExample2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        Thread.sleep(5000);
        String dashboardText = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
        if(dashboardText.equals("Dashboard")) {
           System.out.println("Successfully landed on the homepage of an application");
        }
        else 
        {
        	throw new Exception("Failed to login to application");
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        Thread.sleep(5000);
        WebElement searchButton = driver.findElement(By.xpath("//button[@type='reset']/following-sibling::button"));
        
        if(searchButton.isDisplayed()) {
        	System.out.println("successfully able to navigate on PIM module");
        	if(searchButton.isEnabled()) {
        		System.out.println("search button is enabled on the screen");
        	}else {
        		System.out.println("search button is disabled on the screen");
        	}
        	}else {
        		
        	System.out.println("unable to navigate on PIM module");
        }
        driver.findElement(By.xpath("//label[text()='Employment Status']/following::div[4]")).click();
        List<WebElement> empStatusDropDownVals = driver.findElements(By.xpath("//div[@role='listbox']//span"));
        for(int i = 0; i<empStatusDropDownVals.size();i++) {
        	WebElement element = empStatusDropDownVals.get(i);
        	String value=element.getText();
        	if(value.equals("Part-Time Contract")) {
        		System.out.println(value);
        		element.click();
        		break;
        	}
        }
        String selectedValue= driver.findElement(By.xpath("//label[text()='Employment Status']/following::div[4]")).getText();
        if(selectedValue.equals("Part-Time Contract")) {
        	System.out.println("successfully able to select Part-Time Contract in Employment Status Dropdown");
        } else {
        	throw new Exception("unabled to select Part-Time Contract in Employment Status Dropdown");
        }
        driver.close();

        
        	}
        		
        	
        }