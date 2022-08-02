package com.Mindtree.UiStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultpageLocators {

	
	public WebElement text;   //tide Powder Detergents
	
	
	public  ResultpageLocators (WebDriver driver){
		
		
		this.text=driver.findElement(By.xpath("//h1[contains(text(),'Tide Powder Detergents')]"));
}


}