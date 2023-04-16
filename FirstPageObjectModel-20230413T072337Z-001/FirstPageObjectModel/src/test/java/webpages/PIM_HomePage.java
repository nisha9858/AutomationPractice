package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class PIM_HomePage extends SeleniumUtility{
	
	public PIM_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']//li[2]//a")
	private WebElement PIMField;
	
	
	 @FindBy(xpath="//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]//div[2]//input")

     private WebElement putemployeeidField;
     
     @FindBy(xpath="//button[@type='submit']")
  	
     private WebElement searchButton;
     
     @FindBy(xpath="//div[@class='oxd-table-cell-actions']//button[2]//i")
    	
     private WebElement editField;
     
     @FindBy(xpath="//div[@class='oxd-table-cell-actions']/button")
    	
     private WebElement deleteField;
     
     @FindBy(xpath="//i[@class='oxd-icon bi-trash oxd-button-icon']")
 	
     private WebElement confirmField;
     
     public void homeOp(String EId) throws InterruptedException {  
    	 
    	 
    	 clickOnElement(PIMField);
    	 
  		typeInput(putemployeeidField,EId);
  		Thread.sleep(2000);
  		
  		clickOnElement(searchButton);
    	 
    	 
     }
     
     
     public void editOp() throws InterruptedException {
    		Thread.sleep(2000);
    	 clickOnElement(editField);
 		
 		
     }
     
     public void deleteOp() throws InterruptedException {
    	 
    		Thread.sleep(2000);
    	 clickOnElement(deleteField);
    	 
    	 clickOnElement(confirmField);
}
     }
