import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo_TC {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// css--div[class='loginError']#error
		// css--with out tag--[class='loginError']
		// regular exp for css --div[class*='logi']
		// regular exp for css-- div[class*='login'][id*='error']
		// rediff--forget link--text-- u[contains(text(),'Forgot Password?')]

		/*
		 * for hper link /*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 * driver.findElement(By.partialLinkText("Password")).click();
		 * //driver.findElement(By.partialLinkText("Forgot")).click();
		 */
		Demo_TC tcv =new Demo_TC();
		tcv.parent_child();
		
	}
	
	
	
	public void parent_child( ) {
		System.setProperty("webdriver.gecko.driver", "C:\\FireFoxDriver\\GeckoDriver.exe");


		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new  FirefoxDriver();

		driver.get("http://www.qaclickacademy.com/interview.php");
		
		//driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[1]/following-sibling::li[2]")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Videos')]")).click();
		
		//System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));*/
}
}

