package com.acme_test_uipath.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.acme_test_uipath.pages.*;
import com.acme_test_uipath.testng.base.ProjectSpecificMetyhod;

public class TaxResultsWithChrome extends ProjectSpecificMetyhod{
	
	@BeforeTest
	public void setBrowser() {
		browser="Chrome";
	}
	
	@Test
	public void printTaxDetails() {
		new LoginPage()
		.enterUserName("kumar.testleaf@gmail.com")
		.enterPassword("leaf@12")
		.clickLogin()
		.clickSearchInvoice()
		.enterTaxN0("FR121212")
		.clickSearch()
		.getResult()
		.clickLogout();
	}

}
