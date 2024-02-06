package seleniumsessions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforWindow {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

By twitter=By.xpath("//a[contains(@href,'twitter')]");
ElementUtil util=new ElementUtil(driver);

util.clickWhenReady(5, twitter);

WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	Set<String>window=driver.getWindowHandles();
	java.util.Iterator<String> it=window.iterator();
	String parentId=it.next();
	System.out.println(parentId);

	String childId=it.next();
	System.out.println(childId);

	//now switch to child window
	driver.switchTo().window(childId);
	Thread.sleep(2000);
	System.out.println(driver.getCurrentUrl());
	driver.close();//close the child window
	driver.switchTo().window(parentId);
	System.out.println(driver.getCurrentUrl());


	}
	
	public static void waitForWindow(int timeout) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	}
	
	
	
	
	
	
	
	
	
	
	
}
