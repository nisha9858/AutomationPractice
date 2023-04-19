package keyBoardhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class KeyboardOps1 {
	
	public static void main(String[] args) {
		
		WebDriver driver=SeleniumUtility.setUp("chrome", "http://demo.actitime.com/login.do");
		
		//login in actitime without clicking on login button 
		
		
		WebElement userName=SeleniumUtility.driver.findElement(By.id("username"));
		
		SeleniumUtility.typeInput(userName,"admin");
		
		
		WebElement password=SeleniumUtility.driver.findElement(By.name("pwd"));
		
		
		SeleniumUtility.typeInput(password,"manager");
		
		
		//press enter button from keyboard
		
		password.sendKeys(Keys.ENTER);
		
	}
	

}
