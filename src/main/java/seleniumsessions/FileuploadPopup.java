package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileuploadPopup {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

//<tag> should be file for file upload 
// else we will use autoIT(only for windows) or Sikuli--- not recommended
//in the sendkeys give the path of file we want to upload
driver.findElement(By.name("upfile")).sendKeys("/Users/ranjotgill/Downloads/W308034024.pdf");
		
	
	
	
	
	
	
	
	}

}
