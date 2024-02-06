package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertJSPopup {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
//alert(),prompt(),confirm()
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	//	Thread.sleep(3000);
		//Alert alert=driver.switchTo().alert();
		//String alertText=alert.getText();
		//System.out.println(alertText);
		//alert.accept();
		//alert.dismiss();
		//noalertpresentexception will be there if no aler is there
		
	/*	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println(alertText);
		alert.accept();*/
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("ranjot");
		alert.accept();
		//only one oppup on screen at same time and only one text field on one popup at one time 
	//write use case for https://mail.rediff.com/cgi-bin/login.cgi
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}

}
