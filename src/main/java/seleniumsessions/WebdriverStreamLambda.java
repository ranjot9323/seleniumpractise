package seleniumsessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverStreamLambda {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
	driver.get("https://www.paypal.com/");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	//links.stream().forEach(e -> System.out.println(e.getText()));
	//links.stream().filter(e->!e.getText().isEmpty()).forEach(e->System.out.println(e.getText()));here ignore the empty text field
	
	/*links.stream().filter(e->!e.getText().isEmpty())
	.filter(e->e.getText().startsWith("S"))
	.forEach(e->System.out.println(e.getText()));*/
	
	List<WebElement> paypalLinks = links.stream().filter(e->!e.getText().isEmpty())
	.filter(e->e.getText().startsWith("S"))
	.collect(Collectors.toList());
	
List<String> list= paypalLinks.stream().map(e->e.getText()).collect(Collectors.toList());
	
	System.out.println(list);
	System.out.println(list.size());

	}
	//foreach and for are much faster then the streams 
	//we use stream only we have limited amount of data like 100,200 elements
	
	
	
	
	
	
	
}
