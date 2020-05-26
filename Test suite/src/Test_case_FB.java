import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
 


public class Test_case_FB {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("http://facebook.com");
		String bh = driver.getTitle();
		System.out.println(bh);
		driver.findElement(By.id("email")).sendKeys("bhargav.gav");
		driver.findElement(By.xpath("//table[@role='presentation']/tbody/tr[2]/td[2]/input")).sendKeys("bhagav.gav");

	}

}
