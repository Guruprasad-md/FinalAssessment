package com.Mindtree.Runner;
import java.io.File;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Mindtree.PageObject.CommitmentsPageObject;
import com.Mindtree.PageObject.ContactPageObject;
import com.Mindtree.PageObject.RegisterPageObject;
import com.Mindtree.PageObject.ResultPageObject;
import com.Mindtree.PageObject.SearchPageObject;
import com.Mindtree.PageObject.TiedPageObject;
import com.Mindtree.PageObject.WashingPageObject;
import com.Mindtree.PageObject.WhatsNewPageObject;
import com.Mindtree.PageObject.signUpPageObject;
import com.Mindtree.Utilities.BaseClass;
import com.Mindtree.Utilities.Screenshots;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class Runner {
	
	
	
	public static WebDriver driver ;
	
	
	ExtentHtmlReporter html;
	ExtentReports extent;
	ExtentTest test1;
	BaseClass baseObject ;
	

		public static Logger log= LogManager.getLogger(Runner.class.getName());
		
		
		@BeforeMethod
		public void methods() throws IOException
		{
			
		 driver = baseObject.initializeDriver();
		 log.info("initializing driver");
		}
		
		@BeforeSuite
		public void suite()
		{
			baseObject = new BaseClass();
			html= new ExtentHtmlReporter(new File(System.getProperty("user.dir" )+ "/reports/ExtentReport.html"));			
			extent = new ExtentReports();
			
			extent.attachReporter(html);
		}
		
		@Test(priority = 1)
		public void searchFunction() throws IOException, InterruptedException
		{
			log.info("Test case 1 ");
			test1= extent.createTest("Tied page");
	
			test1.log(Status.INFO, "starting test case1");
			
			TiedPageObject tiedObject= new TiedPageObject();
			tiedObject.enterTheText(driver);
			SearchPageObject searchObject = new SearchPageObject();
			searchObject.checkTheText(driver);
			
		}

		@Test(priority = 2)
		public void verifyTheProduct() throws IOException, InterruptedException
		{
			log.info("Test case 2 ");
			test1= extent.createTest("Tied home page");
	
			test1.log(Status.INFO, "starting test case2");
			
			TiedPageObject tiedObject= new TiedPageObject();
		
			
		
			tiedObject.checkTheText(driver);
		}
	
		@Test(priority = 3)
		public void shopProduct1() throws IOException, InterruptedException
		{
			test1= extent.createTest("Tied shop page");
	
			test1.log(Status.INFO, "starting test case3");
			
			TiedPageObject tiedObject= new TiedPageObject();
			tiedObject.mouseOverTheText(driver);
			ResultPageObject resultObject = new ResultPageObject();
			resultObject.clickOnTheText(driver);
			
		}
			
		
		
		
		@Test(priority = 4)
		public void shopProduct2() throws IOException, InterruptedException
		{
			test1= extent.createTest("Tied shop product page");
			test1.log(Status.INFO, "starting test case4");
			
			
			TiedPageObject tiedObject= new TiedPageObject();
			tiedObject.checkTheText2(driver);
			WashingPageObject washObject = new WashingPageObject();
			washObject.checkTheText(driver);
					
			
		}
		
		@Test(priority = 5)
		public void shopProduct() throws IOException, InterruptedException
		{
			test1= extent.createTest("Tied shop product page");
	
			test1.log(Status.INFO, "starting test case5");
			
			TiedPageObject tiedObject= new TiedPageObject();
			tiedObject.checkTheText4(driver);
		}
	
		@Test(priority = 6)
		public void registerPage() throws IOException, InterruptedException
		{
			test1= extent.createTest("Tied sign up page page");
			test1.log(Status.INFO, "starting test case6");
			
			
			TiedPageObject tiedObject= new TiedPageObject();
			tiedObject.clickOnThelink(driver);
			
			signUpPageObject signUpObject = new  signUpPageObject();
					signUpObject.clickOnThelink(driver);	
					
					RegisterPageObject registerObejct = new RegisterPageObject();
					registerObejct.checkTheText(driver);
		}
	
		@Test(priority = 7)
		public void createAccount() throws IOException, InterruptedException
		{
			test1= extent.createTest("Tied register page");
			test1.log(Status.INFO, "starting test case7");
		
			
			TiedPageObject tiedObject= new TiedPageObject();
			tiedObject.clickOnThelink(driver);
			
			signUpPageObject signUpObject = new  signUpPageObject();
					signUpObject.clickOnThelink(driver);	
					
					RegisterPageObject registerObejct = new RegisterPageObject();
					registerObejct.enterTheText(driver);
					
					registerObejct.enterTheEmail(driver);
					registerObejct.enterThePassword(driver);
					registerObejct.clickOnCreateAccount(driver);
		}
		
			@Test(priority = 8)
		public void latestNews() throws IOException, InterruptedException
		{
			test1= extent.createTest("Tied latest news page");
	
			test1.log(Status.INFO, "starting test case8");
			
			TiedPageObject tiedObject= new TiedPageObject();
			tiedObject.clickOnTheText5(driver);
			WhatsNewPageObject newObject = new WhatsNewPageObject();
			newObject.checkTheText(driver);
		}
		
	
			
		@Test(priority = 9)
		public void commitments() throws IOException, InterruptedException
		{
			test1= extent.createTest("Tied our commitments page");
	
			test1.log(Status.INFO, "starting test case9");
			
			TiedPageObject tiedObject= new TiedPageObject();
			tiedObject.ourCommitments(driver);
			CommitmentsPageObject commitmentObject = new CommitmentsPageObject();
			commitmentObject.checkTheText(driver);
		}
	
	
		@Test(priority = 10)
		public void contactHelp() throws IOException, InterruptedException
		{
			test1= extent.createTest("Tied contact us page");
	
			test1.log(Status.INFO, "starting test case10");
			
			TiedPageObject tiedObject= new TiedPageObject();
			tiedObject.clickOnThelink7(driver);
			//Thread.sleep(2000);
			ContactPageObject contactObject = new ContactPageObject();
		contactObject.checkTheText(driver);
			
		}
	
		@AfterMethod
		public void  exit() throws IOException
		{
			test1.pass("passed testcase screenshot",MediaEntityBuilder.createScreenCaptureFromPath(Screenshots.screenshot(driver )).build());
			log.fatal("Error");
			extent.flush();
			driver.quit();
			
		}
		
}
		
		

