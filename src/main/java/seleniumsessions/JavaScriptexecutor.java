package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptexecutor {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://www.paypal.com/us/brc/");

//JavascriptExecutor js=(JavascriptExecutor)driver;
//String title=js.executeScript("return document.title").toString();
//System.out.println(title);
javascriptutilclass jsutil=new javascriptutilclass(driver);
//js.executeScript("alert('his this is alert')");

String title=jsutil.getTitleJs();
System.out.println(title);

jsutil.generateAlert("this is js alert");

jsutil.confirmPopup("are you sure");





	}
}
