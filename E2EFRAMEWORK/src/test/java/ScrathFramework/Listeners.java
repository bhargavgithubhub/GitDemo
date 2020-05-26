package ScrathFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Base;
import resources.ExtentReportsTsng;

public class Listeners extends Base implements ITestListener  {
	ExtentReports extent=ExtentReportsTsng.getExtentObject();
ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		
test=extent.createTest(result.getMethod().getMethodName());	

		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "Test Passes by ExtentReports");
		
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		//System.out.println(result.getMethod().getMethodName());
		test.log(Status.FAIL, result.getThrowable());
		test.fail(result.getThrowable());
		System.out.println("Listners are working ");
		
		WebDriver driver=null;
		
			try {
				driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			} catch (Exception  e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	
	String TcName=result.getMethod().getMethodName();
	
		try {
		
			String imgPath=	getScreenShot(TcName,driver);
			
	test.addScreenCaptureFromPath(imgPath, TcName);
	
			//getScreenShot(TcName,driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

	

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}
	
	

}
