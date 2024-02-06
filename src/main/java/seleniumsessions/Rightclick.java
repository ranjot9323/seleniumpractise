package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	
	
	WebElement Element = driver.findElement(By.xpath("//span[text()='right click me']"));
	
	Actions action=new Actions(driver);
action.contextClick(Element).build().perform();
	
	List<WebElement>Elementlist = driver.findElements(By.cssSelector("ul[class='context-menu-list context-menu-root'] span"));
System.out.println(Elementlist.size());
for(WebElement e:Elementlist) {
	String text=e.getText();
	System.out.println(text);
	if(text.equals("quit")) {
		e.click();
		break;
	}

}
	
}
}
