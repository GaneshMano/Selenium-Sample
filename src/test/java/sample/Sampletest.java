package sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sampletest {
	
	@Test (priority = 0)
	public void userName() {
		System.out.println("Username");
	}
	
	@Test (priority = -1)
	public void password() {
		System.out.println("Password");
	}
	
	@Test (priority = 2) @Ignore
	public void login() {
		System.out.println("Login");
	}

}
