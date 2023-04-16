package webpages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerLoginPage extends SeleniumUtility {

	public VtigerLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")

	private WebElement usernameField;

	@FindBy(id = "password")

	private WebElement passwordField;

	@FindBy(className = "button")

	private WebElement loginButton;

	public void loginInVtigerApplication(String username, String password) {
		typeInput(usernameField, username);
		typeInput(passwordField, password);
		clickOnElement(loginButton);

	}

}
