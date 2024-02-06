package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {
//find all links on the page and print total number of links on the page
		//print the text of each link
		

			driver = new FirefoxDriver();
			
		driver.get("https://www.paypal.com/");
		List<WebElement>linksList=driver.findElements(By.tagName("a"));
		
		int	listCount=linksList.size();
		System.out.println("total count of links : " + listCount);
		
		//for(int i=0;i<listCount;i++) {
			
		//String text=linksList.get(i).getText();
		//if(text.length()>0) {
		//System.out.println(i + ": " + text);
		//}
	//	}
		
		//print text of each link and avoid blank text
		//assighnment:count total blank count 
		
		//using foreach loop
		for(WebElement e:linksList) {
			String text=e.getText();
			if(text.length()>0) {
			System.out.println(text);
			}
		}
		
		
		
	}

}
