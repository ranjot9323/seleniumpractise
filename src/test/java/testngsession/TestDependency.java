package testngsession;

import org.testng.annotations.Test;

public class TestDependency {

	
	@Test//
	public void searchTest() {
		System.out.println("searchTest");

	}
	//if a test is dependent on another test and that test is failing then the tests dependent on that test will be skipped 
	
	@Test(dependsOnMethods="searchTest")
	public void addTocartTest() {
		System.out.println("addTocartTest");
		int i=9/0;

	}
	@Test(dependsOnMethods="addTocartTest")
	public void makePaymentsTest() {
		System.out.println("makePaymentsTest");

	}
	
}
