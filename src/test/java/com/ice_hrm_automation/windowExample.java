package com.ice_hrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;*/
import java.util.List;
import java.util.Set;


public class windowExample {

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
        		
        		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        		for(WebElement element : allLinks) {
        			System.out.println(element.getAttribute("href"));
        		}
               /* for(int i=0;i<links.size();i++)
                {
                	WebElement element=links.get(i);
                	String url=element.getAttribute("href");
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
                }*/
        		
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

    
        
        