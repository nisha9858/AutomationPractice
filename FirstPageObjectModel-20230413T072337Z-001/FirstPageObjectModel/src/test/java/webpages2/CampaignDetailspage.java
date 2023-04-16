package webpages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class CampaignDetailspage extends SeleniumUtility {

	public CampaignDetailspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//tr[@class='listViewEntries']//span//input")
	private WebElement checkboxField;

	@FindBy(xpath = "//button[@id='Campaigns_listView_massAction_LBL_EDIT']//i")
	private WebElement editField;

	@FindBy(css = "#Campaigns_editView_fieldName_sponsor")
	private WebElement sponsorField;

	@FindBy(css = "#Campaigns_editView_fieldName_targetaudience")
	private WebElement targetAudianceField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;

	public void editdeleteOp(String sponsor, String audience) throws InterruptedException {

		Thread.sleep(1500);
		clickOnElement(checkboxField);

		clickOnElement(editField);

		typeInput(sponsorField, sponsor);

		typeInput(targetAudianceField, audience);

		clickOnElement(saveButton);
	}

}
