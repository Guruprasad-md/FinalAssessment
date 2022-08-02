package com.Mindtree.PageObject;

import org.openqa.selenium.WebDriver;

import com.Mindtree.UiStore.RegisterPageLocators;
import com.Mindtree.Utilities.ExcelData;


public class RegisterPageObject {
	ExcelData ex = new ExcelData();
	RegisterPageLocators registerObject ;
	
	public void checkTheText(WebDriver driver) throws InterruptedException {
	 registerObject = new RegisterPageLocators(driver);
		//Thread.sleep(2000);
			//	registerObject.text.isDisplayed();
				registerObject.button.isDisplayed();
	}
	
	public void enterTheText(WebDriver driver) throws InterruptedException {
		registerObject = new RegisterPageLocators(driver);
		//Thread.sleep(3000);
				registerObject.textfield.sendKeys(ex.excel(0, 2, 0));
	}
	
	public void enterTheEmail(WebDriver driver) throws InterruptedException {
		registerObject = new RegisterPageLocators(driver);

				registerObject.email.sendKeys(ex.excel(0, 3, 0));
	}
	public void enterThePassword(WebDriver driver) throws InterruptedException {
		registerObject = new RegisterPageLocators(driver);
		
				registerObject.password.sendKeys(ex.excel(0, 4, 0));
	}
	
	public void clickOnCreateAccount(WebDriver driver) throws InterruptedException {
		registerObject = new RegisterPageLocators(driver);
		
				registerObject.button.click();
	}
}
