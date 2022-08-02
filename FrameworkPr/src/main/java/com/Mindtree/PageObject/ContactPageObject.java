package com.Mindtree.PageObject;

import org.openqa.selenium.WebDriver;

import com.Mindtree.UiStore.ContactpageLocators;



public class ContactPageObject {
	
	public void checkTheText(WebDriver driver) throws InterruptedException {
		ContactpageLocators contactObject = new ContactpageLocators(driver);
		
				contactObject.text.isDisplayed();
		
	}
}