package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() {
		prop= new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("D:\\automation_workspace\\MyAmazonCucumber\\src"
					+ "\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
	}
		
	public static void intialization(){
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\automation_workspace\\MyAmazonCucumber\\Drivers\\chromedriver.exe");
			driver =  new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
		       System.setProperty("webdriver.gecko.driver", "D:\\automation_workspace\\MyAmazonCucumber\\Drivers\\geckodriver.exe");
				}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.pageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicitlyWait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
		
	
		

		
	

	
	
	
}
