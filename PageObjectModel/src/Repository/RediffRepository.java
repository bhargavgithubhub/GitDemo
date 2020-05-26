package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RediffRepository {


public  WebDriver driver;

public RediffRepository(WebDriver newdriver) {
	this.driver=newdriver;
}


public WebElement login() {
	return driver.findElement(By.xpath("//input[@id='login1']"));
}

public WebElement password() {
	return driver.findElement(By.id("password"));
	
}

public WebElement ClicksignIn() {
	return driver.findElement(By.name("proceed"));
}
}
