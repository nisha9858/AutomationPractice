package testngexample;

import org.testng.annotations.Test;

public class ActiTimeInvocationCount {
	
	

	@Test(enabled=true,invocationCount=6)

	public void openBrowserAndAppURL() throws InterruptedException {
		
		Thread.sleep(1800);

		System.out.println("Open browser and enter URL");
	}


}
