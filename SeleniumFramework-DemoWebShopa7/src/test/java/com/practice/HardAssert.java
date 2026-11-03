package com.practice;

import java.security.PublicKey;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
		@Test
		public void stringAssertion() {
			String actual="Hello World!!!";
			String expected="Hello World!!!";
			//Hard Assertion
			Assert.assertEquals(actual, expected);
			System.out.println("Pass");	
		}
		@Test
		public void booleanAssert() {
			int a=10;
			int b=5;
			int sum=a+b;
			boolean result = sum==10;
			Assert.assertTrue(result);
		}

	}


