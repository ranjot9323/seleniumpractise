package testngsession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test//
	public void a_test() {
		System.out.println("a test");

	}
	@Test//
	public void b_test() {
		System.out.println("b test");

	}
	@Test//
	public void c_test() {
		System.out.println("c test");
	}
//if multiple tests have same then also it will pick on basis of alphabetical order.
	//if some tests have priority and some don't then test will run first with non priority then the priority ones  
}
