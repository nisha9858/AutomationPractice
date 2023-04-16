package webpages3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ActitimeDeleteTaskPage extends SeleniumUtility {
	public ActitimeDeleteTaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//tr[@class='taskRow noLastTrackingDate']/td/div/div")
	private WebElement checkboxfield;

	@FindBy(xpath = "//div[@class='delete button']")
	private WebElement deletefield;

	@FindBy(xpath = "//span[text()='Delete permanently']")
	private WebElement deletepermantlyfield;

	public void deleteOp() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(checkboxfield);
		Thread.sleep(2000);
		clickOnElement(deletefield);

		clickOnElement(deletepermantlyfield);
	}

}
