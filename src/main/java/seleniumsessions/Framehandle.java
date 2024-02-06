package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framehandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://www.londonfreelance.org/courses/frames/index.html");



driver.switchTo().frame("content");
String gettext=driver.findElement(By.tagName("h1")).getText();
System.out.println(gettext);
int totalFrame=driver.findElements(By.xpath("//frame")).size();
System.out.println(totalFrame);
driver.switchTo().defaultContent();//go back to main window


//iframe, frame two types of frame 
//iframe==security of web element
//iframes are now deprecated so new apps now use iframe
//****************************************
//iframe handle 





	}

}
