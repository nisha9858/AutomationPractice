package PropertyFileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestPropertyFile {

	public static void main(String[] args) throws IOException  {
		
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Welcome\\eclipse-workspace\\accelerationjava\\src\\PropertyFile\\TestData.properties");
	

	
	
	Properties prop=new Properties();
	
         prop .load(fis);
         
         System.out.println(prop.getProperty("applicationUrl"));
         
         System.out.println(prop.getProperty("password"));
         
         System.out.println(prop.getProperty("expectedTitle"));
         
         System.out.println(prop.getProperty("username"));
         
       // to add value in test data  
         prop.setProperty("Test1", "Python");
         
         prop.setProperty("Test2", "JavaScript");
         
         prop.setProperty("Subject 1", "Automation");
         
         prop.setProperty("Subject 2", "Manual");
         
         
         
         FileOutputStream fos=new FileOutputStream("C:\\Users\\Welcome\\eclipse-workspace\\accelerationjava\\src\\PropertyFile\\TestData.properties");
	
         prop.store(fos, "added two new key again");
         
         fos.close();
         
         System.out.println("Property file successfully updated");
         
       //to convert string into integer 
         
         
         String pAmount=prop.getProperty("principleAmount");
         
         System.out.println(pAmount);
         
         int amount=Integer .parseInt(pAmount);
         
         int res=amount/10;
         
         System.out.println("Result : "+res);
         
         int roi=Integer.parseInt(prop.getProperty("roi"));
         
         System.out.println("ROI  :"+roi);
         
	
}
}