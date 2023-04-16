package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpages.AddNewPIMPage;
import webpages.JobDetailsPage;
import webpages.OrangeHRM_DashboardPage;
import webpages.OrangeHRM_LoginPage;
import webpages.PIMDetailsPage;
import webpages.PIM_HomePage;

public class TestOrangeHRMLoginLogout extends SeleniumUtility {
	WebDriver driver;
	OrangeHRM_LoginPage getOrangeHRM_LoginPage;
	OrangeHRM_DashboardPage getOrangeHRM_DashboardPage;
	AddNewPIMPage getOrangeHRM_AddNewPage;
	PIM_HomePage getOrangeHRM_PIM_HomePage;
	
	PIMDetailsPage  getOrangeHRM_PIMDetailsPage;
//	JobDetailsPage  getOrangeHRM_JobDetailsPage;
	@BeforeTest
	public void precondition() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		// initialize your required WebPage class
		getOrangeHRM_LoginPage = new OrangeHRM_LoginPage(driver);
		getOrangeHRM_DashboardPage = new OrangeHRM_DashboardPage(driver);
		 getOrangeHRM_AddNewPage=new AddNewPIMPage(driver);
		 
		 getOrangeHRM_PIM_HomePage=new PIM_HomePage(driver);
		 
		 getOrangeHRM_PIMDetailsPage=new PIMDetailsPage(driver);
		 
		// getOrangeHRM_JobDetailsPage=new JobDetailsPage(driver);
	}

	@Test(priority=1)
	public void testLoginLogout() {
		getOrangeHRM_LoginPage.loginInOrangeHrmApplication("Admin", "admin123");
		String expectedHomeUrl="dashboard";
		String actualHomeUrl=getCurrentUrlOfApplication();
		Assert.assertTrue(actualHomeUrl.contains(expectedHomeUrl),"Home page not opened");
	}
	
	@Test(priority=2,timeOut=1000)
	
	public void addNewEmployee() {
		 getOrangeHRM_AddNewPage.addEmployee("xyz", "dy", "002");
		
	}
	
   @Test(priority=3)
	
	public void pimHomeEmpInfo() throws InterruptedException {
	   getOrangeHRM_PIM_HomePage.homeOp("0258002");
	   getOrangeHRM_PIM_HomePage.editOp();
	   
		
	}
   @Test(priority=4)
	
  	public void editDeleteEmpdetails() throws InterruptedException {
	   
	   
  		 getOrangeHRM_PIMDetailsPage.nameinfo("vish");
  		 
  		 getOrangeHRM_PIM_HomePage.homeOp("0258002");
  		 
  		 getOrangeHRM_PIM_HomePage.deleteOp();
  
 	}
   

	
//	@AfterTest
//	public void postCondition() {
//		getOrangeHRM_DashboardPage.logoutFromApplication();
//		cleanUp();
//	}
//	
	
	
}
