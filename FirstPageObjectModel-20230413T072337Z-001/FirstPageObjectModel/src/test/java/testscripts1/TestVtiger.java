package testscripts1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpages2.AddNewCampaignPage;
import webpages2.CampaignDetailspage;
import webpages2.CampaignPage;
import webpages2.VtigerDashboard;
import webpages2.VtigerDeleteCampaign;
import webpages2.VtigerHomePage;
import webpages2.VtigerLoginPage;

public class TestVtiger  extends SeleniumUtility {
	WebDriver driver;
	VtigerLoginPage getVtigerLoginPage;
	VtigerDashboard getVtigerDashboard;
	
	VtigerHomePage getVtigerHomePage;
	CampaignPage getCampaignPage;
	AddNewCampaignPage getAddNewCampaignPage;
	CampaignDetailspage getCampaignDetailspage;
	VtigerDeleteCampaign  getVtigerDeleteCampaign;
	@BeforeTest
	public void precondition() {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		// initialize your required WebPage class
		getVtigerLoginPage = new VtigerLoginPage(driver);
		getVtigerDashboard = new VtigerDashboard(driver);
		
		getVtigerHomePage=new VtigerHomePage(driver);
		getCampaignPage =new CampaignPage(driver);
		getAddNewCampaignPage=new AddNewCampaignPage(driver);
		
		getCampaignDetailspage=new CampaignDetailspage(driver);
		
		getVtigerDeleteCampaign=new VtigerDeleteCampaign(driver);
	}

	@Test(priority=1)
	public void testLoginLogout() {
		getVtigerLoginPage.loginInVtigerApplication("admin", "Test@123");
		String expectedHomeTitle="Dashboard";
		String actualHomeTitle=getCurrentTitleOfApplication();
		Assert.assertTrue(actualHomeTitle.equals(expectedHomeTitle),"Home page not opened");
	}
	
	
	@Test(priority=2)
	public void vtigerHome() {
		getVtigerHomePage.homeOp();
	}
	
	@Test(priority=3)
	public void addDetails() {
		getCampaignPage.addcampaign();
	}
	
	@Test(priority=4)
	public void addNewCampaignDetails() throws InterruptedException {
		getAddNewCampaignPage.campaignDetails("Eyedonation","Atlas Jeniffer");
		getCampaignPage.allLink();
		
		
	}
	
	
	@Test(priority=5)
	public void CampaignEditDeleteDetails() throws InterruptedException {
		getCampaignDetailspage.editdeleteOp("Being Human", "student");
		
		
		
	}
	
	@Test(priority = 6)
	public void delete() throws InterruptedException {
		getVtigerDeleteCampaign.deleteOp();
	}
	
}
//	@AfterTest
//	public void postCondition() {
//		getVtigerDashboard.logoutFromApplication();
//		cleanUp();
//
//	}
