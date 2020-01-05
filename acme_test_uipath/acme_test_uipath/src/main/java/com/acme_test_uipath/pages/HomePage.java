package com.acme_test_uipath.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.acme_test_uipath.testng.base.ProjectSpecificMetyhod;

public class HomePage extends ProjectSpecificMetyhod{
	
	public InvoiceSearch clickSearchInvoice()
	{
		Actions action=new Actions(driver);
		WebElement vendorButton = driver.findElementByXPath("//div[@class='dropdown'][6]");
		action.moveToElement(vendorButton).perform();
		
		driver.findElementByXPath("//a[text()='Search for Invoice']").click();
		return new InvoiceSearch();
	}

}
