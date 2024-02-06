package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	public static void main(String[] args) {
String browserName="chrome";
BrowserUtil util=new BrowserUtil();
WebDriver driver=util.initDriver(browserName);
util.getPageUrl();
By firstname=By.id("input-firstname");




ElementUtil el=new ElementUtil(driver);
el.doSendkeys(firstname, "ranjot");


}

}
