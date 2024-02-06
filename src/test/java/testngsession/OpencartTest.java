package testngsession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpencartTest extends BaseTestClass {
	
	//tc's should not be dependenton each other as not good practise 
	@Test(priority=1)
	public void title() {
	String title=	driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Your Store");
	}
	
	@Test(priority=2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.name("search")).isDisplayed();
Assert.assertTrue(flag);	
}
	
	
	
	
	
}
