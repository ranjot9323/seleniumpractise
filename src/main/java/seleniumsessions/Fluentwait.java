package seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://www.freshworks.com");
By freeTrails=By.xpath("//a[text()='Free trials']");

//fluent wait is child of wait interface 
//webdriver wait is child of fluent wait

/*Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(6))
.ignoring(NoSuchElementException.class)
.ignoring(StaleElementReferenceException.class)
.pollingEvery(Duration.ofSeconds(2)).withMessage("element not found");

WebElement freetrailElement = wait.until(ExpectedConditions.presenceOfElementLocated(freeTrails));
freetrailElement.click();*/
//polling time=interval time send request after interval of certain ms 
//default polling time is 500ms

waitForElementPresenceWithFluentWait(6,2,freeTrails).click();
	}
	public static WebElement waitForElementPresenceWithFluentWait(int timeout,int pollingTime,By locator)
	{
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.pollingEvery(Duration.ofSeconds(pollingTime)).withMessage("element not found");
		
		 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static void waitForAlertWithFluentWait(int timeout,int pollingTime,By locator)
	{
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.ignoring(NoAlertPresentException.class)
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.withMessage("element not found");
		
		  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	
	
	
	
	
}
