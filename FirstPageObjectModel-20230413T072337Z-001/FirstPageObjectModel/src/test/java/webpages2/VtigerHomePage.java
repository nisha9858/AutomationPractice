package webpages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerHomePage extends SeleniumUtility {

	public VtigerHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='appnavigator']//div[@class='row app-navigator']")
	private WebElement navigationField;

	@FindBy(xpath = "//div[@class='menu-item app-item dropdown-toggle app-item-color-MARKETING']//div[1]//span[2]")
	private WebElement marketingField;

	@FindBy(xpath = "//a[@title='Campaigns']//span[2]")
	private WebElement campaignField;

	public void homeOp() {

		clickOnElement(navigationField);
		clickOnElement(marketingField);
		clickOnElement(campaignField);

	}

}
