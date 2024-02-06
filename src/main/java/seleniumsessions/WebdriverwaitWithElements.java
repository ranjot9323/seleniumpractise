package seleniumsessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverwaitWithElements {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
//alert(),prompt(),confirm()
		
		driver.get("https://www.freshworks.com/s");
		By footer=By.cssSelector("footer a");
		//WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
		
	//	List<WebElement> footerList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footer));
		waitForElementsPresence(footer, 5);
		waitForElementsVisibility(footer,5);
		//System.out.println(footerList);
		
		
		
		
		
		
	}
	public static List<WebElement> waitForElementsPresence(By locator ,int timeout) {
WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		return  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	public static List<WebElement> waitForElementsVisibility(By locator ,int timeout) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeout));
				
				return  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			}
	
}
