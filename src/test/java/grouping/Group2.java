package grouping;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Group2 {

	@Test(groups = { "smoke", "reg" })
	public void userName1() {
		System.out.println("Username1");
	}

	@Test
	public void password1() {
		System.out.println("Password1");
	}

	@Test(groups = { "smoke", "reg" })
	public void login1() {
		System.out.println("Login1");
	}

}
