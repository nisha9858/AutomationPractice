package webpages3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ActitimeCreateNewTaskPage extends SeleniumUtility{
	public ActitimeCreateNewTaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="div[class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']>div>div>:nth-child(3)")
	private WebElement customerfield;
	
	@FindBy(xpath="//div[@class='searchItemList']/div[4]")
	private WebElement customerdropdownfield;
	
	
	@FindBy(css="div[class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer']>div>div>:nth-child(3)")
	private WebElement projectfield;
	
	@FindBy(xpath="//div[@class='searchItemList']/div[text()='Android testing']")
	private WebElement projectdropdownfield;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder']")
	private WebElement taskNameField;
	
	@FindBy(xpath="//td[@class='billingTypeCell']/div[2]/div")
	private WebElement typeOfWorkField;
	
	
    @FindBy(xpath="//td[@class='billingTypeCell']//div[@class='typeOfWorkButton editable']")
	private WebElement typeOfWorkselectionField;
	
	@FindBy(xpath="//div[@class='components_button withPlusIcon']")
	private WebElement createtaskField;
	
	
	public void customerSelection(String taskname) throws InterruptedException {
		clickOnElement(customerfield);
		clickOnElement(customerdropdownfield);
		clickOnElement(projectfield);
		clickOnElement(projectdropdownfield);
		typeInput(taskNameField, taskname);
		Thread.sleep(1000);
		clickOnElement(typeOfWorkField);
		Thread.sleep(3000);
		clickOnElement(typeOfWorkselectionField);
		Thread.sleep(2000);
		clickOnElement(createtaskField);
	}
}
