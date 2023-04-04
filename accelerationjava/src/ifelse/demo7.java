package ifelse;

public class demo7 {
	
public static void main(String[] args) {
	
	int number=55;
	
	if(number%2==0) { 
		System.out.println("even number");
		}
	else {   
			System.out.println("odd number");}
	
	checkEvenOddNumber(56);  
	
	
}
	static void checkEvenOddNumber(int num) {
		
		if(num%2==0) {     
			
			System.out.println("Given number is even number :    "+num);
			
		}else {   
			System.out.println("Given number is odd number:     "+num);
		}
	
	
	} 
}



