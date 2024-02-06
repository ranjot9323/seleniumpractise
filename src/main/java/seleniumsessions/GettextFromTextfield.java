package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettextFromTextfield {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
	WebElement fn = driver.findElement(By.cssSelector("input[id='input-firstname']"));
	fn.sendKeys("Ranjot");
	String name = fn.getAttribute("value");
	System.out.println(name);
	
	WebElement lastname = driver.findElement(By.cssSelector("input[id='input-lastname']"));
lastname.sendKeys(null);//cannot pass null value in sendkeys , it will give illegalargumetnexception
	
	
	
	
	
	
	}
	
	
}
