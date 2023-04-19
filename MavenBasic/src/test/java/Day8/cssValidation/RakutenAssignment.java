package Day8.cssValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class RakutenAssignment {

	public static void main(String[] args) {
		
		
		WebDriver driver=SeleniumUtility.setUp("chrome","https://www.rakuten.com/");
		
		
		
       	driver.findElement(By.cssSelector("#header_sign_in")).click();
		
		
	
		driver.switchTo().frame(5);
		
		

		driver.findElement(By.cssSelector("#emailAddress")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.cssSelector("#password")).sendKeys("abcd@1234");
		
		driver.findElement(By.cssSelector("#email-auth-btn")).click();
		
	
		
		WebElement errorMsg=driver.findElement(By.xpath("//div[@class='chakra-alert rr-auth-web-error-box css-nfmpwv']"));
		
		System.out.println("error msg is : "+errorMsg.getText());
		
		String errorColorInRGBA=errorMsg.getCssValue("color");
		
		String ErrorBackgroundColor=errorMsg.getCssValue("background");
		
		  String ErrorTextColor=errorMsg.getCssValue("color");
		  
		  System.out.println("Error msg color Code : "+errorColorInRGBA);

		  System.out.println("Print background color in RgB format:  "+ErrorBackgroundColor);
		  
			System.out.println("Print Text color in RgB format:  "+ErrorTextColor);
	}

}
