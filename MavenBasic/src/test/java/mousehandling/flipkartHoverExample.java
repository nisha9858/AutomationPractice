package mousehandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class flipkartHoverExample {

	public static void main(String[] args) {

		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.flipkart.com/");

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);

		List<WebElement> Menu = driver.findElements(By.xpath("//div[@class='_37M3Pb']//div[@class='xtXmba']"));

		System.out.println("Main menu option count :  " + Menu.size());

		// create instance of Actions class

		Actions act = new Actions(driver);
	
		for (int i = 0; i < Menu.size(); i++) {

			System.out.println("option name  : " + Menu.get(i).getText());

			act.moveToElement(Menu.get(i)).perform();

		

		}

	}

}
