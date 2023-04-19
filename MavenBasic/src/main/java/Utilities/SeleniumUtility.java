package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {

	public static WebDriver driver;

	public static WebDriverWait wait;
	public static Properties prop;
	
	public static Actions act ;

      public static  WebDriver setUp(String browserName, String appUrl) {

		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		// define Webdriver wait

		wait = new WebDriverWait(driver, 20);

		driver.get(appUrl);

		act=new Actions(driver);
	
		return driver;
	}

	public static void typeInput(WebElement element, String input) {
		waitUntilElementIsVisible(element);

		element.clear();

		element.sendKeys(input);

	}

	public static void clickOnElement(WebElement element) {
		waitUntilElementClickable(element);
		element.click();
	}

	public static void waitUntilElementClickable(WebElement element) {

		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitUntilTextToBeMatched(By element, String text) {

		wait.until(ExpectedConditions.textToBe(element, text));
	}

	public static void waitUntilPageTitleMatched(String title) {

		wait.until(ExpectedConditions.titleIs(title));
	}

	public static void waitUntilElementIsVisible(WebElement element) {

		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public  static void loadPropertyFile(String filePath) {

		FileInputStream fis;
		try {
			fis = new FileInputStream(filePath);

			prop = new Properties();

			prop.load(fis);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static  String getDataFromPropertyFile(String Key) {

		return prop.getProperty(Key);
	}

	public String  getCurrentTitleOfApplication(String title) {
		
		wait.until(ExpectedConditions.titleIs(title));
		
		return driver.getTitle();
	}
	
     public String getCurrentTitleOfApplication() {
    	
	return driver.getTitle();
	}
     
     public String getCurrentUrlOfApplication() {
 		
    		return driver.getCurrentUrl();
    		}
	
	public String getAttributeForElement(WebElement element,String attributeName) {
		
		waitUntilElementIsVisible(element);
		return element.getAttribute(attributeName);
	}
      public String getTextForElement(WebElement element) {
		
		waitUntilElementIsVisible(element);
		return element.getText();
	}
      public Select getDropdown(WebElement element) {
    	  
    	  waitUntilElementIsVisible(element);
    	  
    	  return new Select(element);
    	   }
      
      public String getTextFromDropdown(Select select) {
    	  
    
    	   return  select.getFirstSelectedOption().getText();
}  
      
	public void mouseHoverOverInTheElement(Actions act,WebElement element) {
		
		act.moveToElement(element).perform();
	}
	
	public void rightClick(Actions action,WebElement option) {
		
		
		action.moveToElement(option).contextClick().build().perform();
	}
	
	public void mousehoverWithCords(Actions act ,WebElement option,int x,int y) {
		
		
		act.moveToElement(option,x,y).perform();
	}
	

    public void performDragAndDrop(Actions act,WebElement src,WebElement target) {
    	
    	 waitUntilElementIsVisible(src);
    	 
    	 waitUntilElementIsVisible(target);
	
	act.dragAndDrop(src, target).build().perform();
}
     public void copyTextFromElement(WebElement element) {
    	
    	act.doubleClick(element).sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
    	
    	
    }
    
    public void pasteCopiedTextIntoElement(WebElement element) {
    	
    	act.moveToElement(element).sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
    	
    	  }
      public void copyPasteText(WebElement CopyFrom,WebElement CopyTo) {
    	
    	  copyTextFromElement(CopyFrom);
    	  pasteCopiedTextIntoElement(CopyTo);
    	
    	  }
      
      public WebElement getActiveElementFromUI() {
    	  
    	  return driver.switchTo().activeElement();
  		
  		}
      public void cleanUp() {
    	  
    	  driver.close();
      }
    
 }
