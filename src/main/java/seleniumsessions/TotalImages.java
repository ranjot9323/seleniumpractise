package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalImages {
		static WebDriver driver;

		public static void main(String[] args) {
		driver = new FirefoxDriver();
				
		driver.get("https://www.paypal.com/");
		List<WebElement>imageList=driver.findElements(By.tagName("img11"));
	
	int imageCount=	imageList.size();
		System.out.println(imageCount);
		
		//with findElements is doesnt give any exception instead it gives the count as 0 when it doesnt find the element 
		
		
		
		
		
		
		}

}
