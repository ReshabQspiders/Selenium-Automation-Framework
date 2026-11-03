package com.demowebshop.GenericUtilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnersImplementation extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("--Test Methods Execution Started--");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("--Test Methods Execution Successfully--");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("--Test Methods Execution Failed--");
		ScreenShortUtility ssu=new ScreenShortUtility();
		try {
			ssu.captureWebPage(driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("--Test Methods Execution Skipped--");
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("--Execution Initiated--");
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("--Execution Terminated--");
	}
	

}
