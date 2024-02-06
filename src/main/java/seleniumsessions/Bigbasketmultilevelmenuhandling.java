package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Bigbasketmultilevelmenuhandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new FirefoxDriver();
		
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(2000);
		
		By locator=By.xpath("//*[@id=\"headlessui-menu-button-:R5bab6:\"]/div");
		
		
		selectProductLevel4handling(locator,"Beverages", "Health Drink, Supplement", "Diabetic Drinks");
		
	}
	
	public static void selectProductLevel4handling(By locator,String l1,String l2,String l3) throws InterruptedException {
driver.findElement(locator).click();
		
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText(l1))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.linkText(l2))).build().perform();
		Thread.sleep(2000);
driver.findElement(By.linkText(l3)).click();
		
	}
}
//create for spicejet same 