package com.Mindtree.UiStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WashingpageLocators {

	
	public WebElement text;        //How to remove stains
	
	
	public  WashingpageLocators (WebDriver driver){
		
		
		//this.text=driver.findElement(By.xpath("//h1[contains(.,'How to remove stains')]"));
		this.text=driver.findElement(By.xpath("//h1[@class='alp-intro-title']"));
}

	
}