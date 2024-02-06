package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {
	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("naveen automation labs");

	Thread.sleep(3000);
	
	By googleSuggestionList=By.xpath("//div[@role='presentation']//li//div[@class='wM6W7d']/span");
	//List<WebElement>list=driver.findElements(By.xpath("//div[@role='presentation']//li//div[@class='wM6W7d']/span"));
	//
	
doSearch(googleSuggestionList, "naveen automation labs github");
	}
	
	
	public static void doSearch(By suggestionList,String suggestionName) {
		List<WebElement>list=driver.findElements(suggestionList);

		System.out.println(list.size());
		for(WebElement e:list) {
			String text=	e.getText();
			if(text.length()>0) {
			System.out.println(text);
			}
			/*if(text.contains(suggestionName)) {
				e.click();
				break;
			}*/
			}
		
	}
}