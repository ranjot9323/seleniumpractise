package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LinksAttribute {
	static WebDriver driver;


	public static void main(String[] args) {
		

		//find all links on the page and print total number of links on the page
				//print the text of each link
				

					driver = new FirefoxDriver();
					
				driver.get("https://www.paypal.com/");
				
		//	By links=	By.tagName("a");
		//	List<WebElement> linksList=getElements(links);
		//	System.out.println("list of links " +linksList.size());
				//List<WebElement>linksList=driver.findElements(By.tagName("a"));
		//	for(WebElement e:linksList) {
		//	String href=e.getAttribute("href");
		//String text=	e.getText();
		//System.out.println(href + ":::"+ text);
		//	}
	}

	
	}
	
	
	
	

