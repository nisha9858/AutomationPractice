package javaScriptExecutorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilities.SeleniumUtility;

public class Example2  extends SeleniumUtility {
	
	@Test
	
	public void testCase1() {
		
		WebDriver driver=setUp("chrome","http://demo.actitime.com/login.do");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('username').value='admin'");
		
		js.executeScript("document.getElementsByName('pwd')[0].value='manager'");
		
		js.executeScript("document.getElementById('loginButton').click();");
		
	//	WebElement element=driver.findElement(By.id("loginButton"));
		
	//	js.executeScript("arguments[0].click();",element);
		
		

}
}
