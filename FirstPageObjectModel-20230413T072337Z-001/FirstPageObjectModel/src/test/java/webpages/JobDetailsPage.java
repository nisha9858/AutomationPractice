package webpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class JobDetailsPage extends SeleniumUtility{
	
	public JobDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='oxd-select-text--after']//i")
	private WebElement jobTitleField;
	

	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveButton;

	
	public void jobInfo(String jobtitle) {
		
		clickOnElement(jobTitleField);
		typeInput(jobTitleField,jobtitle);
	
		clickOnElement(saveButton);
		
		
		
	}
}
