package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisabletextField {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://seleniumpractise.blogspot.com/2016/");
//on adisabled text filed it gives element not interactable exception

//clickinterceptedexception for a disabled button

//for invalid locator syntax
//invalidselectorexception 

//valid locator syntax but wrong locator value
//nosuchelementexception


//noalertpresentexception of no alert present
//noframepresentexception
//nobrowserwindowexception
//superclass of all exceptions is Exceptions
//WebDriverException is parent of all selenium exceptions
//stalelementexception:element is there but rotten .











	}
}
