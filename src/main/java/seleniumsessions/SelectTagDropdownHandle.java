package seleniumsessions;

import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectTagDropdownHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();

		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		By country=By.id("Form_getForm_Country");
		//WebElement country_element=driver.findElement(country);
		//Select select=new Select(country_element);//only for country dropdown
		//select.selectByIndex(6);
		//select.selectByValue("India");//use value attribute
		//select.selectByVisibleText("Canada");//use text option
		doSelectDropdownByIndex(country, 10);
		Thread.sleep(2000);
		doSelectDropdownByvalue(country, "Belgium");
		Thread.sleep(2000);
		doSelectDropdownByVisibleTextValue(country, "India");
	
	}
public static WebElement getElement(By locator) {
	return driver.findElement(locator);
}
public static void doSelectDropdownByIndex(By locator,int index) {
	Select select=new Select(getElement(locator));
	select.selectByIndex(index);
	}

public static void doSelectDropdownByvalue(By locator,String value) {
	Select select=new Select(getElement(locator));
	select.selectByValue(value);
	
}

public static void doSelectDropdownByVisibleTextValue(By locator,String value) {
	Select select=new Select(getElement(locator));
select.selectByVisibleText(value);
}





}
