package com.ice_hrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
		
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

		public class windowExample2 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				// TODO Auto-generated method stub
		        WebDriver driver=new ChromeDriver();
		        driver.get("https://www.google.com/");
		        System.out.println("First Tab Title :"+driver.getTitle());
		        String firstTabId= driver.getWindowHandle();
		        driver.switchTo().newWindow(WindowType.WINDOW);
		        driver.navigate().to("https://www.flipcart.com/");
		        System.out.println("Second Tab Title :"+driver.getTitle());
		        driver.close();
		        driver.switchTo().window(firstTabId);
		        System.out.println("switched control back to first tab and title : "+driver.getTitle());
		        driver.close();
		        
		        
		        

	}

}