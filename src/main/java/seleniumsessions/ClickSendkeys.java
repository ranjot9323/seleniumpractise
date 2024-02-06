package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickSendkeys {
	static WebDriver driver;

	public static void  main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	

By firstname=By.id("input-firstname");
By lastname=By.id("input-lastname");
By contunue=By.cssSelector("input[type='submit']");

//Actions action=new Actions(driver);
//action.sendKeys(driver.findElement(firstname), "ranjot").build().perform();
//action.sendKeys(driver.findElement(lastname),"singh").build().perform();
//action.click(driver.findElement(contunue)).build().perform();
//when element not interactable/intercepted

doActionSendkeys(firstname, "ranjot");
doActionSendkeys(lastname, "singh");
doActionClick(contunue);


	}
public static WebElement getElement(By locator) {
	return driver.findElement(locator);

	}

public static void doActionSendkeys(By locator,String value) {
	Actions action=new Actions(driver);
	action.sendKeys(getElement(locator),value).build().perform();

}

public static void doActionClick(By locator) {
	Actions action=new Actions(driver);

	action.click(getElement(locator)).build().perform();
}
}
