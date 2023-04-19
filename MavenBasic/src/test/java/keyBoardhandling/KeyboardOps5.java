package keyBoardhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class KeyboardOps5 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
	     WebDriver driver=SeleniumUtility.setUp("chrome","https://www.flipkart.com/");
			
			
			
			//press ESCAPE button to remove login popup
			
			
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
		
	/**
	 * possible way to refresh  browser 
	 * 	1.driver.navigate().refresh()
	 * 2.sendKeys(Keys.F5)
	 * 3.by hitting same url again
	 * 4.ctrl+R
	 */
			  

}
	
}
