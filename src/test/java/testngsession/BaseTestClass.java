package testngsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

//this will be super calss of all classes  we will put common code from all other classes in this calss
public class BaseTestClass {

	WebDriver driver;
	
	@Parameters({"url","browser"})
	@BeforeTest
	public void setup(String url,String browserName) {
		System.out.println("running tests on : "+browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			//FirefoxOptions fo=	new FirefoxOptions();
		driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("safari")) {
			//FirefoxOptions fo=	new FirefoxOptions();
		driver=new SafariDriver();
		}
		else
		{
			System.out.println("pass the right browser :"+browserName);
		}
		//fo.addArguments("--headless");
		driver.manage().deleteAllCookies();	
		driver.get(url);
	}
	
	
	
	@AfterTest
	public void tearDown()//teardown->what i want to do 
	{
		driver.quit();
	}
}
