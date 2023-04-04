package PropertyFileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StepToReadPropertyFile2 {
	
	public static void main(String[] args) throws IOException {
		
		String CurrentDir=System.getProperty("user.dir");
		
		String FilePath=(CurrentDir+"\\PropertyFile\\AppData.properties");

		FileInputStream fis=new FileInputStream(FilePath);
		
				
				Properties prop=new Properties();
		                                                                                                                                          
		           prop.load(fis);
		           
		           System.out.println(prop.getProperty("applicationUrl"));
		           
		           System.out.println(prop.getProperty("username"));
		           
		           System.out.println(prop.getProperty("password"));
		  
		
	}
}
	
	
		
	
