package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.LocalDateTime;
import java.util.List;
import java.time.format.DateTimeFormatter;

public class DatePickerExample2 {
	static WebDriver driver;
	public static void selectDayFromCalendar(int futureDay) {
		driver.findElement(By.id("onward_cal")).click();
		List<WebElement> days = driver.findElements(By.xpath("//td[@class='current day'or @class='we day' or @class='wd day']"));
		int currentDay= LocalDateTime.now().getDayOfMonth();
		int dayToSelect = currentDay + futureDay;
		for(WebElement element : days) {
			String day = element.getText();
			String today = String.valueOf(dayToSelect);
			if(day.equals(today)) {
				element.click();
				break;
		}
		
	}
	
}

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.redbus.in/");
Thread.sleep(1000);
//String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
//System.out.println(date);

selectDayFromCalendar(4);
}
}
