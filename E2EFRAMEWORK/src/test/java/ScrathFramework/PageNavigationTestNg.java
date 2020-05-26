package ScrathFramework;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import resources.Base;

public class PageNavigationTestNg extends Base{
	//to parallel run of all test cases
	WebDriver driver;
	public static Logger logManager = LogManager.getLogger(PageNavigationTestNg.class.getName());         
@BeforeTest 
	public void intilize() throws IOException {
	
		driver=initializeDriver();
		logManager.info("Driver is intializing");
		driver.get(prop.getProperty("url"));
		logManager.info("navigated to Home Page");
		driver.manage().window().maximize();
		//public static Logger log =LogManager.getLogger(PageNavigationTestNg.class.getName());
		// Logger log = LogManager.getLogger(PageNavigationTestNg.class.getName()); 
		                                                                              
	}
	
	
	@Test
	public void chooseBrowser() throws IOException {

		
		HomePage land=new HomePage(driver);
	String act=land.FeaturesTextVerification().getText();
	String expt="FEATURED ";
	Assert.assertEquals(act, expt);
	//logManager.info("Validated Text Message in Home Page");
		
	land.loginLink();
	
		
	}
	@AfterTest
	public void closingBrowser() {
		driver.close();
	}

}
