package keyBoardhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtility;

public class KeyboardOps2 {
	
	public static void main(String[] args) {
		
		WebDriver driver=SeleniumUtility.setUp("chrome","https://www.flipkart.com/");
		
		
		
		//press ESCAPE button to remove login popup
		
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
	}

}
