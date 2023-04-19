package javaScriptExecutorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilities.SeleniumUtility;

public class Example1 extends SeleniumUtility{
	
	@Test
	
	public void testCase1() {
		
		WebDriver driver=setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement element=driver.findElement(By.cssSelector(".buttonBlue"));
		
		//convert WebDriver instance into javascripteExecutor
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
         //	write the code to pderform operation
		
		js.executeScript("arguments[0].click();",element);
		
	}
	
	@Test
	
	public void testCase2() {
	
	WebDriver driver=setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("document.getElementsByClassName('button buttonBlue')[0].click();");
	
	
}
	
}
	
	


