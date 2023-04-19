package Day8.cssValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class ActiTimeErrorMsgValidation {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
	WebDriver driver=SeleniumUtility.setUp("chrome","http://demo.actitime.com/login.do" );
		
		
	SeleniumUtility.clickOnElement(driver.findElement(By.id("loginButton")));
	
	//Explicit wait
	
	SeleniumUtility.waitUntilTextToBeMatched(By.cssSelector(".errormsg"),"Username or Password is invalid. Please try again.");
	
	
	WebElement errorMsg=driver.findElement(By.cssSelector(".errormsg"));
	
	
	
	String errorColorInRGBA=errorMsg.getCssValue("color");
	
	String errorFontSize=errorMsg.getCssValue("font-size");
	
	String errorLineHeight=errorMsg.getCssValue("line-height");
	
	System.out.println("Error msg color Code : "+errorColorInRGBA);
	
	System.out.println("Error msg Font Size : "+ errorFontSize);
	
	System.out.println("Error msg line height : "+errorLineHeight );
	
	
		
	}

}
