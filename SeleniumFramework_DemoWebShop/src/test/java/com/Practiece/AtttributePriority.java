package com.Practiece;

import org.testng.annotations.Test;

public class AtttributePriority {
	@Test(priority = 1)
	public void Cutting() {
		System.out.println("Cutting vegetables");
	}
	@Test(priority = 2)
	public void Cooking() {
		System.out.println("Cooking Food");
	}
}
  