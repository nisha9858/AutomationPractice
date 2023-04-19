package Day6.webdriverwithPropertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utilities.SeleniumUtility;

public class ActiTimeLoginLogout {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppData.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String browser=prop.getProperty("browserName");
		
		String url=prop.getProperty("appUrl");
		
		String exp_LoginPageTitle=prop.getProperty("expectedLoginPageTitle");
		
		String UserName=prop.getProperty("username");
		
		String Password=prop.getProperty("password");
		
		String exp_HomePageTitle=prop.getProperty("expectedHomePageTitle");
		
		
		
		
		SeleniumUtility.setUp(browser, url);
		
		SeleniumUtility.driver.findElement(By.id("username")).sendKeys(UserName);
		
		SeleniumUtility.driver.findElement(By.name("pwd")).sendKeys(Password);
		
		SeleniumUtility.driver.findElement(By.id("loginButton")).click();
		
		
		SeleniumUtility.wait.until(ExpectedConditions.titleIs(exp_HomePageTitle));
		
		String act_HomePageTitle=SeleniumUtility.driver.getTitle();
		
		System.out.println("Home page validation status :"+act_HomePageTitle.equals(exp_HomePageTitle));
		
		//SeleniumUtility.driver.close();

	}

}
