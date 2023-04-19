package testngexample;

import org.testng.annotations.Test;

public class ActiTimePriority {

	@Test(priority = 1, description = "Open browser and enter URL")

	public void openBrowserAndAppURL() {

		System.out.println("Open browser and enter URL");
	}

	@Test(priority = 2)

	public void login() {

		System.out.println("Enter Username password and click on login button");
	}

	@Test(priority = 3)

	public void createTask() {

		System.out.println("create new task");
	}

	@Test(priority = 4)

	public void logoutClose() {

		System.out.println("logout from the applicatgion and close the browser");
	}

}
