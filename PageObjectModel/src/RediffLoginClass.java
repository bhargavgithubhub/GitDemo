import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Repository.PageFactoryRediff;
import Repository.RediffRepository;

public class RediffLoginClass {
	@Test
	public void Login() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	/*RediffRepository objRep=new RediffRepository(driver);
	objRep.login().sendKeys("Bhargav");
	objRep.password().sendKeys("khbzhdbck");
	objRep.ClicksignIn().click();*/
		
		PageFactoryRediff obj=new PageFactoryRediff(driver);
		obj.login().sendKeys("FactoryMethod");
		obj.password().sendKeys("dsvsdvsd");
		obj.ClicksignIn().click();
		
	}
}

