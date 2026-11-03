package com.Practiece;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
	public void stringAssertion() {
		String Actual="Hello Word";
		String Expected="Hello Word";
		//Soft Assertion
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(Actual, Expected);
		sa.assertAll();
		System.out.println("---Pass---");

	}
        @Test
        public void booleanAssert() {
        	int a=10;
        	int b=5;
        	int sum=a+b;
        	boolean result= sum==15;
        	SoftAssert sa=new SoftAssert();
        	sa.assertTrue(result);
        	sa.assertAll();
        	System.out.println("---Pass---");
        }
}
