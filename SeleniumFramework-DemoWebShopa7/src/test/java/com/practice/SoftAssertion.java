package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
	public void stringAssertion() {
		String actual="Hello World!!!";
		String expected="Hell World!!!";
		//Soft Assertion
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();
		System.out.println("---Pass---");
		
	}
	@Test
	public void booleanAssert() {
		int a=10;
		int b=5;
		int sum=a+b;
		boolean result = sum==10;
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(result);
		sa.assertAll();
		System.out.println("---Pass---");
		
	}


}
