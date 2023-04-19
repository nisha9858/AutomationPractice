package javaScriptExecutorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilities.SeleniumUtility;

public class Example3 extends SeleniumUtility {
	
	
	@Test
	
	public void testCase1() {
		
		
		WebDriver driver=setUp("chrome","https://www.flipkart.com/");
		
		WebElement element=driver.findElement(By.xpath("//body"));
		
		  element.sendKeys(Keys.ESCAPE);

		  JavascriptExecutor js=(JavascriptExecutor)driver;
			
		  //vertical scrolling 
		//	js.executeScript("window.scrollBy(0,2500)");
			
			//setSleepTime(2000);
		//	js.executeScript("window.scrollBy(0,-2500)");
			
			//horizontal scrolling 
			js.executeScript("window.scrollBy(500,0)");
	}

	private void setSleepTime(int i) {
		// TODO Auto-generated method stub
		
	}

}
