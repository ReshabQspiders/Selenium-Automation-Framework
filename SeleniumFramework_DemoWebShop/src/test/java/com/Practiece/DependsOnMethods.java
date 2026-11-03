package com.Practiece;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(enabled = true,timeOut = 10)
	public void method1() {
		System.out.println("Execution of 1 method");
	}
	
	@Test(dependsOnMethods = "method1")
	public void method2() {
		System.out.println("Execution of 2 method");
	}
}
