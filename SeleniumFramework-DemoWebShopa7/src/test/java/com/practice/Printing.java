package com.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Printing {
	@Test
	public void addCustomer() {
		//System.out.println("Customer is added");
		Reporter.log("Customer is added",true);
		
	}

}
