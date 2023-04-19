package switchstatements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class Assignment1 {

public static void main(String[] args) throws InterruptedException  {
		

	WebDriver driver=SeleniumUtility.setUp("chrome","https://jqueryui.com/");
	
	driver.findElement(By.xpath("//a[text()='Sortable']")).click();
	
	WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
	
	driver.switchTo().frame(0);
	
   Actions act=new Actions (driver);

	WebElement drag1=driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));
	WebElement drag2=driver.findElement(By.xpath("//ul[@id='sortable']/li[2]"));
	WebElement drag3=driver.findElement(By.xpath("//ul[@id='sortable']/li[3]"));
	WebElement drag4=driver.findElement(By.xpath("//ul[@id='sortable']/li[4]"));
	WebElement drag5=driver.findElement(By.xpath("//ul[@id='sortable']/li[5]"));
    WebElement drag6=driver.findElement(By.xpath("//ul[@id='sortable']/li[6]"));
	WebElement drag7=driver.findElement(By.xpath("//ul[@id='sortable']/li[7]"));
act.dragAndDrop(drag7, drag1).build().perform(); 
Thread.sleep(1000);
act.dragAndDrop(drag6, drag1).build().perform();
Thread.sleep(1000);
act.dragAndDrop(drag5, drag1).build().perform();
Thread.sleep(1000);
act.dragAndDrop(drag4, drag1).build().perform();
Thread.sleep(1000);
act.dragAndDrop(drag3, drag1).build().perform();
Thread.sleep(1000);
act.dragAndDrop(drag2, drag1).build().perform();
Thread.sleep(1000);
//SeleniumUtility.driver.close();
	
}

}
