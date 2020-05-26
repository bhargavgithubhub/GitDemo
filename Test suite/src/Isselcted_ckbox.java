import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Isselcted_ckbox {

	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.SPICEJET.com");
		
		//WebElement sur=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']"));
	//	sur.click();
		//sur.isEnabled();
	//System.out.println(sur.isEnabled());
	//System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	//driver.findElement(By.id("//div[@id='Div1']")).getAttribute("style");
	//driver.findElement(By.id("//div[@id='Div1']")).getAttribute("style");
	//System.out.println
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Round Trip')]")).click();
		driver.findElement(By.id("Div1")).getAttribute("style").contains("1");
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	{
		System.out.println("enabled");
		}
	else 
	{
		System.out.println("not enabled");
	}
	}
}
	
		
	
			
		
	


		
	
