package com.ice_hrm_automation;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(5000);
        WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(searchDropDown);
        select.selectByIndex(14);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("keyboard");
        driver.findElement(By.id("nav-search-submit-button")).click();
        String Text=driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base a-text-normal\']")).getText();
        System.out.println(Text);
        
        Thread.sleep(5000);
        int totalResult;
        List<WebElement> keyboardResults=driver.findElements(By.xpath("//div[starts-with(@data-cel-widget,'search_result_')]/descendant::h2//span"));
        totalResult=keyboardResults.size();
        System.out.println("Total Result: "+totalResult);
        String text=driver.findElement(By.xpath("//span[contains(text(),'keyboard')]")).getText();
        System.out.println(text);
        if(text.equals("\"keyboard\""))
        {
        	System.out.println("Result are matching");
        }
        else
        {
        	System.out.println("Result are not matching");
        }
        
        String TotalResult=driver.findElement(By.xpath("//div[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]")).getText();
        String Result=TotalResult.substring(0,19);
        		
        

		
	}

}