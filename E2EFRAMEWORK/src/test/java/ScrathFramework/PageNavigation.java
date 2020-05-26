package ScrathFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObject.HomePage;
import resources.Base;

public class PageNavigation extends Base {

	// TODO Auto-generated method stub
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException  {
		PageNavigation obj=new PageNavigation();
		obj.chooseBrowser();
		HomePage land=new HomePage(driver);
		land.loginLink();
		
	}
	////////////////////////////////////////////////////////////

	public void chooseBrowser() throws IOException {

		driver=initializeDriver();
		String UrlName=prop.getProperty("url");
		driver.get(UrlName);
		
		
	}

}
