package com.practice;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {
	
	@Test
	public void method() {
		int a=10;
		int b=15;
		int sum=a+b;
		Assert.assertEquals(sum,25);
		System.out.println("Test Case Passed");
//		if (sum==15) {
//			System.out.println("Pass");
//		} else 
//			System.out.println("Fail");
//		}
		
	}/*Even though the script should fail according to
	requirement but testng marks it as passed as the
	method has completed its execution and has not 
	failed in between, thus testNG assertion is 
	necessary*/
	

}
