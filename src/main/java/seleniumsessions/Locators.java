package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.paypal.com/us/brc");
		
		driver.findElement(By.id("id")).click();
		//xpath:
		By emailId=By.xpath("//*[@id=\"input-email\"]");
		
		//for links:
		driver.findElement(By.linkText("Register")).click();//or 
		
		//get text:links,headers,paragraph
		
		
		By registerLink=By.linkText("Register");
		doClick(registerLink);
	
doSendKeys(emailId,"abc@paypal.com");
	
	}
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	
}
