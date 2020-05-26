import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_trip_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Make_trip_2 mtds = new Make_trip_2();
		//mtds.footerLinks();
		// mtds.chk_textt();
		// mtds.issele();
		// mtds.AltAutto();
		
		// mtds.names_size();
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		mtds.Fromc(driver);
	}

	public void Fromc(WebDriver driver) {
		
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'From')]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'From')]")).sendKeys("chennai");
		driver.findElement(By.xpath("//input[contains(@placeholder,'From')]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[contains(@placeholder,'From')]")).sendKeys(Keys.ENTER);
	}

	public void names_size() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);

		List<WebElement> names = driver
				.findElements(By.xpath("//a[@class='darkGreyText'] //p[@class='font12 appendBottom3']"));
		System.out.println(names.size());

		for (WebElement TRAIL : names) {
			System.out.println(TRAIL.getText());

		}
	}

	public void AltAutto() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		WebElement FromList = driver.findElement(By.xpath("//input[contains(@placeholder,'From')]"));
		FromList.click();
		FromList.sendKeys("chennai");
		for (int i = 1; i <= 2; i++) {
			FromList.sendKeys(Keys.ARROW_DOWN);

		}
		FromList.sendKeys(Keys.ENTER);

		WebElement ToList = driver.findElement(By.xpath("//input[contains(@placeholder,'To')]"));
		ToList.click();
		ToList.sendKeys("pune");
		ToList.sendKeys(Keys.ARROW_DOWN);
		ToList.sendKeys(Keys.ENTER);

		// driver.findElement(By.xpath("//input[contains(@placeholder,'From')]")).click();

		// driver.findElement(By.xpath("//input[contains(@placeholder,'From')]")).sendKeys("chennai");

	}

	public void issele() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		WebElement Status = driver.findElement(By.xpath("//p[contains(@class,'latoBlack font12 greyText')]"));
		System.out.println(Status.isEnabled());
	}

	public void chk_textt() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		WebElement tr = driver.findElement(By.xpath("//p[contains(@class,'latoBlack')]"));
		System.out.println(tr.getText());
		String ck = tr.getText();
		if (ck.contains("Tap to add a return date for bigger discounts")) {
			tr.click();

		}

	}
	public void footerLinks() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		//driver.findElement(By.className("makeFlex appendBottom40 footerLinks"));
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		WebElement list=driver.findElement(By.xpath("//div[@class='makeFlex appendBottom40 footerLinks']"));
		
List<WebElement> num=list.findElements(By.tagName("a"));
System.out.println(num.size());
for(WebElement footerLinks : num) {
	
	System.out.println(footerLinks.getText());
}
		
	}

}
