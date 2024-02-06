package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforFrame {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://www.londonfreelance.org/courses/frames/index.html");


waitForFrameAndSwitchToItByIdOrName(5, "content");

//waitForFrameAndSwitchToItByFrameElement(5, driver.findElements(By.xpath("//frame")));
//driver.switchTo().frame("content");
String gettext=driver.findElement(By.tagName("h1")).getText();
System.out.println(gettext);
//int totalFrame=driver.findElements(By.xpath("//frame")).size();
//System.out.println(totalFrame);
driver.switchTo().defaultContent();

	}
	public static void waitForFrameAndSwitchToItByIdOrName(int timeout,String idOrName) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}
	
	public static void waitForFrameAndSwitchToItByIndex(int timeout,int index) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}
	public static void waitForFrameAndSwitchToItByFrameElement(int timeout,WebElement frameElement) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
	
	public static void waitForFrameAndSwitchToItByLocator(int timeout,By frameLocator) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	
	
	
	
	
	
	
}
