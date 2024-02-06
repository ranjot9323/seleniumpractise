package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SvgElements {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://petdiseasealerts.org/forecast-map/#/");
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));


String svgXpath="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
List<WebElement> stateList = driver.findElements(By.xpath(svgXpath));
//command+shift+2--shortcut for assign any return type
System.out.println(stateList.size());

for(WebElement e:stateList) {
	String statename=e.getAttribute("name");
	System.out.println(statename);
	
	if(statename.equals("New York")) {
		e.click();
		break;
	}

}









	}
}
