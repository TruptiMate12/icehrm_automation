package com.ice_hrm_automation;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;



public class BrokenImg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        List<WebElement> links = driver.findElements(By.tagName("img"));
        for(int i=0;i<links.size();i++)
        {
        	WebElement element=links.get(i);
        	String url=element.getAttribute("src");
        	//if(url!=null && !url.equals("javascript: void()"))
        	//{
        		try
        		{
        			URL uri=new URL(url);
        			URLConnection urlConnection=uri.openConnection();
        			HttpURLConnection httpURLConnection=(HttpURLConnection)urlConnection;
        			httpURLConnection.connect();
        			int statuscode=httpURLConnection.getResponseCode();
        			if(statuscode<=300)
        			{
        				System.out.println("Broken Url: "+" status code: " +statuscode+" url: "+url);
        				
        			}
        			httpURLConnection.disconnect();
        		}
        		catch(Exception ignored)
        		{
        			
        		}
        		
        	//}
        }
        driver.close();
        
        	
	}

}