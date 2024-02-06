package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.paypal.com/us/brc");
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String source=driver.getPageSource();
		//System.out.println(source);
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Business Resource Centre")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");

		}
		driver.close();
		driver.getTitle();
	}

}
