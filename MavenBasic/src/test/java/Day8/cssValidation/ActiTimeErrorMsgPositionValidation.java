package Day8.cssValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class ActiTimeErrorMsgPositionValidation {
	
	
      static WebDriver driver;
	
	public static void main(String[] args) {
		
	WebDriver driver=SeleniumUtility.setUp("chrome","http://demo.actitime.com/login.do" );
		
		
	SeleniumUtility.clickOnElement(driver.findElement(By.id("loginButton")));
	
	
	//Explicit wait
	
	SeleniumUtility.waitUntilTextToBeMatched(By.cssSelector(".errormsg"),"Username or Password is invalid. Please try again.");
	
	
	WebElement errorMsg=driver.findElement(By.cssSelector(".errormsg"));
	
	// identify username
	
	WebElement userInputField=driver.findElement(By.id("username"));
	
	//x and y cordination
	
	Point errorPosition=errorMsg.getLocation();
	
	int error_X_cord=errorPosition.getX();
	
	int error_Y_cord=errorPosition.getY();
	
	System.out.println("Error msg X-cords   :  "+ error_X_cord);
	
	System.out.println("Error msg Y-cords   :  "+ error_Y_cord);
	
	Point userNamePosition=userInputField.getLocation();
	
	int username_X_cord=userNamePosition.getX();
	
	int username_Y_cord=userNamePosition.getY();
	
	System.out.println("UserName msg X-cords   :  "+ username_X_cord);
	
	System.out.println("UserName msg Y-cords   :  "+ username_Y_cord);
	
	System.out.println("Is error msg getting displayed above username input field :   "+(error_Y_cord <( username_Y_cord)));
	

}
	
}
