package com.ice_hrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class washingDropDown {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        //Thread.sleep(5000);
        WebElement DropDown = driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(DropDown);
        select.selectByValue("search-alias=electronics");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Washing Machine");
        driver.findElement(By.id("nav-search-submit-button")).submit();
        Thread.sleep(5000);
        int totalResult;
        List<WebElement> Result=driver.findElements(By.xpath("//div[starts-with(@data-cel-widget,'search_result_')]/descendant::h2//span"));
        totalResult=Result.size();
        System.out.println("total "+totalResult);
        for(int i = 3; i<=totalResult;i++) {
        	try {
        		String nameXpath="//div[starts-with(@data-cel-widget,\"search_result_\")][" +i+ "]/descendant::h2//span";
        		//System.out.print(nameXpath);
        		String priceXpath ="//div[starts-with(@data-cel-widget,'search_result_')][" +i+ "]/descendant::span[@class=\"a-price-whole\"]";
        		String washingMachineName = driver .findElement(By.xpath(nameXpath)).getText();
        		String price = driver .findElement(By.xpath(priceXpath)).getText();
        	
        		price=price.replace(",","");
        		int resultPrice=Integer.parseInt(price);
        		
        		if(resultPrice>=20000) {
        			//System.out.println("resultPrice");	
        			System.out.println("Price : "+ price +" "+"Name: "+washingMachineName);
        		}
        	}catch  (Exception e) {
        		//System.out.println(e.getMessege());
        	}
        }
        	}
        }
        
        		