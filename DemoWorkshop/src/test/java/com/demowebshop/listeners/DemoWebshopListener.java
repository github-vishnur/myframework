package com.demowebshop.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.demowebshop.utilities.CommonUtils;

public class DemoWebshopListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Script Started : "+ result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Script Passed : "+ result.getName());	
		System.out.println(CommonUtils.takeScreenShot());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Script Failed : "+ result.getName());
		
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Script Skipped : "+ result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Script Within Success Percentage : "+ result.getName());
		
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Context Started : "+ context.getName());
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Context Fininshed : "+ context.getName());
		
	}
	
	
}
