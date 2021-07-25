package com.demowebshop.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.demowebshop.base.TestBase;

public class CommonUtils extends TestBase{
	
	
	public static String getCurrentDateTime() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");
		return dateFormat.format(date);
		
	}
	
	public static String takeScreenShot() {
		System.out.println(System.getProperty("user.dir"));
		String screenShotPathName = System.getProperty("user.dir") + "\\src\\test\\resources\\Screenshots\\" + (CommonUtils.getCurrentDateTime()).replace("/", "_").replace(" ", "_").replace(":","_") + ".PNG";
		System.out.println(screenShotPathName);
		driver = getDriver();
		TakesScreenshot screen = (TakesScreenshot)driver;
		File screenFile = screen.getScreenshotAs(OutputType.FILE);
		System.out.println(screenShotPathName);
		try {
			FileUtils.copyFile(screenFile, new File(screenShotPathName));
			
			return screenShotPathName;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed to take screenshot " + e);
		}
		
		return "";
		
	}
	public static void main(String args[]) {
		System.out.println(getCurrentDateTime());
	}
}
