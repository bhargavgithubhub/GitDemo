package PackageAutoTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;



@Test(enabled=false)
public class Day1 {

	public void demo() {
		System.out.println("Day 1 First Test Ng");
	}
@Test()
	public void secondDemo() {
	//groups= {"Smoke"}
		System.out.println("Day 1 Second Test Ng");

	}


@AfterTest
public void AfterAnnotation() {
	System.out.println("@ 1st Folder After Test Annotation");

}
	
}
