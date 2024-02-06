package testngsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazontestwithBeforemethod {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		FirefoxOptions fo=	new FirefoxOptions();
		driver=new FirefoxDriver(fo);
		fo.addArguments("--headless");
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.com");
	}
	//tc's should not be dependent each other as not good practise 
	//AAA-Arrange,Act,Assert
	
	@Test//
	public void title() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
	}
	
	@Test
	public void searchExistTest() {
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
Assert.assertTrue(flag);	
}
	
	@Test
	public void helpExistTest() {
		
	boolean flag = driver.findElement(By.linkText("Help")).isDisplayed();
Assert.assertTrue(flag);	
}
	
	
	@AfterMethod
	public void tearDown()//teardown->what i want to do 
	{
		driver.quit();
	}
	
}
