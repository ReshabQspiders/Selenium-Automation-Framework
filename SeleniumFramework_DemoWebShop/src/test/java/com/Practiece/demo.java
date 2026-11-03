package com.Practiece;

import org.testng.annotations.Test;

import com.demowebshop.GenericUtilities.*;

public class demo {

	@Test(dataProvider = "RegisterDetails",dataProviderClass = ExcelUtility.class)
	public void getData(String firstN,String lastN,String gen,String email1,String email2,String pass) {
		System.out.println(firstN);
		System.out.println(lastN);
		System.out.println(gen);
		System.out.println(email1);
		System.out.println(email2);
		System.out.println(pass);
		System.out.println("-----------------------------");
		
		
	}

}