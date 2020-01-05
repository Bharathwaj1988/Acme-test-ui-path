package com.acme_test_uipath.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.acme_test_uipath.pages.LoginPage;
import com.acme_test_uipath.testng.base.ProjectSpecificMetyhod;

public class TaxResultsWithIE extends ProjectSpecificMetyhod{
	
	@BeforeTest
	public void setBrowser() {
		browser="IE";
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
