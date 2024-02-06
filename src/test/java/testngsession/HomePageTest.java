package testngsession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {

	//global precondition
	//pre condition
	//write test cases-test steps-->actual vs expected resutl
	//post steps
	//post global steps
	//
	
	//2 should be associated with a method
	
	//1st preference and executed once
	@BeforeSuite
	public void startDbConnection() {
		System.out.println("BS---start db connection");
	}
	
	//2nd preference and executed once
	@BeforeTest
	public void createUser() {
		System.out.println("BT---create user ");
	}
	
	//3rd prefernce and executed once
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC---launch browser");
	}
	//4th prefernce and it will be executed before each and every @test
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM---login to app");
	}
	
	//test are executed alphabetically order
	@Test
	public void homePageTitleTest() {
		System.out.println("homePageTitleTest");
	}
	
	@Test
	public void homePageUrlTest() {
		System.out.println("homePageUrlTest");
	}
	
	@Test
	public void homePageSearchTest() {
		System.out.println("homePageSearchTest");
	}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("AM---logout user");

	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC---close browser");

	}
	
	@AfterTest
	public void deleteuser() {
		System.out.println("AT---delete user");

	}
	
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS---close connection");

	}
	
	
}
