package webpages3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ActiTimeHomePage extends SeleniumUtility{
	
	public ActiTimeHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logOutField;
	
	
	public void logOut() {
		
		clickOnElement(logOutField);
	}
	
	

}
