package seleniumsessions;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserWindowhandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(3000);

WebElement twitter=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
twitter.click();
Set<String>window=driver.getWindowHandles();
java.util.Iterator<String> it=window.iterator();
String parentId=it.next();
System.out.println(parentId);

String childId=it.next();
System.out.println(childId);

//now switch to child window
driver.switchTo().window(childId);
Thread.sleep(2000);
System.out.println(driver.getCurrentUrl());
driver.close();//close the child window
driver.switchTo().window(parentId);
System.out.println(driver.getCurrentUrl());

driver.quit();//



	}

}
