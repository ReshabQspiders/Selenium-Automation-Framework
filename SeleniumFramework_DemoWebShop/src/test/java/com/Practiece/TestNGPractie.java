package com.Practiece;

import org.testng.annotations.Test;

public class TestNGPractie {
	@Test
	void methodTest() {
		System.out.println("Hello##");
	}
	
	@Test
	void aregisterTest() {
		System.out.println(" New User registered ");
	}

	@Test
	void bloginTest() {
		System.out.println("User login successfully");
	}

	@Test
	void cProductTest() {
		System.out.println("Product added to Cart ");
	}

	@Test
	void dPaymentTest() {
		System.out.println("Payment done sucessfully");
	}

}
