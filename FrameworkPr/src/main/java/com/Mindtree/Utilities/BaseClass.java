package com.Mindtree.Utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	

public	static WebDriver driver ;
	
	Properties prop = new Properties();
	
	public WebDriver initializeDriver() throws IOException
	{
		
		FileInputStream fis= new FileInputStream("C:\\Users\\M1089266\\eclipse-workspace\\FrameworkPr\\property files\\configure.properties");
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