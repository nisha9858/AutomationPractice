package webpages3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ActiTimeTaskPage extends SeleniumUtility{
	
	public ActiTimeTaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskField;
	
	@FindBy(xpath="//div[@class='addNewButton']/div[3]")
	private WebElement addNewtaskField;
	
	@FindBy(xpath="//div[@class='item createNewTasks']")
	private WebElement newTaskSelection;
	

	public void taskSelection() {
		
		clickOnElement(taskField);
		
		clickOnElement(addNewtaskField);
		clickOnElement(newTaskSelection);
	}
	

}



