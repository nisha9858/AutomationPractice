package testngexample;

import org.testng.annotations.Test;

public class ActiTimeTimeOut {
	

	@Test(priority = 1,enabled=true,timeOut=2000)

	public void openBrowserAndAppURL() throws InterruptedException {
		
		Thread.sleep(1800);

		System.out.println("Open browser and enter URL");
	}

}
