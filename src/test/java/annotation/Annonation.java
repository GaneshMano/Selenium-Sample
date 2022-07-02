package annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annonation {
	
	@BeforeMethod
	public void test1() {
		System.out.println("Before Method");
	}
	
	@BeforeTest
	public void test2() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void test3() {
		System.out.println("Before Class");
	}
	
	@BeforeSuite
	public void test4() {
		System.out.println("Before Suite");
	}
	
	@Test
	public void test5() {
		System.out.println("Test");
	}
	
	@AfterTest
	public void test6() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public void test7() {
		System.out.println("After Class");
	}
	
	@AfterMethod
	public void test8() {
		System.out.println("After Method");
	}
	
	@AfterSuite
	public void test9() {
		System.out.println("After Suite");
	}
	
	
	

}
