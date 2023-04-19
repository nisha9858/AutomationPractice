package windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utilities.SeleniumUtility;

public class HandlingWindow  extends SeleniumUtility{
	
	
	@Test
		
	public void testWindowHandling() {
		
		WebDriver driver=setUp("chrome", "https://etrain.info/in");
	
		System.out.println("Home page current Url : "+getCurrentUrlOfApplication());
		
		System.out.println("Home page current Title : "+getCurrentTitleOfApplication());
	
		
		//get current window unique id
		
		String homeWinId=driver.getWindowHandle();
		
		System.out.println("Home Page window Id:  "+homeWinId);
		
		//click on twitter
		
		clickOnElement(driver.findElement(By.cssSelector(".icon-twitter")));
		
		//after click on twitter click,get all window id
		
		Set<String>allWinIds=driver.getWindowHandles();
		
		System.out.println("All window id= "+allWinIds);
		
		//get child window id 
		
		allWinIds.remove(homeWinId);
		
		System.out.println("after removing homeWinId from allWinIds,now allWinds are   :"+allWinIds);
		
	//	Iterator<String>itr=allWinIds.iterator();
		
	//	String childWinId=itr.next();
		
		//or
		
		String childWinId=allWinIds.iterator().next();
		
		//once you get child window id ,you can move your control from Home Window to child window 
		
		driver.switchTo().window(childWinId);
		
		System.out.println("App current Url :  "+getCurrentUrlOfApplication());
		
		System.out.println("App current Title :  "+getCurrentTitleOfApplication());
		
		// now,if you want to perform any operation on Home window ,dn move to home window
		
		driver.switchTo().window(homeWinId);
		
	     System.out.println("Home page current Url : "+getCurrentUrlOfApplication());
		
		System.out.println("Home page current Title : "+getCurrentTitleOfApplication());
		
		//if you want to close all the window opened by WebDriver dn use 
		
		driver.quit();
		
		
		
	}
}


