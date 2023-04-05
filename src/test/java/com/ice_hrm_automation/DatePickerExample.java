package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.LocalDateTime;
import java.util.List;

public class DatePickerExample {

	public static void main(String[]args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://cybersuccess.icehrm.com/");

driver.findElement(By.id("username")).sendKeys("admin");
//username.sendKeys("admin");

driver.findElement(By.id("password")).sendKeys("2zuzfakn");
//sendKeys("2zuzfakn");

//WebElement loginButton
driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
//loginButton.click();
Thread.sleep(5000);
driver.findElement(By.xpath("//span[text()='Employees']")).click();
driver.findElement(By.xpath("//ul[@id='admin_Employees']/li/a")).click();
//driver.findElement(By.xpath("//a[text()='Employees']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@type='button']/span[2]")).click();
int Birthday=2000;
//get the today date
int currentDay= LocalDateTime.now().getDayOfMonth();
/*LocalDateTime.now().getDayOfWeek();
LocalDateTime.now().getMonthValue();*/
Thread.sleep(5000);
//click on calendar
driver.findElement(By.id("birthday")).click();
//get all current month days 
//List<WebElement> days = driver.findElements(By.xpath("//td[@class='ant-picker-cell-in-view')]/div"));
List<WebElement> days = driver.findElements(By.xpath("//td[@class='ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today']"));
//iterate through each day of month
//driver.findElement(By.xpath("//td[@class='ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today']")).click();
driver.findElement(By.xpath("//driver[text()='6']")).click();
for(WebElement element : days) {
	String day = element.getText();
	String today = String.valueOf(currentDay);
	if(days.equals(today)) {
		element.click();
	}

	}
	}
}


