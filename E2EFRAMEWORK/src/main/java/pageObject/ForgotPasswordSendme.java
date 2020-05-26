package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordSendme {
public WebDriver driver;
public ForgotPasswordSendme(WebDriver driver2) {
	this.driver=driver2;
}
By sendMeText=By.xpath("//input[contains(@placeholder,'name@')]");

public WebElement sendmeText() {
	return driver.findElement(sendMeText);
}

By SendMeIButton =By.cssSelector("[value*='Send Me']");

public  WebElement SendMeIButton() {
	return driver.findElement(SendMeIButton);
}



}
