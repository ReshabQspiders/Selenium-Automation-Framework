package com.practice;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(priority = 1,invocationCount = 20,threadPoolSize = 10)
	public void register() {
		System.out.println("New user Registered");
	}
	@Test(priority = 2,invocationCount = 5)
	public void login() {
		System.out.println("New user Logged in");
	}

}
