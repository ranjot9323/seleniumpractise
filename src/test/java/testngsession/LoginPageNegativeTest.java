package testngsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {

	public WebDriver driver;
	public boolean doLogin(String username,String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String errorMessage = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
	System.out.println(errorMessage);
	if(errorMessage.contains("Warning: No match for E-Mail Address and/or Password")) {
		return true;
	}
	else {
		return false;
	}
	}
	
	@DataProvider
	public Object getLodinNegativeData() {
		
		return new Object[][] {
			{"lkwdhbflhjdekb","jkfbhdkejb"},
			{"wjbdfkjldeb","wjlhdfkjew"},
			{" ","3764736473"},
			{".com"," "}
		};	
	}
	
	@DataProvider
	public Object[][] registrationFormTestData() {
		return new Object[][] {
			{"heena","vaghelea","heena@abc.com","7474784845","heena@123"},
			{"gugaa","sandhu","gugaa@abc.com","7474784845","gugaa@123"},
			{"gugi","sandhu","gugi@abc.com","7474764845","gugi@123"},
			{"gugu","sandhu","gugu@abc.com","7474784845","gugu@123"},
			{"shurli","sandhu","shurli@abc.com","7474785845","shurli@123"},
		};
		
	}
	
	@BeforeTest
	public void setup() {
		driver=new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	
	//create dataprovider to orovide data to tests as we dont have to create multiple test to test one username/password
	
	@Test(dataProvider="registrationFormTestData")
	public void registertest(String fn,String ln,String email,String pn,String password) {
		
		System.out.println(fn+ln+email+pn+password);
		
		
	}
	
	@Test(dataProvider="getLodinNegativeData")//this is data driven approach
	//or parametrization 
	public void LoginTest(String username,String password) {
		
		Assert.assertTrue(doLogin(username,password));
	}
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
