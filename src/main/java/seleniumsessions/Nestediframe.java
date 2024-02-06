package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestediframe {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
driver.get("https://selectorshub.com/iframe-scenario/");

driver.switchTo().frame("pact1");
driver.findElement(By.id("inp_val")).sendKeys("guga");

driver.switchTo().frame("pact2");
driver.findElement(By.id("jex")).sendKeys("gugu");


driver.switchTo().parentFrame();
driver.findElement(By.id("inp_val")).sendKeys("kanwar");

driver.switchTo().frame("pact2").switchTo().frame("pact3").findElement(By.id("glaf")).sendKeys("gugi");
//driver.switchTo().frame("pact3");
//driver.findElement(By.id("glaf")).sendKeys("gugi");

driver.switchTo().parentFrame();
driver.switchTo().parentFrame();

//driver.switchTo().defaultContent();
driver.findElement(By.id("inp_val")).sendKeys("guga");






	}
}
