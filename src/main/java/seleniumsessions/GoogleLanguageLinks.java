package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLanguageLinks {
	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");

	List<WebElement>languageList=	driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(languageList.size());
		for(WebElement e:languageList) {
		String text=e.getText();
		System.out.println(text);

		if(text.equals("English")) {
			e.click();
			break;
		}
		}
		
		
		//click on specific language link 
		//create 2nd () that returns the list of lanuage links
		//create generic method to get text of language and click on anspecific language
		//capture the footer links
		
		
		
}

	
	
	
	
}