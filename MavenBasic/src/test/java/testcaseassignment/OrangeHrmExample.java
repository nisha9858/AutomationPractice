package testcaseassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class OrangeHrmExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = SeleniumUtility.setUp("chrome",
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".oxd-button")).click();

		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[2]//a")).click();

		driver.findElement(By.xpath(" //div[@class='orangehrm-header-container']//button")).click();

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ovi");

		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kurangle");

		driver.findElement(By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[2]//input"))
				.sendKeys("2345");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[2]//a")).click();

		driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]//div[2]//input")).sendKeys("02962345");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//div[@class='oxd-table-body']//div//div[@class='oxd-table-cell oxd-padding-cell']//div//label//span//i"))
				.click();
		driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']//button[2]//i")).click();

		driver.findElement(By.xpath("//div[@class='orangehrm-tabs']//div[6]//a")).click();

		driver.findElement(By.xpath("//div[text()='-- Select --']")).click();
		driver.findElement(By.xpath("//div[text()='-- Select --']")).sendKeys("QA Lead");
		driver.findElement(By.xpath(
				"//button[@type='submit']"))
				.click();
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[2]//a")).click();

		driver.findElement(By.xpath("//div[2][@class='oxd-grid-item oxd-grid-item--gutters']//input"))
				.sendKeys("02962345");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By
				.xpath("//div[@class='oxd-table-header-cell oxd-padding-cell oxd-table-th' and @role='columnheader']"))
				.click();

		driver.findElement(By.xpath(
				"//div[@class='oxd-table-cell-actions']/button"))
				.click();
		driver.findElement(By.xpath("//div[@class='orangehrm-modal-footer']/button[2]/i")).click();

		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[2]//a")).click();

	}
}