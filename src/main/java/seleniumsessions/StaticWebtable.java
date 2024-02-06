package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaticWebtable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	int headCount=	getHeaderCount();
	System.out.println(headCount);
		////table[@id='customers']//tbody/tr[6]/td[1]
String	beforeXpath="//table[@id='customers']//tbody/tr[";
String afterXpath="]/td[1]";
for(int row=2;row<7;row++) {
	String xpath=beforeXpath+row+afterXpath;
	String val=driver.findElement(By.xpath(xpath)).getText();
	System.out.println(val);

}
		
	}

	public static int getHeaderCount() {
	return	driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	}
	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
	}
	
	//also get value of 2nd and 3rd column value using same concept
}
