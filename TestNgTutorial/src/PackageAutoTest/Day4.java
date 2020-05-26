package PackageAutoTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Day4 {
    @Parameters({"UrlTestLevel","URLSuiteLevel"})
	@Test
	public void ClassLevelParameters(String cLevel,String Global) {
		System.out.println("Day 4 : Depends First Method" );
		System.out.println( "Global Level Parameters :  " + Global);
	System.out.println( "Class Level Parameters :  " + cLevel);
    }

	@Test(timeOut=40000,enabled=true)
	public void day4Depend1() {
		System.out.println("Day 4 : Depends First Method");
	}
	
	@Test
	public void day4Depend2() {
		System.out.println("Day 4 : Depends Second Method");
	}
	@Test(dependsOnMethods= {"day4Depend1","day4Depend2"})
	public void aday4Depends() {
		System.out.println("Day 4 : After Depends Method");
	}
	@Test
	public void another() {
		System.out.println("Day 4 : Another Method");

	}

	@Test(groups= {"Smoke"})
	public void zday4_1() {
		System.out.println("Day 4 : Smoke");

	}

	@BeforeTest
	public void day4BeforeAnnotation() {
		System.out.println("Day 4 @@@@@@ Before Test Annotation");

	}

	@AfterTest
	public void day4AfterAnnotaion() {
		System.out.println("Day 4 @@@@@@@ After Test Annotation");

	}
}
