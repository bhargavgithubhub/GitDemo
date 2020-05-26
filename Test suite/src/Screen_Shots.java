import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screen_Shots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		
			// TODO Auto-generated method stub

			 


		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
				driver.manage().window().maximize();
				//driver.manage().deleteAllCookies();
			
			//	driver.manage().deleteCookieNamed("sessionKey");
			
			//click on any link
				//login page- verify login url
				TakesScreenshot src=(TakesScreenshot)driver;
				File ft=src.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(ft,new File("C:\\Users\\BHARGAVK\\Desktop\\screenshot.png"));
				String dest=System.getProperty("user.dir")+"\\ScreenShotFolder\\"+"ss.png";
			
			FileUtils.copyFile(ft,new File(dest));
				
		        
				//File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				//FileUtils.copyFile(src,new File("C:\\Users\\BHARGAVK\\screenshot.png"));

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();

	}

	}



