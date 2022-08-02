package com.Mindtree.PageObject;

import org.openqa.selenium.WebDriver;

import com.Mindtree.UiStore.WhatsNewpageLocators;


public class WhatsNewPageObject {
	
	public void checkTheText(WebDriver driver) throws InterruptedException {
		WhatsNewpageLocators newObject = new WhatsNewpageLocators(driver);
		//Thread.sleep(2000);
				newObject.text.isDisplayed();
		
	}
}