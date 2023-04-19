package BrokenLinkExample;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilities.SeleniumUtility;

public class Example1 extends SeleniumUtility {
	
	@Test
	
	public void testLinks() {
		
		
		setUp("chrome","https://demoqa.com/broken");
		//storing links in a list
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		//no of links and count of links
		
		System.out.println("No of links are : "+links.size());
		
		
		for(int i=0;i<links.size();i++) {
			
			WebElement E1=links.get(i);
			
			String url=E1.getAttribute("href");
			
			verifyLinks(url);
			
			
		}
		
		driver.quit();
	}
	
	public static void verifyLinks(String linkUrl) {
		
		try {
			
			URL url=new URL(linkUrl);
			
			HttpURLConnection httpURLConnect=(HttpURLConnection)
					
					url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			
			httpURLConnect.connect();
			
			if(httpURLConnect.getResponseCode()>=400) {
				
				System.out.println(linkUrl +" - "+httpURLConnect.getResponseMessage()+"is a broken link ");
			}
			
			else {
				
				System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
			}
		}
			catch(Exception e) {
			
		}
	}
	
	
	
	

}
