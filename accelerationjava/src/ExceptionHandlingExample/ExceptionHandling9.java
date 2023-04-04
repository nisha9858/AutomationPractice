package ExceptionHandlingExample;

public class ExceptionHandling9 {
	
	public static void validateAge(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");  
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    //main method  
    public static void main(String args[]){ 
    	
    	
    	System.out.println("Main starts from here");
    	//Without handling exception
    	//validateAge(13);
        //handling exception, calling the function  
    	try {
    		validateAge(17);
    		System.out.println("Exception not found");
    		
    	}
    	catch(ArithmeticException e) {
    		
    		System.out.println("Exception handled...");
    		//System.out.println(e.getMessage());
    		System.out.println(e);
    	}
        System.out.println("rest of the code...");    
  }    
}


