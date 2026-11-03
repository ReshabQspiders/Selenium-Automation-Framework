package com.practice;

import org.testng.annotations.Test;

import com.demowebshop.generic_utilities.ExcelUtility;

public class Demo {
	
	@Test(dataProvider = "RegisterDetails",
			dataProviderClass = ExcelUtility.class)
	public void print(String a,String b,String c,String d,String e
			,String f) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	
	}

}
