package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FooterSectionConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	

		System.out.println(getFooterSectionList("Information"));
		System.out.println(getFooterSectionList("Extras"));

	
	
	
	}
	public static List<String> getFooterSectionList(String sectionName) {
		List<WebElement>sectionList=driver.findElements(By.xpath("//h5[text()='"+sectionName+"']/following-sibling::ul//a"));
		System.out.println(sectionList.size());
		List<String>secvalList=new ArrayList<String>();
	for(WebElement e:sectionList) {
		String text=e.getText();
		secvalList.add(text);
	}
	return secvalList;
	}
}
