package com.Mindtree.UiStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageLocators {

	
	public WebElement text;   //exclusive Tide coupons
	public WebElement textfield;
	//public WebElement button;
	public WebElement email;
	public WebElement password;
	public WebElement button;
	public  RegisterPageLocators (WebDriver driver){
		
		
		this.text=driver.findElement(By.xpath("//p[contains(.,'exclusive Tide coupons')]"));

		//this.textfield=driver.findElement(By.xpath("//input[@id='name']"));
		//this.textfield=driver.findElement(By.xpath("//input[@placeholder='First name']"));
		this.textfield=driver.findElement(By.xpath("//*[@id=\"name\"]"));
		
		this.email = driver.findElement(By.xpath("//*[@id=\'email\']"));
		this.password = driver.findElement(By.xpath("//*[@id=\'password\']"));
		this.button=driver.findElement(By.xpath("//input[@value='CREATE ACCOUNT']"));
	}

	
}