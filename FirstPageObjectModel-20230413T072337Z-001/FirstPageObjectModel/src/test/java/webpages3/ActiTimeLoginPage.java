package webpages3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ActiTimeLoginPage extends SeleniumUtility{
	
	public ActiTimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement usernameInputField;
	
	@FindBy(name="pwd")
	private WebElement passwordInputField;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	//TODO: if you need individual object in your script dn create getter method for your private WebElement
	
	public void loginInActiTimeApplication(String username,String password) {
		typeInput(usernameInputField, username);
		typeInput(passwordInputField, password);
		clickOnElement(loginButton);
	}
}



