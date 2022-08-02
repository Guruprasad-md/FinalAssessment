package com.Mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import com.Mindtree.UiStore.ResultpageLocators;
import com.Mindtree.UiStore.TiedpageLocators;
import com.Mindtree.UiStore.WashingpageLocators;


public class WashingPageObject {
	
	public void checkTheText(WebDriver driver) throws InterruptedException {
		WashingpageLocators washObject = new WashingpageLocators(driver);
		
				washObject.text.isDisplayed();
		
	}
}