package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	public  LoginPage(WebDriver driver2) {
		this.driver=driver2;
	}



By email = By.xpath("//input[contains(@name,'user[email]')]");

public WebElement emailBox() {
	return driver.findElement(email);

}

By password = By.cssSelector("input[type*='password']");

public WebElement password() {
	return driver.findElement(password);
}

By LogInClick = By.xpath("//input[@value='Log In']");

public WebElement LogInClick() {

	return driver.findElement(LogInClick);
	
}


By textVerf=By.xpath("//div[@class='alert alert-danger']");

public WebElement textVerf() {
	return driver.findElement(textVerf);
}
By ForgotButton= By.xpath("//a[contains(text(),'Forgot')]");

public ForgotPasswordSendme ForgotButton() {
	driver.findElement(ForgotButton).click();
	return new ForgotPasswordSendme(driver);
	
	
}
}