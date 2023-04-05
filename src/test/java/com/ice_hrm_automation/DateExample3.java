package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.LocalDateTime;
import java.util.List;
import java.time.format.DateTimeFormatter;

public class DateExample3 {
	static WebDriver driver;
	public static void selectDayFromCalendar(int currentDate) {
		driver.findElement(By.id("onward_cal")).click();
		List<WebElement> allDays = driver.findElements(By.xpath("//td[@class='current day'or @class='wd day']"));
		int currentDay= LocalDateTime.now().getDayOfMonth();
		//int dayToSelect = currentDay + futureDay;
		for(WebElement element : allDays) {
			String day = element.getText();
			String today = String.valueOf(currentDay);
			if(day.equals(today)) {
				element.click();
				break;
	//public static void selectDayFromCalendar(int day,String month,String year);
	//if(!year.equals(driver.findElement(By.xpath("")).getText())) {
		
		}
		
	}
	
}

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
driver.navigate().to("https://www.redbus.in/");
Thread.sleep(1000);
String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
System.out.println(date);

selectDayFromCalendar(4);
}
}
