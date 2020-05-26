package PackageAutoTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test(groups= {"Smoke"})
	
public void demo3(){
	System.out.println("Day 2 First Test Ng");
}
	@Test
	
	public void afterMEthod(){
		System.out.println(" afterMethod 1");
	}
	@Test
	
	public void afterMEthod2(){
		System.out.println(" afterMethod 2");
	}
	
	@BeforeTest
	public void beforeAnnotation(){
		System.out.println("@1St Folder: Before Test Annotation");
	}
	
	@AfterSuite
	public void AfterSuite(){
		System.out.println("Finally After  Suite ");
	}
	@AfterMethod
	public void BeforeSuite(){
		System.out.println("After Methods in First Test Folder ");
	}
	
	
}
