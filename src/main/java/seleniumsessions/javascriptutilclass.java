package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class javascriptutilclass {

	private static WebDriver driver;
	
	public javascriptutilclass(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public  String getTitleJs(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		return js.executeScript("return document.title").toString();
	}
	
	public void generateAlert(String message){
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("alert("+message+")");
		
	}
	
	public void confirmPopup(String message) {
		JavascriptExecutor js=(JavascriptExecutor)driver;

js.executeScript("confirm('"+message+"')");
}
}
