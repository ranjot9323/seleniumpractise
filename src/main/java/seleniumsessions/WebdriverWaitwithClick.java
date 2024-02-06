package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWaitwithClick {
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			driver=new FirefoxDriver();
	driver.get("https://www.freshworks.com");
	By freeTrails=By.xpath("//a[text()='Free trials']");
	//WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
	//wait.until(ExpectedConditions.elementToBeClickable(freeTrails));
	clickWhenReady(5,freeTrails);
		}
		public static WebElement waitForElementToBeClickable(int timeout,By locator) {
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return	wait.until(ExpectedConditions.elementToBeClickable(locator));
		}
		
		
		public static void clickWhenReady(int timeout,By locator) {
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		}
		public void doClickWithActionsAndWait(int timeout,By locator) {
			WebElement Element = waitForElementToBeClickable(timeout,locator);
			Actions action =new Actions(null);
			action.click(Element).build().perform();
		}
}
