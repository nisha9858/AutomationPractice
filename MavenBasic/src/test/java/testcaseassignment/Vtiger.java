package testcaseassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtility;

public class Vtiger {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=SeleniumUtility.setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
		
		
        driver.findElement(By.id("username")).clear();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.id("password")).clear();
		
		driver.findElement(By.id("password")).sendKeys("Test@123");
		
		driver.findElement(By.className("button")).click();
		
		driver.findElement(By.xpath("//div[@id='appnavigator']//div[@class='row app-navigator']")).click();
		
		driver.findElement(By.xpath("//div[@class='menu-item app-item dropdown-toggle app-item-color-MARKETING']//div[1]//span[2]")).click();
		
		driver.findElement(By.xpath("//a[@title='Campaigns']//span[2]")).click();
		
		driver.findElement(By.cssSelector("#Campaigns_listView_basicAction_LBL_ADD_RECORD>div")).click();
		
		driver.findElement(By.xpath("//tbody//tr//td[2]//input[@class='inputElement nameField']")).sendKeys("BloodDonation");
		
		driver.findElement(By.xpath("//tr//td[4]//div//a//span"));
		
     //  driver.findElement(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-unselectable select2-result-with-children']//ul//span")).sendKeys("Atlas Jeniffer");
		  
		driver.findElement(By.xpath("//span[@class='input-group-addon']//i")).click();
		
		driver.findElement(By.xpath("//div[@class='datepicker-days']//tbody//tr[3]//td[4]")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//p[@title='All']//a")).click();
		
		driver.findElement(By.xpath("//tr[@class='listViewEntries']//span//input")).click();
		
		driver.findElement(By.xpath("//button[@id='Campaigns_listView_massAction_LBL_EDIT']//i")).click();
		
		driver.findElement(By.cssSelector("#Campaigns_editView_fieldName_sponsor")).sendKeys("BeingHuman");
		
	
		driver.findElement(By.cssSelector("#Campaigns_editView_fieldName_expectedsalescount")).sendKeys("12345");
		
		driver.findElement(By.xpath("//button[@class='btn btn-success saveButton']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".table-actions>span>.listViewEntriesCheckBox")).click();
		
		driver.findElement(By.cssSelector("#Campaigns_listView_massAction_LBL_DELETE")).click();
		
	
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		
	}

}
