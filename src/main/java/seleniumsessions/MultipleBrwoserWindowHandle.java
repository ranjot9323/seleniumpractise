package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrwoserWindowHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(3000);
String parentId=driver.getWindowHandle();
WebElement twitter=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
WebElement facebook=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
WebElement linkedn=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
WebElement youtube=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));

twitter.click();
facebook.click();
linkedn.click();
youtube.click();
Set<String>handles=driver.getWindowHandles();
Iterator<String> it=handles.iterator();

while(it.hasNext()) {
String windowId=it.next();
driver.switchTo().window(windowId);
Thread.sleep(2000);
System.out.println(driver.getCurrentUrl());
if(!windowId.equals(parentId)) {
	driver.close();

}
}
driver.switchTo().window(parentId);
System.out.println(driver.getCurrentUrl());

	//driver.quit();
	
	
	
	
	
	
	
	}
}
