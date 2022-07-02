package sample;

import org.testng.annotations.Test;

public class SampleTestSuiteFile2 {
	
	@Test (priority = 4)
	public void test3() {
		System.out.println("test5");
	}
	
	@Test (priority = 5)
	public void test4() {
		System.out.println("test6");
	}
	
	@Test (priority = 6)
	public void test5() {
		System.out.println("test7");
	}

}
