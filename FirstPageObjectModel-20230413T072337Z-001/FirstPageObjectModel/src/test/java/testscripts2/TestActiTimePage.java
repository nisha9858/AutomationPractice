package testscripts2;

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
import webpages3.ActiTimeHomePage;
import webpages3.ActiTimeLoginPage;
import webpages3.ActiTimeTaskPage;
import webpages3.ActitimeCreateNewTaskPage;
import webpages3.ActitimeDeleteTaskPage;

public class TestActiTimePage  extends SeleniumUtility {
		WebDriver driver;
		ActiTimeLoginPage getActiTimeLoginPage;
		ActiTimeHomePage getActiTimeHomePage;
		
		ActiTimeTaskPage getActiTimeTaskPage;
		ActitimeCreateNewTaskPage  getActitimeCreateNewTaskPage;
		
		ActitimeDeleteTaskPage   getActitimeDeleteTaskPage;
		@BeforeTest
		public void precondition() {
			driver = setUp("chrome", "https://demo.actitime.com/login.do");
			// initialize your required WebPage class
			getActiTimeLoginPage = new ActiTimeLoginPage(driver);
			
			
			getActiTimeHomePage=new ActiTimeHomePage(driver);
			
			getActiTimeTaskPage=new ActiTimeTaskPage(driver);
			
			getActitimeCreateNewTaskPage=new ActitimeCreateNewTaskPage(driver);
			
			getActitimeDeleteTaskPage =new ActitimeDeleteTaskPage(driver);
		}

		@Test(priority=1)
		public void testLogin() throws InterruptedException {
			getActiTimeLoginPage.loginInActiTimeApplication("admin", "manager");
			String expectedHomeUrl="https://demo.actitime.com/user/submit_tt.do";
			Thread.sleep(2000);
			String actualHomeUrl=getCurrentUrlOfApplication();
			Assert.assertTrue(actualHomeUrl.equals(expectedHomeUrl),"Home page not opened");
		}
		
		@Test(priority=2)
		public void taskPage() {
			
			getActiTimeTaskPage.taskSelection();
			
			
		}
		
		@Test(priority = 3)
		public void testCustomerProjectField() throws InterruptedException {
			getActitimeCreateNewTaskPage.customerSelection("txyz");
		}
		
		@Test(priority = 4)
		public void testDeleteTaskField() throws InterruptedException {
			getActitimeDeleteTaskPage.deleteOp();
			
		}
		
		
		
		
		@AfterTest
		public void postCondition() {
			getActiTimeHomePage.logOut();
		cleanUp();
		
		}
}
