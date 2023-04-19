package testngexample;

import org.testng.annotations.Test;

public class ActiTimeExceptionAndTimeout {
	
	@Test(expectedExceptions=ArithmeticException.class)
	
	public void divideByZeroExample1() {
		
		System.out.println("Exception Test");
		
		int e=1/0;
		
		System.out.println("Exception handling Done");
	}
	
	@Test(timeOut=1000)
	
	public void executetimeOut() throws InterruptedException {
		
		//Thread.sleep(3000);
	}
	

}
