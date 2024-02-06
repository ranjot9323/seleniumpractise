package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotallinksusingStream {
	static WebDriver driver;

	public static void main(String[] args) {

		

			driver = new FirefoxDriver();
			
		driver.get("https://www.paypal.com/");
	//	driver.findElements(By.tagName("a"))
		/*.parallelStream().filter(e->!e.getText().isEmpty())
		.forEach(e->System.out.println(e.getText()));*/
		
		//using //stream 
		//for every element individual stream will be created in the background
		//its not asynchronous 
		
		//output is not in order so can be used whn not bothered about the order
		//use it when we have data in 1000s
		
		List<String>list=new ArrayList<String>();
		
		
		List<WebElement> listOfAllLinks = driver.findElements(By.tagName("a"))
		.stream().filter(e->!e.getText().isEmpty())
		.collect(Collectors.toList());
		//.map(e->list.add(e.getText()));
		listOfAllLinks.forEach(e->list.add(e.getText()));
		
		System.out.println(list);
		
	}
}
