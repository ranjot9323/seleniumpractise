package seleniumsessions;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetElementsFromSection {

static WebDriver driver;		

	public static void main(String[] args) {

		driver = new FirefoxDriver();

		driver.get("https://www.paypal.com/");	
//List<WebElement> footerLinks=driver.findElements(By.xpath("//footer[@id=\"footer\"]//a"));
//System.out.println("links on the footer " +footerLinks);
	
//for(WebElement e:footerLinks) {
//	String text=e.getText();
//	System.out.println("text is " + text);
//}
	By footerLinks=	By.xpath("//footer[@id=\"footer\"]//a");
List<String>footerTextList=getElements(footerLinks);
System.out.println(footerTextList);
	}
	
	
	
	public static List<WebElement> getElements(By locator) {
	return	driver.findElements(locator);
	}
	
}
