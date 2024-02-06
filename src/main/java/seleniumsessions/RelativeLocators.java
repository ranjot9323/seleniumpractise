package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class RelativeLocators {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://www.aqi.in/dashboard/canada");
//above near, right, left,below===selenium 4.x
Thread.sleep(3000);
WebElement by=driver.findElement(By.xpath("(//a[text()='Calgary, Canada'])[position()=1]"));
String text=driver.findElement(with(By.tagName("p")).toRightOf(by)).getText();
	System.out.println(text);
	String leftindex=driver.findElement(with(By.tagName("p")).toLeftOf(by)).getText();
	System.out.println(leftindex);

	String aboveIndex=driver.findElement(with(By.tagName("p")).above(by)).getText();
	System.out.println(aboveIndex);

	String belowIndex=driver.findElement(with(By.tagName("p")).below(by)).getText();
	System.out.println(aboveIndex);
	
	//same way we can use near which will get the nearest element to that tag within the 100 pixels range
	// on naveen automation site grab text below the email address using the above 
	
	}
}