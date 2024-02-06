package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://jqueryui.com/droppable/");


driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
WebElement dropable = driver.findElement(By.xpath("//div[@id='droppable']"));

Actions action=new Actions(driver);
action.clickAndHold(draggable).moveToElement(dropable)
.build().perform();








	}
}
