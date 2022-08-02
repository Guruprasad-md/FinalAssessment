package com.Mindtree.UiStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TiedpageLocators {

	public WebElement searchbox;         //searchbox
	public WebElement text;              //shop product
	public WebElement link;              //liuid
	public WebElement link2;             //powder
	public WebElement text2;             //how to wash clothes
	public WebElement link3;             //how to remove stain
	public WebElement text4;             //help & support
	public WebElement link4;             //register
	public WebElement text5;
	public WebElement text6;           //register
	public WebElement link6;
	public WebElement link7;        //contactHelp
	
	public  TiedpageLocators (WebDriver driver){
		
		this.searchbox=driver.findElement(By.xpath("//input[@type='search']"));
		this.text=driver.findElement(By.xpath("//a[@href='/en-us/shop']"));
		
		this.link=driver.findElement(By.xpath("//a[@href='/en-us/shop/type/liquid']"));
		this.link2=driver.findElement(By.xpath("//a[@href='/en-us/shop/type/powder']"));
		
		this.text2=driver.findElement(By.xpath("//a[@href='/en-us/how-to-wash-clothes']"));
		this.link3=driver.findElement(By.xpath("//a[@href='/en-us/how-to-wash-clothes/how-to-remove-stains']"));
		this.text4=driver.findElement(By.xpath("//h5[contains(.,'Help & Support')]"));
		
		this.link4=driver.findElement(By.xpath("//a[@href='/en-us/sign-in']"));
		
		
		this.text5=driver.findElement(By.xpath("//a[@href='/en-us/latest-news']"));
		
		this.text6=driver.findElement(By.xpath("//a[@href='/en-us/our-commitment']"));
		this.link6=driver.findElement(By.xpath("//a[@href='/en-us/our-commitment/sustainability']"));
		
		this.link7=driver.findElement(By.xpath("//a[@href='/en-us/contact-us']"));
	
	}
	
	
}