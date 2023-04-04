package Operator;

public class logical3 {
	
	public static void main(String[] args) {
		
	int num1=-5, num2=0;
	
	System.out.println("bool  && bool2  :"+( (num1==num2) && (num1>num2)));    //f  f  f
	
	
	System.out.println("bool  || bool2  :"+( (num1==num2) || (num1>num2)));   //f   f  f
	
	  
	
	System.out.println("!(bool  && bool2)  :"+!( (num1==num2) && (num1>num2)));    // f f t
	
	
	

}
}