package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforjsAlert {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
//alert(),prompt(),confirm()
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
				//Alert alert=driver.switchTo().alert();
		//alert.sendKeys("ranjot");
		//alert.accept();
		//System.out.println(alert.getText());
	//	alert.accept();
		
		alertWaitPresence(5);
		String title=waitForTitle(5, "password");
		if(title.contains("Forgot your Password")){
			System.out.println("pass");
		}
	}
	
	public static Alert alertWaitPresence(int timeout) {
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());

	}
	public static void getAlertText(int timeout) {
		 alertWaitPresence(timeout).getText();
	}
	
	public static void acceptAlert(int timeout) {
		 alertWaitPresence(timeout).accept();
	}
	
	public static void dismissAlert(int timeout) {
		 alertWaitPresence(timeout).dismiss();
	}
	
	
	public static String waitForTitle(int timeout,String titlevalue) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
wait.until(ExpectedConditions.titleContains(titlevalue));
		return driver.getTitle();//also getting the title
	}
	
	public static String waitForUrlandFetch(int timeout,String urlvalue) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
wait.until(ExpectedConditions.urlContains(urlvalue));
return driver.getCurrentUrl();
		//return driver.getTitle();//also getting the title
	}
	
	public static Boolean waitForUrl(int timeout,String urlvalue) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
return wait.until(ExpectedConditions.urlContains(urlvalue));
		//return driver.getTitle();//also getting the title
	}
	
}
