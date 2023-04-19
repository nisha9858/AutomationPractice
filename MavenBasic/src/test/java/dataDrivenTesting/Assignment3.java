package dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.SeleniumUtility;

public class Assignment3  extends SeleniumUtility{

	
	String appUrl;
	String userName;
	String password;
	
	@BeforeTest
	public void getData() {
		appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 4, 0);
		userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 4, 1);
		password=ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 4, 2);
	}

	@Test
	public void actitimeLogin() {
			WebDriver driver=setUp("chrome", appUrl);			
			driver.findElement(By.id("username")).sendKeys(userName);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			if(getCurrentTitleOfApplication("actiTIME - Login").equals("actiTIME - Enter Time-Track")) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 4, 5,"Passed");
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 4, 4,"actiTIME - Login");
			}else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 4, 5,"Failed");
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "Sheet2", 4, 4,"actiTIME - Login");
			}
			Assert.assertEquals(getCurrentTitleOfApplication(), "actiTIME - Enter Time-Track");
	}
	@AfterTest
	public void cleanUp1() {		
		cleanUp();
	}
}


