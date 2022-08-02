package com.Mindtree.UiStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPageLocators {

	public WebElement text;              //tide-antibacterial-fabric-spray
	
	
	
	public  SearchPageLocators (WebDriver driver){
		
	//this.text=driver.findElement(By.xpath("//strong[contains(text(),'Antibacterial')]"));
	//	this.text=driver.findElement(By.xpath("//a[@href='/en-us/shop/type/fabric-care/tide-antibacterial-fabric-spray']"));
	//this.text=driver.findElement(By.xpath("//p[contains(text(),'Antibacterial Fabric Spray')]"));
	this.text=driver.findElement(By.xpath("//a[contains(@href,'/en-us/shop/type/fabric-care/tide-antibacterial-fabric-spray')]"));
	}
}
