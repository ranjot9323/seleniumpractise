package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitconcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new FirefoxDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
	By email=By.id("input-email");
	By password=By.id("input-password");
	By loginButton=By.id("//input[@value='Login']");
	//email_element.sendKeys("abc@paypal.com");
	
	waitForElementVisibility(email, 5).sendKeys("abc@paypal.com");
	getElement(password).sendKeys("password");
	getElement(loginButton).click();
	
	
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static WebElement waitForElementVisibility(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));//untill() is coming from wait class 
	//visibilityOfElementLocated()-- element is present in dom and visible on the page
	
	}
	
	
		
}
