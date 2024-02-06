package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebtablePagination {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//single selection of a countyr
		/*while(true) {
			
			if(driver.findElements(By.xpath("//td[text()='ranjot']")).size()>0) {
				
				selectCountry("ranjot");
				break;
			}
			else {
				//pagination logic
				WebElement nextButton = driver.findElement(By.linkText("Next"));
				if(nextButton.getAttribute("class").contains("disabled")) {
					System.out.println("country not found");
					break;
				}
				nextButton.click();
				//Thread.sleep(2000);
			}
			//what if countryname is not present
		}
	}
			public static void selectCountry(String countryname) {
				
			driver.findElement(By.xpath("//td[text()='"+countryname+"']/preceding-sibling::td/input[@type='checkbox']")).click();
		}*/
		
		
		
		//click only on india nd move to next page -- this is multi selection 
		
		while(true) {
if(driver.findElements(By.xpath("//td[text()='India']")).size()>0) {
				
	selectMultipleCountry("India");		
}
WebElement nextButton = driver.findElement(By.linkText("Next"));
if(nextButton.getAttribute("class").contains("disabled")) {
	System.out.println("country not found");
	break;
}
nextButton.click();
Thread.sleep(2000);
	}	
	}
//public static void selectCountry(String countryname) {
	
	//driver.findElement(By.xpath("//td[text()='"+countryname+"']/preceding-sibling::td/input[@type='checkbox']")).click();
//}

public static void selectMultipleCountry(String countryname) {
	
	List<WebElement> checkBoxList = driver.findElements(By.xpath("(//td[text()='"+countryname+"'])/preceding-sibling::td/input[@type='checkbox']"));

for(WebElement e:checkBoxList) {
	e.click();
}



}









}
