package seleniumsessions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SaucelabsStream {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
	driver.get("https://www.saucedemo.com/v1/index.html");
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();

	List<WebElement> prices = driver.findElements(By.cssSelector("div.inventory_item_price"));
	//prices.stream().forEach(e->System.out.println(e.getText()));
	
	
	//List<Double> sortedPrices = prices.stream().map(e->Double.parseDouble(e.getText().substring(1)))
	//.sorted(Comparator.reverseOrder())
	//.collect(Collectors.toList());
	
	//System.out.println(sortedPrices);
	
	//Double firstPrice = prices.stream().map(e->Double.parseDouble(e.getText().substring(1))).findFirst()
	//.get();
	
	//System.out.println(firstPrice);

	//Double lastPrice = prices.stream().map(e->Double.parseDouble(e.getText()).substring(1)))
//	.reduce((firdt,last)->last).get();//this is kind of swapping 
	
//	System.out.println(lastPrice);
	
	//which product has maximum price
	
	/*Double maxPrice = prices.stream().map(e->Double.parseDouble(e.getText().substring(1)))
	.max(Double::compareTo).get();
	
	System.out.println(maxPrice);
	Double minPrice = prices.stream().map(e->Double.parseDouble(e.getText().substring(1)))
			.min(Double::compareTo).get();
			
			System.out.println(minPrice);
	
	*/
	
	
			
			
			
			
			
			
			
			
			
			
			
			
}
}
