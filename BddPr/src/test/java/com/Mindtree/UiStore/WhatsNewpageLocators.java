package com.Mindtree.UiStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatsNewpageLocators {

	
	public WebElement text;   //tide Powder Detergents
	
	
	public  WhatsNewpageLocators (WebDriver driver){
		
		
		//this.text=driver.findElement(By.xpath("//h3[contains(.,'Tide in Space')]"));
		this.text=driver.findElement(By.xpath("//strong[contains(text(),'Tide in Space')]"));
	}
	//p[contains(.,'Tide in Space')]

}