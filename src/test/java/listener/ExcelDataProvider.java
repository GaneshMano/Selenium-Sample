package listener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	public static WebDriver driver;

	@BeforeClass
	public static void browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mukesh\\eclipse-workspace1\\Selenium\\Extension\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	/*
	 * @org.testng.annotations.DataProvider (name="loginData") public String[][]
	 * loginProvider() { String [] [] data = {{"Admin","admin123"},
	 * {"Admin","admin12"}, {"Admi","admin123"}, {"Admi","admin12"}};
	 * 
	 * return data; }
	 */
	
	@DataProvider(name = "loginData")
	public String[][] excelReader() throws IOException {
		File f = new File("E:\\Ganesh Java\\Classes\\Project Class\\DataProvider.xlsx");
		FileInputStream file = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(file);
		Sheet sheet = wb.getSheet("Sheet1");
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int NoOfColumn = sheet.getRow(0).getLastCellNum();
		String [] [] data = new String [noOfRows-1] [NoOfColumn];
		
		for (int i = 0; i < noOfRows-1; i++) {
			for (int j = 0; j < NoOfColumn; j++) {
				DataFormatter daf = new DataFormatter();
				data[i][j] = daf.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			}
		}
		
		return data;
		
	}
		
	@Test (dataProvider = "loginData")
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
		driver.findElement(By.id("btnLogin")).click();
		
	}

}
