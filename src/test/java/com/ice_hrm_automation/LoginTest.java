package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\icehrm_automation\\chromedriver.exe");
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://cybersuccess.icehrm.com/");

WebElement username=driver.findElement(By.id("username"));
username.sendKeys("admin");

WebElement password=driver.findElement(By.id("password"));
username.sendKeys("2zuzfakn");

WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
loginButton.click();


	}

}
