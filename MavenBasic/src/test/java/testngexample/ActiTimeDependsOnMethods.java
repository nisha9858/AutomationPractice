package testngexample;

import org.testng.annotations.Test;

public class ActiTimeDependsOnMethods {
	
	
	@Test(enabled=true)

	public void openBrowserAndAppURL() {
	
		

		System.out.println("Open browser and enter URL");
	}

	@Test(enabled=true,dependsOnMethods="openBrowserAndAppUR")

	public void login() {

		System.out.println("Enter Username password and click on login button");
	}

	@Test(enabled=true)

	public void createTask() {

		System.out.println("create new task");
	}

	@Test(enabled=true)

	public void logoutClose() {

		System.out.println("logout from the applicatgion and close the browser");
	}

}
