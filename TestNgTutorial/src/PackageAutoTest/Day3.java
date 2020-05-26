package PackageAutoTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Day3 {

	
	
	

	@Test
	public void IncludeTest() {
		System.out.println("Day 3 Include");
	}

	@Test

	public void ExcludeTest() {
		System.out.println("Day 3 Exclude");

	}

	@Test
	public void IncludeExcludeCombined() {
		System.out.println("Day 3 Combined Include Exclude");

	}
	
}
