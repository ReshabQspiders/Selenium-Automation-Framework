package com.Practiece;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGPrinting {
	@Test
	public void addCustomer() {
		//System.out.println("Customer is Added");
		Reporter.log("Customer is Added", true);
	} 

}
