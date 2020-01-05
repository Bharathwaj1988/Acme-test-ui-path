package com.acme_test_uipath.testng.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMetyhod {
	public static RemoteWebDriver driver;
	
	public static String browser;
	
	@BeforeMethod
	public void driver_Initialize() {
		
		if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();	
		}
		else if(browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		else {
			System.out.println("Please enter the proper browser");
		}
			
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void close_Browser() {
		driver.close();
	}
	
	
	

}
