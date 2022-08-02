package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;

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
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;






import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends BaseClass {
	

	public static WebDriver driver ;
	
	
	ExtentHtmlReporter html;
	ExtentReports extent;
	ExtentTest test1;
	BaseClass baseObject ;
	

	public static Logger log= LogManager.getLogger(StepDefinitions.class.getName());
	
	
	

@Given("initialize browser with edge")
public void initialize_browser_with_edge() throws IOException {
	driver = initializeDriver();
	log.info("initializing driver");
}
@And("Navigate to {string} site")
public void navigate_to_site(String string) throws InterruptedException {
	
	
	//test1.log(Status.INFO, "starting test case");
	
	
}
@When("user enter {string} and click on search")
public void user_enter_and_click_on_search(String string) throws InterruptedException {
	test1= extent.createTest("Tied page");
	TiedPageObject tiedObject= new TiedPageObject();
	tiedObject.enterTheText(driver);
	
}
@Then("verify that user succesfully search the item")
public void verify_that_user_succesfully_search_the_item() {
	SearchPageObject searchObject = new SearchPageObject();
	searchObject.checkTheText(driver);
	log.info("verifying text");
}



@When("user mouseover on it list should be displyed")
public void user_mouseover_on_it_list_should_be_displyed() throws InterruptedException {
	test1= extent.createTest("Tied page2");
	
//	test1.log(Status.INFO, "starting test case2");
	
	TiedPageObject tiedObject= new TiedPageObject();
	tiedObject.checkTheText(driver);
}


@When("user click on the shoplink")
public void user_click_on_the_shoplink() throws InterruptedException {
	test1= extent.createTest("Tied shop page");
	TiedPageObject tiedObject= new TiedPageObject();
			tiedObject.mouseOverTheText(driver);
}

@Then("it should display the products")
public void it_should_display_the_products() throws InterruptedException {
   
	ResultPageObject resultObject = new ResultPageObject();
			resultObject.clickOnTheText(driver);
			
}
@When("user click on the link")
public void user_click_on_the_link() throws InterruptedException {
	test1= extent.createTest("Tied shop product page");
	TiedPageObject tiedObject= new TiedPageObject();
	tiedObject.checkTheText2(driver);
}
@Then("user should  verify the text3")
public void user_should_verify_the_text3() throws InterruptedException {
	WashingPageObject washObject = new WashingPageObject();
	washObject.checkTheText(driver);
}

@When("user check and verify the text")
public void user_check_and_verify_the_text() throws InterruptedException {
	test1= extent.createTest("Tied home page");
	TiedPageObject tiedObject= new TiedPageObject();
	tiedObject.checkTheText4(driver);
}
@When("user click on register  rigister page displayed")
public void user_click_on_register_rigister_page_displayed() throws InterruptedException {
	test1= extent.createTest("Tied registration page");
	TiedPageObject tiedObject= new TiedPageObject();
	tiedObject.clickOnThelink(driver);	
}
@And("user should click on signup")
public void user_should_click_on_signup() throws InterruptedException {
	
	
	signUpPageObject signUpObject = new  signUpPageObject();
	signUpObject.clickOnThelink(driver);
}

@Then("user should verify the text2")
public void user_should_verify_the_text2() throws InterruptedException {
	RegisterPageObject registerObejct = new RegisterPageObject();
	registerObejct.checkTheText(driver);
	
}
@When("user click on link rigister registration page should be displayed")
public void user_click_on_link_rigister_registration_page_should_be_displayed()  throws InterruptedException {
	test1= extent.createTest("Tied signup page");

	TiedPageObject tiedObject= new TiedPageObject();
	tiedObject.clickOnThelink(driver);	
}
@And("user should click on signup button")
public void user_should_click_on_signup_button() throws InterruptedException {
		signUpPageObject signUpObject = new  signUpPageObject();
	signUpObject.clickOnThelink(driver);	
}

@Then("user should enter the firstname")
public void user_should_enter_the_firstname() throws InterruptedException {
	
	RegisterPageObject registerObejct = new RegisterPageObject();
	registerObejct.enterTheText(driver);
}


@Then("user should enter the email")
public void user_should_enter_the_email() throws InterruptedException {
	RegisterPageObject registerObejct = new RegisterPageObject();
	registerObejct.enterTheEmail(driver);
	
}

@Then("user should enter the password")
public void user_should_enter_the_password() throws InterruptedException {
	RegisterPageObject registerObejct = new RegisterPageObject();
	registerObejct.enterThePassword(driver);
	
}

@Then("user should click on create account button")
public void user_should_click_on_create_account_button()  throws InterruptedException {
	RegisterPageObject registerObejct = new RegisterPageObject();
	
	registerObejct.clickOnCreateAccount(driver);
	
}
@When("user click on link latest news page should be displayed")
public void user_click_on_link_latest_news_page_should_be_displayed() throws InterruptedException {
	test1= extent.createTest("Tied what's new page");
	TiedPageObject tiedObject= new TiedPageObject();
	tiedObject.clickOnTheText5(driver);
	
}
@Then("user should verify the text in latest news page")
public void user_should_verify_the_text_in_latest_news_page() throws InterruptedException {
	
	WhatsNewPageObject newObject = new WhatsNewPageObject();
	newObject.checkTheText(driver);


}

@When("user click on link latest our commitments page should be displayed")
public void user_click_on_link_latest_our_commitments_page_should_be_displayed() throws InterruptedException {
    
	test1= extent.createTest("Tied commitments page");
	TiedPageObject tiedObject= new TiedPageObject();
	tiedObject.ourCommitments(driver);
	
}
@Then("user should verify the text in commitments page")
public void user_should_verify_the_text_in_commitments_page() throws InterruptedException {
	
	CommitmentsPageObject commitmentObject = new CommitmentsPageObject();
	commitmentObject.checkTheText(driver);
}


@When("user click on link latest our contact us page should be displayed")
public void user_click_on_link_latest_our_contact_us_page_should_be_displayed() throws InterruptedException {
	test1= extent.createTest("Tied contact us page");
	TiedPageObject tiedObject= new TiedPageObject();
	tiedObject.clickOnThelink7(driver);
	
	
}
@Then("user should verify the text in contact us page")
public void user_should_verify_the_text_in_contact_us_page() throws InterruptedException {
	ContactPageObject contactObject = new ContactPageObject();
	contactObject.checkTheText(driver);
	
	
}

	@Before
	public void suite()
	{
		baseObject = new BaseClass();
		html= new ExtentHtmlReporter(new File(System.getProperty("user.dir" )+ "/reports/ExtentReport.html"));			
		extent = new ExtentReports();
		
		extent.attachReporter(html);
		
	}

	@After(order=1)
	public void  exit(Scenario screenshot) throws IOException
	{
		
		if(screenshot.isFailed())
		{
		test1.fail("Failed testcase screenshot",MediaEntityBuilder.createScreenCaptureFromPath(Screenshots.screenshot(driver )).build());
		log.fatal("Error");
		}
		else
			test1.pass("passed testcase screenshot",MediaEntityBuilder.createScreenCaptureFromPath(Screenshots.screenshot(driver )).build());
		
		extent.flush();
		driver.close();
	}
	@After(order=0)
	public void quit()
	{
		driver.quit();
	}
	
}