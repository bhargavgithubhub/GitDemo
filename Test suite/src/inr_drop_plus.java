import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class inr_drop_plus {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);

		Select inr = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));

		inr.selectByValue("USD");
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		for (int i = 0; i < 2; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
		for (int j = 0; j < 2; j++) {
		driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		}
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
	}

}
