package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationConcept {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("headless");
		WebDriver driver=new ChromeDriver(co);
		//navigate is internally calling the get method only.
		driver.get("https://www.paypal.com/");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println(driver.getTitle());
driver.navigate().back();
System.out.println(driver.getTitle());
	}

}
