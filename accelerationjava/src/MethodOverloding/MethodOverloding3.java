package MethodOverloding;

public class MethodOverloding3 {
	
	public  int myMethod(int num1,int num2) {
		
		System.out.println("First myMethod of class Demo");
		
		return num1+num2;
	}
       public  double myMethod(int var1,int var2) {        
		
		System.out.println("First myMethod of class Demo");
		
		return var1-var2;
	}
	
	
	//  1.  what if return type ,method name and argument lists are same.
       
       // Ans-  then it will throw error ,it can't be same.  
       
	//  2. Return type is different. Method name and argument are same.
       // Ans-  it also throw error it does not depend upon return type.
	
	
	
	
	
	
	

}
