package com.demowebshop.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public WebDriver driver;
	public static Logger log;
	
	public WebDriver initialize() {

		
		log = Logger.getLogger("TestUser");
		log.debug("Log check");

	 /* Properties file setup */
		 if(driver==null) {
			try {
				String s = System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\Config.properties";
			    System.out.println(s);
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\Config.properties");
				
				config.load(fis);
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\OR.properties"); 
				OR.load(fis);
				
				String browser = config.getProperty("browser");
				String URL = config.getProperty("testURL");
				
				if(browser.equals("chrome")) {
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\chromedriver.exe");
					driver = new ChromeDriver();
					
				} else {
					System.out.println("The browser " + browser + " is not configured in this framework.");
				}
				
				driver.get(URL);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),TimeUnit.SECONDS);
			
			}
			catch(Exception e) {
				System.out.println("Error in loading properties file or driver");
			}
		}
		 
		 return driver;
		
	}
	

}
