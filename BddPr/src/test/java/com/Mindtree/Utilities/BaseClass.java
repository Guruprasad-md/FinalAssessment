package com.Mindtree.Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class BaseClass {

	

public	static WebDriver driver ;
	
	Properties prop = new Properties();
	
	public WebDriver initializeDriver() throws IOException
	{
		
		FileInputStream fis= new FileInputStream("C:\\Users\\M1089266\\eclipse-workspace\\BddPr\\property files\\configure.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("url");
		
	//String	st=System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	String	st=System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
	
	WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
	
		driver.get(url);
		
	return driver;
	
	}
	


	
}