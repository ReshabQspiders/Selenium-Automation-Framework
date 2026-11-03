package com.Practiece;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider {

	//Creating DataProvider method
	@DataProvider(name = "loginCreds")
	public Object[][] getData(){
		return new Object[][] {{"user1","pass1"},
								{"user2","pass2"},
								{"user3","pass3"}};
		
	}
	
	@Test(dataProvider = "loginCreds")
	public void testMethod(String user,String password) {
		System.out.println("The user is: "+user);
		System.out.println("The password is: "+password);
		System.out.println("---------------------------------");
	}

}

