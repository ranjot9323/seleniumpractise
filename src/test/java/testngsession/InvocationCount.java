package testngsession;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=4)//use case:to generate the load
	public void createUserTest() {
System.out.println("invocation count ");	}
}
