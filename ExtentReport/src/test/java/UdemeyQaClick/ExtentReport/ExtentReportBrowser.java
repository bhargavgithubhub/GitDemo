package UdemeyQaClick.ExtentReport;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;





public class ExtentReportBrowser{
	
	ExtentReports ext;
	@BeforeTest
	public void config(){
		String path=System.getProperty("user.dri")+"\\report\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);	
		reporter.config().setReportName("Bhargav's Web Automation Results");
		reporter.config().setDocumentTitle("Todays Extent Report by Bhargav");

		
		 ext= new ExtentReports();	
		 ext.attachReporter(reporter);
		 ext.setSystemInfo("Automation Tester", "Bhargav");
		 
		 
	}
	@Test
	public void ChromeBrow() {
		ExtentTest tst=ext.createTest("ChromeBrow");
		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
			System.out.println(driver.getTitle());	
			//tst.fail("Failed Explicitically ");
		
		driver.close();
			ext.flush();
	}
}