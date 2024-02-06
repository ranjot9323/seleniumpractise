package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTablehandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new FirefoxDriver();
		
		driver.get("https://www.espncricinfo.com/series/england-in-india-2023-24-1389386/india-vs-england-1st-test-1389399/full-scorecard");
		Thread.sleep(4000);
		//driver.findElement(By.name("username")).sendKeys("newautomation");
		//driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		//driver.findElement(By.xpath("//input[@value='login']")).click();
		
		
		//Thread.sleep(4000);

		String Wickettakername=getWicketTakername("Joe Root");
		System.out.println(Wickettakername);
		
		Wickettakername=getWicketTakername("Ben Stokes");
		System.out.println(Wickettakername);
		

		List<String>benDucketScore=getScoreCard("Ben Duckett");
		System.out.println(benDucketScore);
	}
	
	public static String getWicketTakername(String batsmanName) {
		
	return	driver.findElement(By.xpath("(//span[text()='"+batsmanName+"'])[position()=1]/ancestor::td/following-sibling::td//span/span")).getText();
	}
	
	public static List<String> getScoreCard(String playerName) {
		List<WebElement>scoreList=driver.findElements(By.xpath("(//span[text()='"+playerName+"'])[position()=1]/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
	
		List<String> playerScoreList=new ArrayList<String>();
		for(WebElement e:scoreList) {
	String  text=e.getText();
	playerScoreList.add(text);
	}
	return playerScoreList;
	
	
	}

}
