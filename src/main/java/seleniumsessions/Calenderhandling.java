package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calenderhandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
	driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	
	driver.findElement(By.id("datepicker")).click();
	
	
	
	
	
	
	selctFutureDate("May 2024","32");
	
	//selectcalenderDate("14");	
	
}
	
	public static void selctFutureDate(String expectedMonthYear,String day) {
		
		if(expectedMonthYear.contains("January"&&"March"&&"May"&&"July"
				&&"August"&&"October"&&"December")&&Integer.parseInt(day)>31) {
			
			System.out.println("wrong day");
		}
		
		if(Integer.parseInt(day)>31) {
			System.out.println("wrong day");
		}
		String actualMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actualMonthYear);
		
		while(!actualMonthYear.equalsIgnoreCase(expectedMonthYear)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actualMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();	
	}
		
		selectDate(day);
	}
	
	public static void selectcalenderDate(String day) {
		List<WebElement> dayList = driver.findElements(By.cssSelector("table[class='ui-datepicker-calendar'] a"));
	for(WebElement e:dayList) {
	String text=e.getText();
	if(text.equals(day)) {
		e.click();
		break;
	}
	}
	
	
	}
	public static void selectDate(String day) {
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
		
		
	}
}
