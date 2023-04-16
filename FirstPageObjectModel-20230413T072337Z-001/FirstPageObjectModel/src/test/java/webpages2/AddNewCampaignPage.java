package webpages2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class AddNewCampaignPage  extends SeleniumUtility {

		public AddNewCampaignPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		@FindBy(css = "#Campaigns_editView_fieldName_campaignname")
		private WebElement campaignNameField;

		@FindBy(css = "#s2id_autogen1")
		private WebElement assignedToField;

		@FindBy(css = "#s2id_autogen2_search")
		private WebElement searchassignedToField;

		@FindBy(xpath = "//ul[@class='select2-result-sub']/li/div/span")
		private WebElement clickassignedToField;

		@FindBy(css = "#Campaigns_editView_fieldName_closingdate")
		private WebElement clickField;

		@FindBy(xpath = "//div[@class='datepicker-days']/table/tbody/tr[4]/td[3]")
		private WebElement dateField;

		@FindBy(xpath = "//button[@type='submit']")
		private WebElement saveButton;


		public void campaignDetails(String campaignname,String assignee) throws InterruptedException {
			typeInput(campaignNameField, campaignname);

			clickOnElement(assignedToField);
		     typeInput(searchassignedToField, assignee);
		     Thread.sleep(1500);
			clickOnElement(clickassignedToField);
			clickOnElement(clickField);
			clickOnElement(dateField);
			clickOnElement(saveButton);
	}
	}


