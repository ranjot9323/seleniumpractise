package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotPresent {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By logoImage=By.className("img-responsive111");

		
		boolean flagImage=driver.findElement(logoImage).isDisplayed();// this line will throw exception
		System.out.println(flagImage);
		//find elemtn will throw nosuch element exception
		
		
		
		
	}

}
