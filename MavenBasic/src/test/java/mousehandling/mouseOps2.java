package mousehandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class mouseOps2 {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=SeleniumUtility.setUp("chrome","https://www.globalsqa.com/demo-site/");
		
		//identify all the webeement of main menu 
		
		List<WebElement>mainMenu=driver.findElements(By.cssSelector("#menu>ul>li>a"));
		
		System.out.println("Main menu option count :  "+mainMenu.size());
		
		//create instance of Actions class
		
		Actions act=new Actions(driver);
//		
//		act.moveToElement(mainMenu.get(0)).perform();
//		
//		act.moveToElement(mainMenu.get(1)).perform();
//		
//		act.moveToElement(mainMenu.get(2)).perform();
//		
//		act.moveToElement(mainMenu.get(3)).perform();
		
//        for(int i=0;i<mainMenu.size();i++) {
//        	
//        	act.moveToElement(mainMenu.get(i)).perform();
//        }
        
        
        //mouseHover using reusable function
      //  mouseHoverOverInTheElement(act,mainMenu.get(2));
        //mouseHover(act,mainMenu)
        
        // mouseHover with cords 
        
      //  act.moveToElement(mainMenu.get(2), 100, 0);
        //mouseHover with cords using reusable function 
      //  mousehoverWithCords(act,mainMenu.get(1),100,0);
        
        //right click on required element
        
      //  act.moveToElement(mainMenu.get(1)).contextClick().build().perform();
        
        rightClick(act,mainMenu.get(1));
        
        
}
	static void mouseHover(Actions act,List<WebElement>mainMenu) {
		

        for(int i=0;i<mainMenu.size();i++) {
        	
        	WebElement option=mainMenu.get(i);
        	
        	act.moveToElement(option).perform();
        }
	}
	
	static void mouseHoverOverInTheElement(Actions act,WebElement element) {
		
		act.moveToElement(element).perform();
	}
	
	static void rightClick(Actions action,WebElement option) {
		System.out.println("Option name is :"+option.getText());
		
		action.moveToElement(option).contextClick().build().perform();
	}
	
	static void mousehoverWithCords(Actions act ,WebElement option,int x,int y) {
		
		
		System.out.println("Option name is : "+option.getText());
		
		act.moveToElement(option,x,y).perform();
	}
	
}
