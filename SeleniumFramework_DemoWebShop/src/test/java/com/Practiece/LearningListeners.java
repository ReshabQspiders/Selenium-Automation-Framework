package com.Practiece;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LearningListeners.class)
public class LearningListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Method Initiated");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Method Executed with Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Method Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Method has Skipped Execution");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution has Initiated");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Method Completed");
	}
	@Test
	public void method() {
		System.out.println("Executing Test Method");
	}
}
