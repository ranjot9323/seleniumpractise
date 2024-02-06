package testngsession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTestClass{
	
	//tc's should not be dependenton each other as not good practise 
	@Test(priority=1)
	public void title() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority=2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.name("q")).isDisplayed();
Assert.assertTrue(flag);	
}
	
	

}
