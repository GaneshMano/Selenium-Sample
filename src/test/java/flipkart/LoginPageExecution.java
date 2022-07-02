package flipkart;

import org.junit.runners.Parameterized.Parameters;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageExecution extends LoginPageFactory{
	
	@org.testng.annotations.Parameters ({"email"})
	@Test (priority = 1)
	public void email(String email) {
		findElement(email1).sendKeys(email);
		Assert.assertTrue(email.equals("Ganeshmano4u@gmail.com"));
		
	}
	
	
	@org.testng.annotations.Parameters ({"pass"})
	@Test (priority = 1)
	public void pass(String pass) {
		findElement(pass1).sendKeys(pass);
		Assert.assertTrue(pass.equals("Ganesh@9962"));
		
	}

}
