package retryfailedtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 {
	
	static int num=6;
	
	
	@Test(retryAnalyzer=retryfailedtestcases.RetryAnalyzer.class)
	
	public void test1() {
		
		Assert.assertEquals(false, true);
	}
	
	
	@Test(retryAnalyzer=retryfailedtestcases.RetryAnalyzer.class)
	
	public void test2() {
		
		Assert.assertEquals(false, true);
		
	}
	
	@Test(retryAnalyzer=retryfailedtestcases.RetryAnalyzer.class)
	
	public void test3() {
		num--;
	Assert.assertTrue(num<4)	;
		
	}

}
