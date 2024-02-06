package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImlicitwaitConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//sel 4.x
		driver.get("https://www.bigbasket.com/");
		
		//global wait:-now it will be applied for all elements by default
		//only for all webelemnts,svg,iframe,
		//not apploicable for shadowdom,title non webelements(title,url,alerts-js)
	}

}
