package com.demowebshop.base;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase extends Driver {
	
    public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		driver = initialize();
	
	}
	@AfterSuite
	public void tearDown() {
		quitDriver();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public void quitDriver() {
		driver.quit();
	}
	
	public void closePage() {
		driver.close();
	}
	
	

}
