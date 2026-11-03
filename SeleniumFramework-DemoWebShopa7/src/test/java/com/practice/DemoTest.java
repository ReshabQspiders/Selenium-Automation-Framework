package com.practice;

import org.testng.annotations.Test;

public class DemoTest {
	@Test(priority = -343)
	public void cutting() {
		System.out.println("Cutting vegetables");
	}
	@Test
	public void cooking() {
		System.out.println("Cooking food");
	}

}
