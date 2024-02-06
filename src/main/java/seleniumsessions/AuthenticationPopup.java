package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPopup {
	static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			driver=new FirefoxDriver();
	//alert(),prompt(),confirm()
			//here enter the username and pwd in the url itself
			
			String username="admin";
			String password="admin";
			driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
	
		
		//fileupload popup
		
		
		
		
		
		
		
		
		}

}
