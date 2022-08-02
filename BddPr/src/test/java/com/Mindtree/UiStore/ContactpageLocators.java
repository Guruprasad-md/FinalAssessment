package com.Mindtree.UiStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactpageLocators {

	
	public WebElement text;   //tide Powder Detergents
	
	
	public  ContactpageLocators (WebDriver driver){
		
		
		this.text=driver.findElement(By.xpath("//span[contains(text(),'Fun ways to connect with us:')]"));
		//this.text=driver.findElement(By.id("j_id0:j_id1:j_id2:idForm:j_id592:j_id593:j_id604"));
	}

	
}