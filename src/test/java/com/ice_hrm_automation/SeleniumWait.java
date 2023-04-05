package com.ice_hrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;

import java.time.Duration;



public class SeleniumWait {
	public void fluentWait(WebDriver driver,By by) {
	Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	wait.until((d)-> {
		System.out.println("verifying element to available for operation");
		return d.findElement(by);
	});
	}
	

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(5000);
		// TODO Auto-generated method stub
        SeleniumWait obj = new SeleniumWait();
        obj.fluentWait(driver, By.id("searchDropdownBox"));
        
      /*  Function<WebDriver,WebElement> function= new Function<>() {
        	public WebElement apply(WebDriver wedDriver) {
        		System.out.println("verifying element to available for operation");
        		return webDriver.findElement(By.id("searchDropdownBox"));
        	}
         };*/

	}
//alternate of above implementation

		
		}
	
