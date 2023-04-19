package switchstatements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class ActiveElementHandling {

	public static void main(String[] args) {
		
		WebDriver driver=SeleniumUtility.setUp("chrome","http://demo.actitime.com/login.do");
		
		//get focused element from UI
		
		WebElement focusedElement=driver.switchTo().activeElement();
		
		String actualAttributeName=focusedElement.getAttribute("placeholder");
		
		System.out.println("Is focus on user name input field : "+actualAttributeName.equals("Username"));
		
		//type username and press TAB button
		
		
		focusedElement.sendKeys("admin",Keys.TAB);
		
		//move to Active Element,type password as manager and press Enter button
		
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
		
	}
}
