package switchstatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class HandlingFrame {

	public static void main(String[] args) {
		
		WebDriver driver=SeleniumUtility.setUp("chrome","https://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		
		//Draggable element is present inside frame,so first switch into frame
		
		//driver.switchTo().frame(0);
		
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		
		driver.switchTo().frame(frame);
		
		WebElement src=driver.findElement(By.id("draggable"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(src, 100, 0).perform();
		
		//omce you done with all the action in innerpage and want to perform any operation on main page dn use
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector(".logo")).click();

	}

}
