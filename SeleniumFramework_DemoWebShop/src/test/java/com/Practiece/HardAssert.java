package com.Practiece;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void stringAssertion() {
		String Actual="Hello Word";
		String Expected="Hello Word";
		//Hard Assertion
		Assert.assertEquals(Actual, Expected);
		System.out.println("Pass");
	}
        @Test
        public void booleanAssert() {
        	int a=10;
        	int b=5;
        	int sum=a+b;
        	boolean result= sum==15;
        	Assert.assertTrue(result);
        }
}

