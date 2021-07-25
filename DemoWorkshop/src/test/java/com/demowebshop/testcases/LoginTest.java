package com.demowebshop.testcases;

import org.testng.annotations.Test;

import com.demowebshop.base.TestBase;

public class LoginTest extends TestBase{
	@Test
	public void LoginTest() {
		System.out.println(driver.getCurrentUrl());
	}
}
