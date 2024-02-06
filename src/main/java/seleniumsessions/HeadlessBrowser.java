package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
//headless:without opening browser perform the testing ,browser is not visible 
		//running tc's in the headless so its fast then normal testing 
		ChromeOptions co=new ChromeOptions();
		FirefoxOptions fo=new FirefoxOptions();
		WebDriver driver=new FirefoxDriver(fo);

		fo.addArguments("--headless");

//co.addArguments("headless");
//co.addArguments("--incognito");
//WebDriver driver=new ChromeDriver(co);
driver.get("https://www.paypal.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.quit();
		
		
		
		
		
		
	}

}
