import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_my_trip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("HYDERABAD");
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);

		// WebElement suggestion= driver.findElement(By.xpath("//div[@class='makeFlex
		// hrtlCenter']"));
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='pushRight font14 lightGreyText latoBold']"));
		for (WebElement Make_my_trip : suggestion) {
			System.out.println(Make_my_trip.getText());
			// Make_my_trip.getText();
			if (Make_my_trip.getText().contains("HYD")) {
				Make_my_trip.click();
				driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
				//driver.findElement(By.xpath("//input[contains(@class,'react')]")).click();
				driver.findElement(By.xpath("//input[contains(@class,'react')]")).sendKeys("chennai");	
				driver.findElement(By.xpath("//input[contains(@class,'react')]")).sendKeys(Keys.ARROW_DOWN);
				driver.findElement(By.xpath("//input[contains(@class,'react')]")).sendKeys(Keys.ENTER);
			}

		}
		

	}

}
