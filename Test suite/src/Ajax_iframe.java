import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajax_iframe {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// driver.get("http://www.amazon.in/");
		//
		Actions act = new Actions(driver);
		//// act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		// act.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("trimmer").doubleClick().build().perform();
		/*
		 * below are alternative way of calling methods by static without creating
		 * object for class
		 */
		// mouse(driver,act);
		// mouse_same(driver, act);
		// Nwindow(driver);
		Iframe_drag_drop(driver);
	}

	public static void mouse(WebDriver drivers, Actions actss) {
	

		drivers.get("http://www.amazon.in/");
		// actss.moveToElement(drivers.findElement(By.xpath("//a[@id='nav-link-accountList']"))
		actss.moveToElement(drivers.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		actss.moveToElement(drivers.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click()
				.keyDown(Keys.SHIFT).sendKeys("trimmer").doubleClick().build().perform();
	}

	public static void mouse_same(WebDriver driver, Actions act) {

		driver.get("http://www.amazon.in/");
		act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click()
				.keyDown(Keys.SHIFT).sendKeys("trimmer").doubleClick().build().perform();

	}

	public static void Nwindow(WebDriver driver) throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> itr = ids.iterator();
		String parentw = itr.next();
		String childw = itr.next();
		driver.switchTo().window(childw);
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		// System.out.println(driver.getTitle());
		driver.switchTo().window(parentw);
		// System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div[1]/h3")).getText());

	}

	public static void Iframe_drag_drop(WebDriver driver) {
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());
////driver.switchTo().frame("frame-middle");
///driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		driver.switchTo().frame("frame-top").switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
//driver.switchTo().defaultContent();
		driver.navigate().back();
		System.out.println(driver.getTitle());
	}

}
