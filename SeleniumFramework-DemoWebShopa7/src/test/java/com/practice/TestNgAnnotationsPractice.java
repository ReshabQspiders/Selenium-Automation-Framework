package com.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNgAnnotationsPractice {
	//Config Annotations
	@BeforeSuite
	void configBeforeSuite() {
		System.out.println("---Executing Before Suite---");
	}
	@AfterSuite
	void configAfterSuite() {
		System.out.println("---Executing After Suite---");
	}
	@BeforeTest
	void configBeforeTest() {
		System.out.println("---Executing Before test---");
	}
	@AfterTest
	void configAfterTest() {
		System.out.println("---Executing After Test---");
	}
	@BeforeClass
	void configBeforeClass() {
		System.out.println("---Executing Before Class---");
	}
	@AfterClass
	void configAfterClass() {
		System.out.println("---Executing After Class---");
	}
	@BeforeMethod
	void configBeforeMethod() {
		System.out.println("---Executing Before Method---");
	}
	@AfterMethod
	void configAfterMethod() {
		System.out.println("---Executing After Method---");
	}

}
