package webpages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerDashboard extends SeleniumUtility {

	public VtigerDashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='userName dropdown-toggle pull-right']")
	private WebElement userProfile;

	@FindBy(css = "#menubar_item_right_LBL_SIGN_OUT")
	private WebElement logoutLink;

	public void logoutFromApplication() {
		clickOnElement(userProfile);
		clickOnElement(logoutLink);
	}
}
