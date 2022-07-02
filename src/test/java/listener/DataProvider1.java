package listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	public static WebDriver driver;

	@BeforeClass
	public static void browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mukesh\\eclipse-workspace1\\Selenium\\Extension\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

	@DataProvider(name = "loginData")
	public String[][] loginProvider() {
		String[][] data = { { "Admi", "admin12" }, { "Admin", "admin12" }, { "Admi", "admin123" },
				{ "Admin", "admin123" } };

		return data;
	}

	@Test(dataProvider = "loginData")
	public void launch(String userName, String passWord) {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Mukesh\\eclipse-workspace1\\Selenium\\Extension\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://opensource-demo.orangehrmlive.com/");
		 * driver.manage().window().maximize();
		 */
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(userName);
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(passWord);
		WebElement findElement = driver.findElement(By.id("btnLogin"));
		findElement.click();

	}

}
