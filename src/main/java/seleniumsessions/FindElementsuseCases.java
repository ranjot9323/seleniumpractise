package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FindElementsuseCases {

	static WebDriver driver;		

		//find all links on the page and print total number of links on the page
				//print the text of each link	

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		
	driver.get("https://www.paypal.com/");	
	By links=By.tagName("a");
	}

	public static int getTotalElementsCount(By locator) {
	int elementCount=	getElements(locator).size();
	System.out.println(elementCount);
	return elementCount;
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	
	
	
	
	
	
	
}
