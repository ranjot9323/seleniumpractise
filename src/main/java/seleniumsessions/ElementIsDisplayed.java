package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	static WebDriver driver;
	public static void main(String[] args) {

		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	//boolean flag=driver.findElement(By.className("img-responsive")).isDisplayed();
	
	//if(flag) System.out.println("pass");
	
	By logoImage=By.className("img-responsive");
	
	if(doElementIsDsiplayed(logoImage)){
		System.out.println("image is present");
	}
	}
	
	public static WebElement getElement(By locator) {
		 return driver.findElement(locator);
	}

public static boolean doElementIsDsiplayed(By locator) {
	return getElement(locator).isDisplayed();
}




}
