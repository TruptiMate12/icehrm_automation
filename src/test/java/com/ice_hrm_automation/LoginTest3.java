package com.ice_hrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LoginTest3 {

	public static void main(String[] args) {
//Setup the system property for edgedriver file
		System.setProperty("webdriver.edge.driver","msedgedriver.exe");
//create instance of edge driver class to launch browser
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://cybersuccess.icehrm.com/");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("2zuzfakn");
		WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
          loginButton.click();
          String homeText=driver.findElement(By.xpath("//header[@id='delegationDiv]/a")).getText();
          System.out.println(homeText);
          if(homeText.equals("Home")) {
        	  System.out.println("Test cases is passed");
          }else {
        	  System.out.println("failed to login to application");
          }
          //verify login feature with valid username and invalid password
          driver.findElement(By.xpath("logout xpath")).click();
          driver.findElement(By.xpath("sigh out xpath")).click();
          username.sendKeys("fdfdf");
          password.sendKeys("12t482384");
          loginButton.click();
          if(homeText.equals("Home")) {
        	  System.out.println("Test cases is passed");
          }else {
        	  System.out.println("failed to login to application");
        	//verify login feature with invalid username and invalid password
              driver.findElement(By.xpath("logout xpath")).click();
              driver.findElement(By.xpath("sigh out xpath")).click();
              username.sendKeys("");
              password.sendKeys("");
              loginButton.click();
              if(homeText.equals("Home")) {
            	  
        	  
          }
        	
		
		
		}
		// TODO Auto-generated method stub

	}

}
