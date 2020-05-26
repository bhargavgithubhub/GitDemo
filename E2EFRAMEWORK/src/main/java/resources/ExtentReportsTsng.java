package resources;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsTsng {
	static ExtentReports extent;
	
	public static  ExtentReports getExtentObject() {
		//String path =System.getProperty("user.dir")+"\\reports\\index.html";


		String pathForExtent=System.getProperty("user.dir")+"\\reports\\"+"indexOfExtent.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(pathForExtent);
		
		reporter.config().setReportName("Bhargav");
		reporter.config().setDocumentTitle("Web Automation Results by Bhargav");
		
		extent= new ExtentReports();
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Bhargav");
		return extent;
	}
	
}
