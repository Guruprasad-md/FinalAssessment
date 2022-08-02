package com.Mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import com.Mindtree.UiStore.ResultpageLocators;


public class ResultPageObject {
	
	public void clickOnTheText(WebDriver driver) throws InterruptedException {
		ResultpageLocators tiedObject = new ResultpageLocators(driver);
		
				tiedObject.text.isDisplayed();
		
	}
}