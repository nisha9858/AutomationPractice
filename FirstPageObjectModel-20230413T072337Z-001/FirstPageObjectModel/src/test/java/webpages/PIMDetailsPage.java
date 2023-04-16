package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class PIMDetailsPage extends SeleniumUtility{
	
	public PIMDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="middleName")
	private WebElement middleNameField;
	
	@FindBy(xpath="//button[@type='submit']")
	
	private WebElement saveButton;

	
	public void nameinfo(String name) throws InterruptedException {
		
		typeInput(middleNameField,name);
		Thread.sleep(2000);
		clickOnElement(saveButton);
		
		

	}
	
}
