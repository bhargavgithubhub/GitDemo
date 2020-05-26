package PackageAutoTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day5 {
	@Parameters({"URLSuiteLevel"})
	@Test()
	public void GlobalSuiteLevelParameters(String globalLevel ) {
		System.out.println("Day 4 : Depends First Method" + "Class Parameters :cLevel " + globalLevel);
	}

	@Test(dataProvider="getDatas")
	public void printData(String USerName, String Password) {
		System.out.println("UserName :: "+USerName+ " ,Password :"+Password);
		System.out.println("Day5.printData()");
	}

	@Test
	public void Day5_1() {
		System.out.println("Day 5:  First Test Ng");

	}

	@Test
	public void Day_2() {
		System.out.println("Day 5 : Second Test Ng");
	}

	@Test
	public void Day5_3() {
		System.out.println("Day 5 : Third Test Ng");

	}

	@AfterMethod
	public void Day5AfterAnnotaion() {
		System.out.println("Day 5 :  After Method");

	}
	@BeforeMethod
	public void Day5BeforeAnnotaion() {
		System.out.println("Day 5 : Before Method");

	}
	@BeforeSuite
	public void Day5BeforeSuite() {
		System.out.println("Day 5 :@@@@ Before Suite");

	}
	@DataProvider()
	public Object[][] getDatas() {
		
		Object[][] data= new Object[3][2];
		data[0][0]="First User";
		data[0][1]="First Password";
		data[1][0]="Second User";
		data[1][1]="Second Password";
		data[2][0]="Third User";
		data[2][1]="Third Password";
		return data;
	}
}
