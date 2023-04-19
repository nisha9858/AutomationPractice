package keyBoardhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class KeyboardOps3 {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=SeleniumUtility.setUp("chrome","http://demo.automationtesting.in/Register.html");
		
		//identify first name input field
		
		WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		
		//type first name as admin and use ctrl+a
		
		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		
		
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		//or  type first name as admin and use ctrl+a
		
	//	firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		
		//in last name field use ctrl+v
		
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		
		
		
		
		
		
	}

}
