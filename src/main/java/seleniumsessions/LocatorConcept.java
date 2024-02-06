package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		 driver=new ChromeDriver();
		By emailId= By.id("input-email");
		By password=By.id("input-password");

		 ElementUtil util=new ElementUtil(driver);
		 util.doSendkeys(emailId,"abc@paypal.com");
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendkeys(By locator,String value) {
		getElement(locator).sendKeys(value);
		
	}
}
