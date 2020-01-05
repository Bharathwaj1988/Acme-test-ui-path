package com.acme_test_uipath.pages;

import com.acme_test_uipath.testng.base.ProjectSpecificMetyhod;

public class LoginPage extends ProjectSpecificMetyhod {

	public LoginPage enterUserName(String name) {
		driver.findElementByXPath("//label[text()='Email:']//following-sibling::input").sendKeys(name);;
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {
		driver.findElementByXPath("//input[@type=\"password\"]").sendKeys(pwd);;
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByXPath("//button[@class='btn btn-primary']").click();
		return new HomePage();
	}
	
	
}
