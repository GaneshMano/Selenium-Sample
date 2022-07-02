package grouping;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Group1 {

	@Test(groups = { "smoke", "reg" })
	public void userName() {
		System.out.println("Username");
	}

	@Test (groups = { "reg" })
	public void password() {
		System.out.println("Password");
	}

	@Test(groups = { "smoke" , "reg"})
	public void login() {
		System.out.println("Login");
	}

	@Test(groups = { "sanity"})
	public void login2() {
		System.out.println("Login2");
	}

	
}
