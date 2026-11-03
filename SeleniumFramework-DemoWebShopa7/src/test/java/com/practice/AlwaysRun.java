package com.practice;

import org.testng.annotations.Test;

public class AlwaysRun {
	@Test(expectedExceptions = ArithmeticException.class)
	public void method1() {
		int a=1;
		int b=0;
		int sum=a/b;
		System.out.println(sum);
	}
	@Test(alwaysRun = true,dependsOnMethods = "method1")
	public void method2() {
		System.out.println("--Executing Method2--");

	}
	
}
