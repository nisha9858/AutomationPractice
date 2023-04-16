package webpages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerDeleteCampaign extends SeleniumUtility {
	public VtigerDeleteCampaign(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//tr[@class='listViewEntries']/td/div/span/input")
	private WebElement checkboxButton;

	@FindBy(css = "#Campaigns_listView_massAction_LBL_DELETE")
	private WebElement deleteField;

	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement confirmDeleteField;

	public void deleteOp() throws InterruptedException {
		Thread.sleep(3000);
		clickOnElement(checkboxButton);
		clickOnElement(deleteField);
		clickOnElement(confirmDeleteField);
	}

}
