package screenshotexample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtility;

public class GetScreenShotOfFlipkart {
	
	
public static void main(String[] args) throws IOException {
		
		WebDriver driver=SeleniumUtility.setUp("chrome","https://www.flipkart.com/");
		
		
		//type cast WebDriver instance into TakeScreenshot interface
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//get screenshot using getScreenShotAs() of TakesScreenshot interface
		
		File file=ts.getScreenshotAs(OutputType.FILE);
		
		//store above screenshot into required location
		
		FileUtils.copyFile(file,new File(".\\screenshots\\flipkart.jpg"));
		

}
}



