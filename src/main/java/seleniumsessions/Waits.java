package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//types of wait
		//1.static wait->just pause thr script ex:thread.sleep(10000)--script will wait for whole 10 seconds even if element found in 2 seconds
		//2.dynamic wait->if we put wait of 10 seconds but the element found in 2 seconds then it will ignore rest of 8 seconds.
		//2.a)implicitly wait:global wait on all elements
		//2.b)explicitlywait:applied on a specific element+polling/interval time+non webelement
		//2.b.i)WebDriverWait
		//2.b.ii)FluentWait
		
		//WebDriverWait(c)-->FluentWait(c)-->Wait(I)-->untill()
							//until(){
							//other ()s
							//
							
		//WebDriverWait is child of fluent wait 
		
		
	}
}
