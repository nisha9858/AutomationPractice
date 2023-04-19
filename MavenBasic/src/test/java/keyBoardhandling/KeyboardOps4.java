package keyBoardhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class KeyboardOps4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
     WebDriver driver=SeleniumUtility.setUp("chrome","https://www.flipkart.com/");
		
		
		
		//press ESCAPE button to remove login popup
		
		
	WebElement element=driver.findElement(By.xpath("//body"));
	
		  element.sendKeys(Keys.ESCAPE);
		//scrolling using page down button 
		
		for(int i=0;i<10;i++) {
			
			element.sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(1500);
			
			
		}
		
		Thread.sleep(1500);
		
		//Scrolling directly goto bottom of the page
		
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		
		Thread.sleep(1500);
		
		//Scrolling -directly go to of the page 
		
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
		
		
		}
		}


