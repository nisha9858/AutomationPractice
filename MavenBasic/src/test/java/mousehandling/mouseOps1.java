package mousehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class mouseOps1 {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=SeleniumUtility.setUp("chrome","http://demo.automationtesting.in/Register.html");
		
		//identify first name input field
		
		WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		firstName.sendKeys("admin");
		
		//create an instance of Action class
		
		Actions act=new Actions(driver);
		
		//with the help of Actions class reference perform appropriate action
		
		act.moveToElement(firstName).doubleClick()
		                                          .keyDown(Keys.CONTROL).sendKeys("c")
		                                          .keyUp(Keys.CONTROL).build().perform();
		
		//paste in last name
		
		
		WebElement lastName=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		   
		act.moveToElement(lastName).doubleClick()
		                                         .keyDown(Keys.CONTROL).sendKeys("v")
		                                         .keyUp(Keys.CONTROL).build().perform();

}
}
