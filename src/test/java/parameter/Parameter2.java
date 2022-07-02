package parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter2 {
	

	
	@Parameters ("username")
	@Test (priority = 1)
	public void username(String user) {
		System.out.println(user);
	}
	
	@Parameters ("password")
	@Test (priority = 2)
	public void password(String pass) {
		System.out.println(pass);
	}
	
	
}
