package com.practice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LearningListeners.class)
public class LearningListeners implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Method initiated");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Method Executed with success");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Method Failed");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Method has Skipped execution");
	}
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution has initiated");
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution is Completed");}
	@Test
	public void method() {
		System.out.println("Executing Test Method");
	}

}
