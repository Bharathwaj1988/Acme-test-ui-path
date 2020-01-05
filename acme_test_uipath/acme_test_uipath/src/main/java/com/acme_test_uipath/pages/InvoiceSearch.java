package com.acme_test_uipath.pages;

import com.acme_test_uipath.testng.base.ProjectSpecificMetyhod;

public class InvoiceSearch extends ProjectSpecificMetyhod {
	
	public InvoiceSearch enterTaxN0(String taxNO) {
		driver.findElementById("vendorTaxID").sendKeys(taxNO);
		
		return this;
	}

	public SearchResults clickSearch() {
		driver.findElementByXPath("//button[@class=\"btn btn-primary\"]").click();
		return new SearchResults();
	}
}
