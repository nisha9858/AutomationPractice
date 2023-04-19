package testngexample;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.SeleniumUtility;

public class GoogleAppWithBeforeAfterTest extends SeleniumUtility {
	
	
	WebDriver driver;
	@BeforeTest
	public void startUp() {
		driver = setUp("chrome", "https://www.google.com/");
	}
	@Test
	public void testGoogleLandingPage() {
		String expectedTitle = "Google";
		String actualTitle = getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle, "Google Search page not opened or its title got changed");
	}
	@Test
	public void testSearch() {
		  getActiveElementFromUI().sendKeys("SQL", Keys.ENTER);
		Assert.assertTrue(getCurrentTitleOfApplication().contains("SQL"), "SQL search is failed");
	}
	
	
	
	@AfterTest
	public void tearDown() {
		cleanUp();
	}

}
