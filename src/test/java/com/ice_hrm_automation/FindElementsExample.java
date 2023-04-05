package com.ice_hrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class FindElementsExample {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(5000);
        WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(searchDropDown);
        select.selectByValue("search-alias=electronics");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(5000);
        int totalResult;
        List<WebElement> mobileResults=driver.findElements(By.xpath("//div[starts-with(@data-cel-widget,'search_result_')]/descendant::h2//span"));
        totalResult=mobileResults.size();
        System.out.println("Total Result: "+totalResult);
        for(int i = 3; i<=totalResult;i++) {
        	try {
        		String nameXpath="//div[starts-with(@data-cel-widget,\"search_result_\")][" +i+ "]/descendant::h2//span";
        		System.out.print(nameXpath);
        		String priceXpath ="//div[starts-with(@data-cel-widget,'search_result_')][" +i+ "]/descendant::span[@class=\"a-price-whole\"]";
        		String mobileName = driver .findElement(By.xpath(nameXpath)).getText();
        		String mobilePrice = driver .findElement(By.xpath(priceXpath)).getText();
        		System.out.println("Price : "+mobilePrice+"Name: "+mobileName);
        	}catch (NoSuchElementException e) {
        		//System.out.println(e.getMessege());
        	}
        }
        	}
        }
        
        		