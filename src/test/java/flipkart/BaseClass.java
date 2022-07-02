package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\eclipse-workspace1\\Selenium\\Extension\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login");
		driver.manage().window().maximize();
		
	}
	
		
	public WebElement findElement(String value) {
		return driver.findElement(By.xpath(value));
	}

}
