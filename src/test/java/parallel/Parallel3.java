package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parallel3 {
	
	WebDriver driver;
	@BeforeTest
	public void test1() {
		System.out.println("Thread Id " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mukesh\\eclipse-workspace1\\Selenium\\Extension\\chromedriver.exe");

		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("Thread Id " + Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("test2");
	}

	@AfterTest
	public void test3() {
		System.out.println("Thread Id " + Thread.currentThread().getId());
		driver.close();
		System.out.println("test3");
	}

	

}
