package seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverwaitwithFluentfeatures {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://www.freshworks.com");
By freeTrails=By.xpath("//a[text()='Free trials']");

//webdriver wait with features from fluent wait class
WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
wait.pollingEvery(Duration.ofSeconds(2));
wait.ignoring(NoSuchElementException.class)
.ignoring(StaleElementReferenceException.class)
.withMessage("element not found");

	wait.until(ExpectedConditions.presenceOfElementLocated(freeTrails)).click();


//sleep=interval time


	}
}
