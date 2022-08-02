package com.Mindtree.PageObject;

import org.openqa.selenium.WebDriver;


import com.Mindtree.UiStore.SearchPageLocators;


public class SearchPageObject {
	


	public void checkTheText(WebDriver driver) {
		// TODO Auto-generated method stub
		SearchPageLocators searchObject = new SearchPageLocators(driver);
		
		searchObject.text.isDisplayed();
		
	}
	
}
	

