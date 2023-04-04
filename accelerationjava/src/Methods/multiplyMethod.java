package Methods;

public class multiplyMethod {
	

	
	static int multiplyTwoNum(int n1,int n2) {
		
		System.out.println("Number 1 "+n1);
		
	    System.out.println("Number 2 "+n2);
	    
	    int res=n1*n2;
		System.out.println("Result is"+res);
		
		int finalvalue=res+100;
	   
	    return finalvalue;
		}
	public static void main(String[] args ) {
		
		multiplyTwoNum( 6,7);      //method will be executed but we don't be able to print its return value
		 
		System.out.println(multiplyTwoNum(5,9));  //method will executed and we will also able to print its return in console
		
		int res=multiplyMethod.multiplyTwoNum(5,6);    ///method body will executed and also return in stored in variable for future use
		

		
		
		
		
		
		 

	
		
		
	}

}
