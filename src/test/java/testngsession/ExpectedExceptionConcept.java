package testngsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	WebDriver driver;

	@Test(expectedExceptions=Exception.class)//we can add exceptions here so the test doesnot fail

	public void title() {
		
		
//		FirefoxOptions fo=	new FirefoxOptions();
//		driver=new FirefoxDriver(fo);
//		fo.addArguments("--headless");
//		String title=driver.getTitle();
		System.out.println("login test");
		int i=9/0;
//		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
	}
	//when we are doing demo to the client we can do but dont use it .
	
}
