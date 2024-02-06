package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	private WebDriver driver;
	
	public WebDriver initDriver(String browsername) {
		System.out.println("browser name is "+browsername);
		switch (browsername.toLowerCase().trim()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "edge":
			driver=new EdgeDriver();
			break;
			
		case "safari":
			driver=new SafariDriver();
			break;
			default:
				System.out.println("pass the correct browser "+browsername);
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}

	public void launchUrl(String url) {
		if(url==null) {
			System.out.println("url cannot be null");
		}
		
		if(url.indexOf("https")==0) {
			driver.get(url);
		}
	}
	
	public String getPageTitle() {
		String title =driver.getTitle();
		System.out.println("page title is "+title);
		return title;
	}
	
	public String getPageUrl() {
		String url=driver.getCurrentUrl();
		System.out.println("page url is  "+url);
		return url;
	}
	
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
		}
	}
	public void quitBrowser() {
		if(driver!=null) {
			driver.quit();
		}
	}
}












