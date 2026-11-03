package com.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;

public class LearningDataProvider {
	//Creating DataProvider method
	@DataProvider(name="loginCreds")
	public Object[][] getData(){
	 return new Object[][]{{"user1","pass1"},
						   {"user2","pass2"},
						   {"user3","pass3"}};				   
	}
	//Creating Test method to fetch the data sets in parameters
	@Test(dataProvider = "loginCreds")
	public void testMethod(String username,String password) {
		System.out.println("The username is: "+username);
		System.out.println("The password is: "+password);
		System.out.println("-----------------------------");

	}
}
