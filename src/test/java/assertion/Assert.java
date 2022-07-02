package assertion;

import org.testng.annotations.Test;

public class Assert {
	
	@Test (priority = 1)
	public void test() {
		org.testng.Assert.assertEquals("1", "1");
		
	}
	
	@Test (priority = 2)
	public void test1() {
		String s ="Ganesh";
		org.testng.Assert.assertTrue(s.contains("i"));
	}
	
	@Test (priority = 3)
	public void test2() {
		String s = "Ganesh";
		org.testng.Assert.assertFalse(s.contains("i"));
	}
	

}
