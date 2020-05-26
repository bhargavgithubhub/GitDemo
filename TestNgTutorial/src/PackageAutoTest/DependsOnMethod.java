package PackageAutoTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethod {

	
	
	@Test(enabled=true)
	public void testAdd() {
		System.out.println("testAdd()");
		int sum=15+2;
		Assert.assertEquals("BHARGAV", "BHARGAV");
		Assert.assertEquals(sum , 17);
		Assert.assertTrue(true, "sdfsdfsdfds");
	}

	@Test
	public void testDivide() {
		System.out.println("testDivide()");
		int sum=16/0;;
		Assert.assertEquals(sum, 16);
	}
	
	@Test(dependsOnMethods={ "testDivide"})
	//skiped as it depends on testdivide and it is failed 
	public void testProcessRealNumbers() {
		System.out.println("testProcessRealNumbers()");
	}

	@Test(dependsOnMethods={ "testAdd","testDivide"}, alwaysRun=true)
	//always=true thats y not skipped
	public void testProcessEvenNumbers() {
		System.out.println("testProcessEvenNumbers()");
	}

}