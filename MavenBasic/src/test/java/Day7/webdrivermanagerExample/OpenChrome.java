package Day7.webdrivermanagerExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChrome {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		 WebDriverManager.chromedriver().setup();
		 
		 
		 driver=new ChromeDriver();
		 
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			driver.get("https:\\www.google.com");
		

	}
	
//public static void setUp(String browserName,String appUrl) {
//		
//		
//		
//		if(browserName.equalsIgnoreCase("chrome")) {
//		
//	        WebDriverManager.chromedriver().setup();
//		
//                 driver=new ChromeDriver();
//		
//		}else if (browserName.equalsIgnoreCase("firefox")) {
//			
//			
//			 WebDriverManager.firefoxdriver().setup();
//		
//			
//			 driver=new FirefoxDriver();
//		}
//		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		driver.manage().window().maximize();
//		
//		driver.get(appUrl);
//
//}

}
