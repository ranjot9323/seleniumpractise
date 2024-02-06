package seleniumsessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClasscrmStream {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
	driver.get("https://classic.crmpro.com/");
	//List<WebElement> paragraphs = driver.findElements(By.cssSelector("section#details p"));
	
	//String allParagraphs = paragraphs.stream().map(e->e.getText()).collect(Collectors.joining("\n"));
	//System.out.println(allParagraphs);
	
	
	//List<WebElement> headers = driver.findElements(By.cssSelector("section#details h3"));

	//String allheaders = headers.stream().map(e->e.getText()).collect(Collectors.joining("||"));
	//System.out.println(allheaders);
	
	By header=By.cssSelector("section#details h3");
	//headers.stream().forEach(e->System.out.println(e.getText()+"  "+e.getTagName()));
	
	//headers.stream().forEach(e->e.getText());
	printHeaderList(header);
	if(getHeaderList(header).contains("Reports")) {
		System.out.println("pass");
	}
	
	}
	
	public static void printHeaderList(By locator) {
	driver.findElements(locator).stream().forEach(e->System.out.println(e.getText()));

	}
	public static List<String> getHeaderList(By locator) {
	return	driver.findElements(locator).stream().map(e->e.getText()).collect(Collectors.toList());

	}
	
	
}
