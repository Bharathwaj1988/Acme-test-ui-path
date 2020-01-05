package com.acme_test_uipath.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.acme_test_uipath.testng.base.ProjectSpecificMetyhod;

public class SearchResults extends ProjectSpecificMetyhod {
	
	public SearchResults getResult() {
		
		WebElement table = driver.findElementByXPath("//table[@class='table']");	
		List<WebElement> tabledata = table.findElements(By.tagName("tr"));	
		//System.out.println(tabledata);	
		for(WebElement cell:tabledata) {
				
			if(cell.getText().contains("IT Support")){
						
					System.out.println(cell.getText());

			}		
		}
		return this;
	}
	
	public SearchResults clickLogout() {
		driver.findElementByXPath("//a[text()='Log Out']").click();
		return this;
		
	}

}
