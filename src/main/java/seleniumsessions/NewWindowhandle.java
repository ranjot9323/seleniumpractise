package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindowhandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(3000);
String parentId=driver.getWindowHandle();
driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://www.google.com/");
System.out.println(driver.getTitle());
driver.close();
driver.switchTo().window(parentId);
System.out.println(driver.getTitle());
driver.quit();


//random pop up:cannot handle it .
//in test env we can block these kind of popups








	}
}