package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementAttribute {
	
	static WebDriver driver;

	public static void main(String[] args) {
driver=new FirefoxDriver();
driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//String attribute=driver.findElement(By.name("firstname")).getAttribute("placeholder");
//		System.out.println("attribute is :" +attribute);
		
		By fn=By.name("firstname");
		
		String value=getElementAttribute(fn, "placeholder");
		System.out.println("attribute is :" +value);

}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static String getElementAttribute(By locator,String attribute) {
		return getElement(locator).getAttribute(attribute);
	}
	
	
	
	
}
