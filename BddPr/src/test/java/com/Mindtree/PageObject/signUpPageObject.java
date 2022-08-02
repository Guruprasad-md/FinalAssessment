package com.Mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import com.Mindtree.UiStore.ResultpageLocators;
import com.Mindtree.UiStore.signUppageLocators;


public class signUpPageObject {
	
	public void clickOnThelink(WebDriver driver) throws InterruptedException {
		signUppageLocators signUpObject = new signUppageLocators(driver);
		
				signUpObject.text.click();
				
		for(String i:driver.getWindowHandles())
		{
			driver.switchTo().window(i);
		}
				
			
		
	}
}