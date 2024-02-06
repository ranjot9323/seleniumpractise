package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShadowDomhandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
Thread.sleep(3000);
//driver.findElement(By.id("pizza")).sendKeys("pizza");

//browser-->page->shadowdom->shadow-->element

JavascriptExecutor js=(JavascriptExecutor)driver;
WebElement pizza= (WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
	pizza.sendKeys("pizza");
	
	//scrollinto view and click using js executor
	//shadowroot should be open, if its closed no tool can utomate it .
	//use case of shadow dom:for data/element security
	
	//javascriptUtil for scrolling the page 
	
	
}
}
