package com.demowebshop.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	public static void main(String args[]) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream stream = new FileInputStream(System.getenv("user.dir")+"//Properites//Config.properties");
		prop.load(stream);
		
	}

}
