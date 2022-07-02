package parameter;

import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {
	
	@Parameters("user")
	@Test (priority = 1)
	public void username(String username) {
		System.out.println(username);
	}
	
	@Parameters("password")
	@Test (priority = 2)
	public void password(String password) {
		System.out.println(password);
	}
	
	@Parameters({"click", "user"})
	@Test (priority = 3)
	public void click(String click, String username) {
		System.out.println(click+ " "+username);
	}

}
