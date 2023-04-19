package windowHandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.SeleniumUtility;

public class ErailExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=SeleniumUtility.setUp("chrome","https://erail.in/");
		
		String homePageWin = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='eCatering']")).click();
		
		
		Set<String> allWin = driver.getWindowHandles();
		allWin.remove(homePageWin);
		Iterator<String> itr = allWin.iterator();
		String childWin = itr.next();
		driver.switchTo().window(childWin);
		driver.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']")).click();
		WebElement trainNumber = driver.findElement(By.xpath("//input[@class='form-input pl-12  text-sm']"));
		trainNumber.sendKeys("12627");
		trainNumber.click();
		driver.findElement(By.xpath("//div[@class='top-109px absolute h-full overflow-y-auto']//button")).click();
//	    WebElement date=	driver.findElement(By.xpath("//input[@placeholder='Boarding Date']"));//for date
//	    date.sendKeys(Keys.PAGE_DOWN);
		WebElement date = driver
				.findElement(By.xpath("//input[@class='form-input custom-date-picker h-11.5 pl-12 text-sm']"));
		date.click();
		date.sendKeys(Keys.PAGE_DOWN);
		date.sendKeys(Keys.TAB);
		date.click();
		driver.findElement(By.xpath("//div[2][@class='relative mb-6']/select/option[28]")).click();
		driver.findElement(By.xpath("//button[text()='FIND FOOD']")).click();
		List<WebElement> restaurantName = driver
				.findElements(By.xpath("//div[@class='flex flex-wrap items-center mb-2 ']/h5"));
		System.out.println("Restarant count:" + restaurantName.size());
		for (int i = 0; i < restaurantName.size(); i++) {
			//WebElement restarantlist = restaurantName.get(i);
			//System.out.println("RestarantList:" + restarantlist.getText());
			System.out.println("RestarantList:" + restaurantName.get(i).getText());
		}
		   driver.switchTo().window(homePageWin);
		
           WebElement From= driver.findElement(By.xpath("//input[@placeholder='From Station']"));
           
           From .clear();
           
           From.sendKeys("Pune");
           driver.findElement(By.xpath("//div[@class='selected']//div//strong")).click();
	
          WebElement To= driver.findElement(By.xpath("//input[@placeholder='To Station']"));
           
           To .clear();
           
           To.sendKeys("Bangalore Cant");
           driver.findElement(By.xpath("//div[@title='Bangalore Cant']")).click();
	
            driver.findElement(By.xpath("//input[@title='Select Departure date for availability']"))
	            .click();
	            
	            WebElement Date= driver.findElement(By.xpath("//a[@class='icon-right-big']"));
	            
	            for(int i=0;i<3;i++) {
	            	
	            	Date.sendKeys(Keys.chord(Keys.TAB,Keys.ENTER));
	            	Date.click();
	          
	            }
	            driver.findElement(By.xpath("//input[@value='Get Trains']")).click();
	        	List<WebElement>TrainName=driver.findElements(By.xpath("//div[@id='divTrainsList']//tr[2]//td[2]/a"));
	            
	        	System.out.println("Train cOUNT  :  "+TrainName.size());
	        	
	        	for(int i=0;i<TrainName.size();i++) {
	        		
	        		
	        		System.out.println("Train available  :  "+TrainName.get(i).getText());
	        		
	        	}
	            
	            
	            }
	            
	}

		
		


	


