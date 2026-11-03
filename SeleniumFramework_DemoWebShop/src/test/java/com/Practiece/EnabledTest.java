package com.Practiece;

import org.testng.annotations.Test;

public class EnabledTest {
	@Test(enabled = false)
	public void method1() {
		System.out.println("Test Run For 1");
	}
	@Test(enabled = true)//Defaut will be true,so it will run 
	public void method2() {
		System.out.println("Test Run For 2");
	}
}
