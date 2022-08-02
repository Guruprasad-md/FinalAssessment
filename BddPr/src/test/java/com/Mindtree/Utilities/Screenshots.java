package com.Mindtree.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	
	public static String screenshot(WebDriver driver ) throws IOException
	{
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String filename = System.getProperty("user.dir")+"./screenshot/ss"+System.currentTimeMillis()+".png";
		FileHandler.copy(src, new File(filename));
		return filename;
		
	}
}
