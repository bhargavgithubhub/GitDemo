package ScrathFramework;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import resources.Base;

public class DataProviderTestNgLogin extends Base{
	//for parallel execution we need to initialize webDriver object locally for all test to avoid inconsistency
	//for sequential execution we need not require to declare WebDriver locally
	WebDriver driver;
	@BeforeTest 
	public void intilize() throws IOException {
		driver=initializeDriver();
	
		
		//System.out.println(prop.getProperty("url"));
		
		driver.manage().window().maximize();
	}
	
	
	@Test(dataProvider="getData")
	public void chooseBrowserLogin(String email,String password,String Printer) throws IOException {
		driver.get(prop.getProperty("url"));
	
		HomePage land=new HomePage(driver);
		
	LoginPage	lp=land.loginLink();
		lp.emailBox().sendKeys(email);
		lp.password().sendKeys(password);
		//System.out.println(print);
		lp.LogInClick().click();
		String actual=lp.textVerf().getText();
		//System.out.println(actual);
		Assert.assertEquals(actual,"Invalid email ." );
		

		
		
		
	}
	@AfterTest
	public void closingBrowser() {
		driver.close();
	}
@DataProvider
public Object[][] getData() {
	
	//Array size data[2] means data[0], data[1]
	Object[][] data=new  Object[2][3];
	//rows--Data postive type/ Ne type::: stands for how many data types Test they should run for
	//columns---values: stands for how  many values for each test
	//
	data[0][0]="NormalUser@gmail.com";
	data[0][1]="password";
	data[0][2]="printing first user";
	
	data[1][0]="UnauthorisedUser@gmail.com";
	data[1][1]="Password";
	data[1][2]="rinting Second user";
	return data;
}


	

}
