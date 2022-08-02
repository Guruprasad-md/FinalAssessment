package com.Mindtree.PageObject;

import org.openqa.selenium.WebDriver;

import com.Mindtree.UiStore.CommitmentsPageLocators;


public class CommitmentsPageObject {
	
	public void checkTheText(WebDriver driver) throws InterruptedException {
		CommitmentsPageLocators commitmentObject = new CommitmentsPageLocators(driver);
		
				commitmentObject.text.isDisplayed();
		
	}
}