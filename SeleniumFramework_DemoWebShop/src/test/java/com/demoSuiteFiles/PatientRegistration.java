package com.demoSuiteFiles;

import org.testng.annotations.Test;

public class PatientRegistration {
	@Test(groups = {"Smoke"})
	public void registration() {
		System.out.println("Patient is registered");
	}

}
