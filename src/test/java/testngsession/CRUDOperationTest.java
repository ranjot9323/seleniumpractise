package testngsession;

import org.testng.annotations.Test;


//we can use this way instead of using the test dependency

public class CRUDOperationTest {
	
	public void createUser() {
		System.out.println("create user");
		
	}
public void getUser() {
	System.out.println("get user");

	}
public void updateUser() {
	System.out.println("update user");

}
public void deleteUser() {
	System.out.println("delete user");

}

@Test
public void createUserTest() {
	createUser();
}

@Test
public void getUserTest() {
	createUser();
	getUser();
}
@Test
public void updateUserTest() {
	createUser();
	getUser();
	updateUser();
	getUser();//this is to get the update user info

}
@Test
public void deleteUserTest() {
	createUser();
	getUser();
	deleteUser();
	getUser();

}
//2nd approach

@Test
public void getUserTesting() {
	int userid=123;
	getUser();
}






}
