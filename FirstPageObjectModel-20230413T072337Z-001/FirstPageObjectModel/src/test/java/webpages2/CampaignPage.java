package webpages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class CampaignPage extends SeleniumUtility {

	public CampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#Campaigns_listView_basicAction_LBL_ADD_RECORD>div")
	private WebElement addField;

	@FindBy(xpath = "//p[@title='All']//a")
	private WebElement allLinkField;

	@FindBy(xpath = "//button[@id='Campaigns_listView_massAction_LBL_EDIT']//i")
	private WebElement editField;

	@FindBy(css = "#Campaigns_listView_massAction_LBL_DELETE")
	private WebElement deleteField;

	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement confirmDeleteField;

	public void addcampaign() {

		clickOnElement(addField);

	}

	public void allLink() {

		clickOnElement(allLinkField);

	}

	public void editOp() {

		clickOnElement(editField);

	}

	public void deleteOp() {

		clickOnElement(deleteField);

		clickOnElement(confirmDeleteField);

	}

}
