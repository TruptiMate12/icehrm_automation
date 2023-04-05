package com.ice_hrm_automation;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown2Operations {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
       
       driver.get("https://www.amazon.in");
       WebElement searchDropDown=driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(searchDropDown);
        List<WebElement>dropDownValues= select.getOptions();
        for(int i=0;i<dropDownValues.size();i++) {
        	WebElement element=dropDownValues.get(i);
        	String dropdownValue=element.getText();
        	System.out.println(dropdownValue);
        	
       }
        
        select.selectByVisibleText("Electronics");
        select.selectByValue("search-alias=electronics");
        select.selectByIndex(16);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
         driver.findElement(By.id("nav-search-submit-button")).click();
       driver.close();
        
        driver.get("https://mdbootstrap.com/docs/standard/extented/multiselect/");
        WebElement multiSelectDropDown = driver.findElement(By.xpath("section[@id='section-basic-example']/section[1]//select"));
        Select select1 = new Select(multiSelectDropDown);
        
        Thread.sleep(1000);
        select1.deselectAll();
        
        /*select1.deselectByIndex();
        select1.deselectByVisibleText();*/
        
        List<WebElement>multiDropDownValues= select1.getOptions();
        for(int i=0;i<multiDropDownValues.size();i++)
        {
        	WebElement element=multiDropDownValues.get(i);
        	String dropDownValue=element.getAttribute("value");
        	System.out.println(dropDownValue);
        	
        
        }
        System.out.println("printing all selected values from dropdown");
        List<WebElement> selectedOptions=select1.getAllSelectedOptions();
        for(int i=0;i<selectedOptions.size();i++)
        {
        	WebElement element=selectedOptions.get(i);
        	String selectedValue = element.getAttribute("value");
        	System.out.println(selectedValue);
        	select1.deselectByValue(selectedValue);
        	
        	
        }
          
      
	}
	}