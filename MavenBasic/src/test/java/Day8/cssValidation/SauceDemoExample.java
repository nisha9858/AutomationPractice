package Day8.cssValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class SauceDemoExample {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		SeleniumUtility.setUp("chrome","https://www.saucedemo.com/");
		
		
		
		WebElement userNameText=SeleniumUtility.driver.findElement(By.cssSelector("#root>div>:last-child>:last-child>div>div"));
		
		
		String userNameWithLabel=userNameText.getText();
		
	     System.out.println(userNameWithLabel);
	     
	     String user[]=userNameWithLabel.split("\n");
	     
	     
	 	SeleniumUtility.driver.findElement(By.id("user-name")).sendKeys(user[1]);
	 	 String Username[]= {"Accepted usernames are:","standard_user","locked_out_user","problem_user","performance_glitch_user"};
	 	
	 	if(Username[1]==user[1]) {
	 		
 		System.out.println("Login done ");
	 		
	 	}else {
	 		
	 		System.out.println("Login is not done");
	 		
	 	}
	 	
	 	
		System.out.println("****************************************************");
	
		
		WebElement passwordText=SeleniumUtility.driver.findElement(By.cssSelector("#root>div:last-child>:last-child>div>*:last-child>div[class='login_password']"));
		
		String passwordWithLabel=passwordText.getText();
		
		String [] password =passwordWithLabel.split("\n");
		
		SeleniumUtility.driver.findElement(By.id("password")).sendKeys(password[1]);
		

		
		
		System.out.println("**************************************************");
		
		WebElement color=SeleniumUtility.driver.findElement(By.cssSelector("#login-button"));
		
		String LoginBackgroundColor=color.getCssValue("background-color");
		
		System.out.println("Print background color in RgB format:  "+LoginBackgroundColor);
		
        String LoginTextColor=color.getCssValue("color");
        
		
		System.out.println("Print Text color in RgB format:  "+LoginTextColor);
		
		
		
		
		
		SeleniumUtility.driver.findElement(By.id("login-button")).click();
		
		
		
		}

}
