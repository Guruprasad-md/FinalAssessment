package com.Mindtree.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.Mindtree.UiStore.TiedpageLocators;
import com.Mindtree.Utilities.ExcelData;


public class TiedPageObject {
	
	ExcelData ex = new ExcelData();
	
	public void enterTheText(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		TiedpageLocators tiedObject = new TiedpageLocators(driver);
	
		tiedObject.searchbox.click();
		
		tiedObject.searchbox.sendKeys(ex.excel(0, 1, 0));
		
		tiedObject.searchbox.sendKeys(Keys.ENTER);
	
	}
	
	public void checkTheText(WebDriver driver) throws InterruptedException {
		TiedpageLocators tiedObject = new TiedpageLocators(driver);
		
		Actions a = new Actions(driver);
		a.moveToElement(tiedObject.text).perform();
		tiedObject.link.isDisplayed();
		
		
		
	}
	
	public void mouseOverTheText(WebDriver driver) throws InterruptedException {
		TiedpageLocators tiedObject = new TiedpageLocators(driver);
		
		Actions a = new Actions(driver);
		a.moveToElement(tiedObject.text).perform();
		
		
		tiedObject.link2.isDisplayed();
		tiedObject.link2.click();
		
	}
	
	public void checkTheText2(WebDriver driver) throws InterruptedException {
		TiedpageLocators tiedObject = new TiedpageLocators(driver);
		
		Actions a = new Actions(driver);
		a.moveToElement(tiedObject.text2).perform();
		tiedObject.link3.isDisplayed();
		tiedObject.link3.click();
		
		
		
	}
	public void checkTheText4(WebDriver driver) throws InterruptedException {
		TiedpageLocators tiedObject = new TiedpageLocators(driver);
		
		tiedObject.text4.isDisplayed();
		
		
		
	}
	
	public void clickOnThelink(WebDriver driver) throws InterruptedException {
		TiedpageLocators tiedObject = new TiedpageLocators(driver);
		tiedObject.link4.click();
		
		
		
	}
	public void clickOnTheText5(WebDriver driver) throws InterruptedException {
		TiedpageLocators tiedObject = new TiedpageLocators(driver);
		tiedObject.text5.click();
		
		
		
	}
	
	public void ourCommitments(WebDriver driver) throws InterruptedException {
		TiedpageLocators tiedObject = new TiedpageLocators(driver);
		
		Actions a = new Actions(driver);
		a.moveToElement(tiedObject.text6).perform();
		
		
		tiedObject.link6.isDisplayed();
		//tiedObject.link2.click();
		
	}
	public void clickOnThelink7(WebDriver driver) throws InterruptedException {
		TiedpageLocators tiedObject = new TiedpageLocators(driver);
		tiedObject.link7.click();
		
		
		
	}
}