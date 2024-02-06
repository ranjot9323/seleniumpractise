package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

WebElement fn = driver.findElement(By.cssSelector("input[id='input-firstname']"));
fn.sendKeys("Ranjot");
driver.navigate().refresh();

Thread.sleep(3000);
fn.sendKeys("Guga");

//dom version changes 







	}
}
