package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownWithoutSelect {
	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();

		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		By options=By.xpath("//select[@id='Form_getForm_Country']/option");
		List<WebElement>optionsList=driver.findElements(options);
		System.out.println(optionsList);
		
		for(WebElement e:optionsList) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals("India")) {
				e.click();
				break;
				//create utility as homework.
			}

		}
		
		
}
}