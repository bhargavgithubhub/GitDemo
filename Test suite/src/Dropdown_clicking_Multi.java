import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_clicking_Multi {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Select s= new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		
		s.selectByValue("9");
		
		//s.selectByIndex(9);
		//driver.switchTo().alert().accept();
		
			//WebElement j=new WebElement();
			
					
			
			
		
		
		//driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
		
		
		
		
		///============================================================================================================
		/*/////driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='HYD']"))
				.click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		/* driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Hyderabad
		 (HYD)'][contains(text(),'Hyderabad (HYD)')]")).click();*/

	}

}
