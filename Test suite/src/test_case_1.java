import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_case_1 {

	public static void main(String[] args) {
		
// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		driver.findElement(By.xpath("//div[@class='SDkEP']/DIV[2]/input")).sendKeys("news");
		
		//driver.findElement(By.xpath("//div[@class='SDkEP']/DIV[2]/input")).click();
		driver.findElement(By.xpath("//div[@class='tfB0Bf']//input[@name='btnK']")).click();;
	
				
		driver.findElement(By.xpath("//div[contains(@class,'TbwUpd')]/cite[contains(@class,'iUh30')]")).click();

	}
	

}
