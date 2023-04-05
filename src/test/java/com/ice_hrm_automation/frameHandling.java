package com.ice_hrm_automation;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
	
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandling {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com");
        String input="Selenium";
        driver.switchTo().frame(driver.findElement(By.xpath("")));
        driver.findElement(By.id("b-query")).sendKeys(input);
        driver.findElement(By.id("b-query-icon")).click();
        driver.switchTo().defaultContent();
        String output=driver.findElement(By.xpath("//div[@class=\"status-msg-body\"]/b")).getText();
        if(output.equals(input))
        {
        	System.out.println("successfully able to verify selenium text in the search result");
        }
        else
        {
        	System.out.println("unable to verify selenium text in the search result");
        	 
        	
        }

	}

}
