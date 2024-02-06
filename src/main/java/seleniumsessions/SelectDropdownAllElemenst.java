package seleniumsessions;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownAllElemenst {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();

		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		By country=By.id("Form_getForm_Country");
		/*
		 * / }
		 */
}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getDropdownOptionsList(By locator) {
		Select select=new Select(getElement(locator));
		return select.getOptions();
		
		}
	
	public static void getDropdowntextList(By locator) {
		List<WebElement>optiosnList=getDropdownOptionsList(locator);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
