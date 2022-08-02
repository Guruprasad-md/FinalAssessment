package com.Mindtree.UiStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUppageLocators {

	
	public WebElement text;   //tide Powder Detergents
	
	
	public  signUppageLocators (WebDriver driver){
		
		
		//this.text=driver.findElement(By.xpath("//a[@class='event_internal_link']"));
		this.text=driver.findElement(By.xpath("//a[@class='event_internal_link']"));
	}


}