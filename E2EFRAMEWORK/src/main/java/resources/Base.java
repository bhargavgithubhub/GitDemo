package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	//static means commonly shared in all test cases and all the methods " by overriding and not creating new object"so its good if runninng sequential manner if running in parllell sont use static
	//public static WebDriver driver;
	
//public creates new memory allocation but static only one memory allocation in heap memory
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();

		/// System.setProperty("User.dir")="C:\\Users\\BHARGAVK\\eclipse-workspace\\E2EFRAMEWORK
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\Data.properties");
		prop.load(fis);
//to  run in maven use below formatt.
		//String brwName=System.getProperty("chrome");
		//from maven use are passing value of browser that is "chrome" to base class browser paramerer 
		//maven test-Dbrowser=chrome

		String brwName = prop.getProperty("browser");

		System.out.println(brwName);
		// System.out.println(prop.getProperty("url"));

		if (brwName.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
             ChromeOptions options = new ChromeOptions();

			// System.setProperty("webdriver.chrome.driver",
			// "C:\\chrome_direct\\chromedriver.exe");
			if (brwName.contains("--headless"))
			{
				options.addArguments("--headless");
			}
			
			driver = new ChromeDriver(options);
//driver= new ChromeDriver();

		} else if (brwName.equals("FireFox")) {
			System.out.println("FF invoking Correctly");

			System.setProperty("webdriver.gecko.driver", "C:\\FireFoxDriver\\GeckoDriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
		return driver;
	}

	public String getScreenShot(String Tcname, WebDriver driver) throws IOException {
		TakesScreenshot tc = (TakesScreenshot) driver;
		File source = tc.getScreenshotAs(OutputType.FILE);
		String destFile = System.getProperty("user.dir") + "\\reports\\" + Tcname + ".png";
		FileUtils.copyFile(source, new File(destFile));
return destFile;
	}

}
