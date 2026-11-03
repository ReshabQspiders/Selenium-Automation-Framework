package com.Practiece;

import org.testng.annotations.Test;

public class InvocationcountAndThreadPoolSize {
	@Test(priority = 1,invocationCount = 10,threadPoolSize = 10)
	public void register() {
		System.out.println("New User Registered");
	}
	@Test(priority = 2,invocationCount = 5)
	public void login() {
		System.out.println("New User logged In");
	}
}
