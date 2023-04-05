package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLoginTest {

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
        else {
        	throw new Exception("Failed to login to application");
        }
        driver.findElement(By.xpath("//span[text()=PIM]")).click();
        Thread.sleep(2000);
        WebElement searchButton = driver.findElement(By.xpath("//button[@type='rest']/following-sibling::button"));
        
        if(searchButton.isDisplayed()) {
        	System.out.println("successfully able to navigate on PIM module");
        }
        else {
        	System.out.println("unable to navigate on PIM module");
        }
        WebElement selectAllCheckBox = driver.findElement(By.xpath("//div[@role='rowgroup'][1]/descendant::i[1]"));
        selectAllCheckBox.click();
        if(selectAllCheckBox.isSelected()) {
        	System.out.println("Select all check box is selected");
        } else {
        	System.out.println("Select all check box is not selected");
        }
	}

}