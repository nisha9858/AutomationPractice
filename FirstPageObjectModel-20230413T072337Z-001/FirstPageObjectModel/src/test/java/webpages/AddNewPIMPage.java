package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class AddNewPIMPage extends SeleniumUtility {

	public AddNewPIMPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='oxd-main-menu']//li[2]//a")
	private WebElement PIMField;

	@FindBy(xpath = "//div[@class='orangehrm-header-container']//button")
	private WebElement addButton;

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement FirstNameField;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastNameField;

	@FindBy(xpath = "//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[2]//input")
	private WebElement empIdField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;

	public void addEmployee(String firstname, String lastname, String Id) {
		clickOnElement(PIMField);

		clickOnElement(addButton);
		typeInput(FirstNameField, firstname);
		typeInput(lastNameField, lastname);

		typeInput(empIdField, Id);
		clickOnElement(saveButton);
	}

}
