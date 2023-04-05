package com.ice_hrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;


public class windowSwitch {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        //Thread.sleep(5000);
        String parentWindowId = driver.getWindowHandle();
        System.out.println("First tab Id : "+parentWindowId);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='navSwmHoliday']/a")).click();
        Set<String> allIds=driver.getWindowHandles();
        System.out.println("Print all window ids");
        for(String id :allIds ) {
        	if(!id.equals(parentWindowId)) {
        		System.out.println("second tab Id : "+id);
        		driver.switchTo().window(id);
        		System.out.println("Control switched from first tab to second tab");
        		String secondTabTitle=driver.getTitle();
        		System.out.println("second tab title : " + secondTabTitle);
        		
        		
        		driver.close();
        	}
        }
        driver.switchTo().window(parentWindowId);
        String firstTabTitle=driver.getTitle();
        System.out.println("Control switched from second tab to first tab");
        System.out.println("first tab title : " + firstTabTitle);
		driver.quit();
	}
        
        
        
        	
        		
        	}
        
        
        