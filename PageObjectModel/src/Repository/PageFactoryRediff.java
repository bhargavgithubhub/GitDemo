package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageFactoryRediff {


public  WebDriver driver;

public PageFactoryRediff(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


@FindBy(xpath="//input[@id='login1']")
WebElement login;
@FindBy(id="password")
WebElement password;
@FindBy(name="proceed")
WebElement ClicksignIn;

public WebElement login() {
	return login;
}

public WebElement password() {
	return password;
	
}

public WebElement ClicksignIn() {
	return ClicksignIn;
}
}
