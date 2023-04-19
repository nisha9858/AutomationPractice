package javaScriptExecutorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utilities.SeleniumUtility;

public class OrangeHrmEX extends SeleniumUtility {
  @Test
  public void orangeHrm() throws InterruptedException {
	  
	  
	WebDriver driver=setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	    Thread.sleep(1000);
		
		
		
		js.executeScript("document.getElementsByName('username')[0].value='Admin'");
		
		Thread.sleep(1000);
		
		js.executeScript("document.getElementsByName('password')[0].value='admin123'");
		
		Thread.sleep(1000);
		
	
		js.executeScript("document.getElementsByClassName('oxd-button--medium oxd-button--main orangehrm-login-button')[0].click();");
		
	  
	  
	  
	  
  }
}
