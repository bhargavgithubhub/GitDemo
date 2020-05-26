import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.partialLinkText("Proceed to www.path2usa.com (unsafe)")).click();
		
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	

		driver.findElement(By.xpath("//input[@id='travel_date']")).click();		
WebElement dSwitch=driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));

while(!dSwitch.getText().contains("Nove"))
{
driver.findElement(By.xpath("//th[@class='next']")).click();
}

List<WebElement> dates= driver.findElements(By.xpath("//div[@class='datepicker-days']//td[@class='day']"));

for(int i=0; i<dates.size();i++) {
	
	//int newsize=dates.size()-1;
	
	
	if(dates.get(i).getText().equalsIgnoreCase("8")) {
		dates.get(i).click();
		break;
		
}
/*for(WebElement days :dates) {
	if(days.getText().contentEquals("19")) {
		days.click();
		
	}*/
	
	
}

	}

}
