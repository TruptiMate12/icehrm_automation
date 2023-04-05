package com.ice_hrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOperation {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(5000);
        WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(searchDropDown);
        select.selectByIndex(16);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
        driver.findElement(By.id("nav-search-submit-button")).click();
        		
        

		
	}

}