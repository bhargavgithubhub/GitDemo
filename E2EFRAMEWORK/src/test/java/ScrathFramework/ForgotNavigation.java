package ScrathFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.ForgotPasswordSendme;
import pageObject.HomePage;
import pageObject.LoginPage;
import resources.Base;

public class ForgotNavigation extends Base {
	
	public WebDriver driver;
	@BeforeTest
	public void intialize() throws IOException {
		driver=initializeDriver();
		String url=prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test
	public void forgotToSendMEButton() {
		
	HomePage home=new HomePage(driver);
	LoginPage lp=home.loginLink();
	lp.emailBox().sendKeys("sdfdsfdsf");
	ForgotPasswordSendme  send=lp.ForgotButton();
	send.sendmeText().sendKeys("sendmeVerification");
	
	send.SendMeIButton().click();
	
	
	
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
