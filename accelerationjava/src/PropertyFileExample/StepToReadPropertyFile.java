package PropertyFileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StepToReadPropertyFile {
	
	public static void main(String[] args) throws IOException  {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Welcome\\eclipse-workspace\\accelerationjava\\src\\PropertyFile\\AppData.properties");
		
				
				Properties prop=new Properties();
		                                                                                                                                          
		           prop.load(fis);
		           
		           System.out.println(prop.getProperty("applicationUrl"));
		           
		           System.out.println(prop.getProperty("username"));
		           
		           System.out.println(prop.getProperty("password"));
		  
		 
		
	}

}


/*
 1. First find the location where you have stored property file
  2. Create an instance of FileInputStream class and pass the property file location to its constructor.
  3. Create an instance of Properties class
  4. With the help of properties reference variable call load() properties class and pass FileInputStream class reference to this method
	   5. Call get(key) of Properties class to read data from property file
*/
/*Property file location with 
* absolute path: F:\JavaWorkspace\CoreJavaSessions\PropertyFiles\TestData.properties
* relative path: .\PropertyFiles\TestData.properties
* Using System class:
* 			String currentDir=System.getProperty("user.dir");
* 			String propertyFileLocation =currentDir+"\\PropertyFiles\\TestData.properties";
*/