package com.Mindtree.UiStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommitmentsPageLocators {

	
	public WebElement text;   //tide Powder Detergents
	
	
	public  CommitmentsPageLocators (WebDriver driver){
		
		
		this.text=driver.findElement(By.xpath("//a[@href='/en-us/our-commitment/sustainability']"));
}


}