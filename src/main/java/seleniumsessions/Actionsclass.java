package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://www.paypal.com/brc/");

	WebElement personalnav = driver.findElement(By.xpath("(//a[@class='_glnv-header__subnav-control_rebnj_393 _main-link_rebnj_375'])[position()=1]"));
	
	Actions action=new Actions(driver);
	action.moveToElement(personalnav).build().perform();
	
	//perform keboard actions.
	//action.keyDown(personalnav, Keys.SHIFT("ranjot"));
	
	
	//for zoom use javascriptexecutor will only work for chrome and not with firefox
	//document.body.style.zoom=50%   OR
	//	//document.body.style.zoom=.8%

	
	
	
	
	
	
	
	
	}
}