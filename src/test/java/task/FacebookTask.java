package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookTask {
	
	static WebDriver driver;
	
	@BeforeClass
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\eclipse-workspace1\\Selenium\\Extension\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Parameters ({"username"})
	@Test (priority = 1)
	public void userName(String usernamevalue) {
		driver.findElement(By.id("email")).sendKeys(usernamevalue);
		Assert.assertEquals(usernamevalue, "Ganeshmano4u@gmail.com");
		
	}
	
	@Parameters ({"password"})
	@Test (priority = 2)
	public void password(String passwordvalue) {
		driver.findElement(By.id("pass")).sendKeys(passwordvalue);
		Assert.assertEquals(passwordvalue, "Ganesh@9962");
	}
	
	

}
