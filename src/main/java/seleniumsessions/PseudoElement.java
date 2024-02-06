package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PseudoElement {



	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

JavascriptExecutor js=(JavascriptExecutor)driver;//JavascriptExecutor is an interface

String script="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'before').getPropertyValue('content')\n"+ "";

//::before    ,    ::after
String field=js.executeScript(script).toString();
System.out.println(field);



}





}
