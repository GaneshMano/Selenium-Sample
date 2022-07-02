package listener;

import org.testng.annotations.Test;

public class Sample3 {
	
	@Test(invocationCount = 10)
	public void sample3() {
		System.out.println("Iam sample3");
	}

}
