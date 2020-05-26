package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	By login=By.xpath("//a[contains(@href,'sign_in')]");


	public LoginPage loginLink() {
		driver.findElement(login).click();
	LoginPage lp=new LoginPage(driver);
	return lp;
		
	}
	By FeatureCourses=By.xpath("//h2[contains(text(),'Featured Courses')]");
	public WebElement FeaturesTextVerification() {
		
		return driver.findElement(FeatureCourses);
		
	}
}
