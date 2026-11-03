package com.practice;

import org.testng.annotations.Test;

public class TestNGPractice {
	@Test
	void aregisterTest() {
		System.out.println("New User Registered");
	}
	@Test
	void bloginTest() {
		System.out.println("User logged in Successfully");
	}
	@Test
	void cproductTest() {
		System.out.println("Product Added to the Cart");
	}
	@Test
	void dpaymentTest() {
		System.out.println("Payment Successfull");
	}

}
