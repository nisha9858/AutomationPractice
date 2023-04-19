package dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.SeleniumUtility;

public class Assignment6 extends SeleniumUtility{
	
	

	String appUrl;
	String userName;
	String password;
	
	@BeforeTest
	public void getData() {
		appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 6, 0);
		userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 6, 1);
		password=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 6, 2);
	}

	@Test
	public void actitimeLogin() {
			WebDriver driver=setUp("chrome", appUrl);			
			driver.findElement(By.name("username")).sendKeys(userName);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.className("oxd-button")).click();
			if(getCurrentTitleOfApplication("OrangeHRM").equals("OrangeHRM")) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 6, 5,"Passed");
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 6, 4,"OrangeHRM");
			}else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 6, 5,"Failed");
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 6, 4,"OrangeHRM");
			}
			Assert.assertEquals(getCurrentTitleOfApplication(), "OrangeHRM");
	}
	@AfterTest
	public void cleanUp1() {
		
		cleanUp();
		
	}

}



