package SwitchCase;

public class Switch4 {
	
	public static void main(String[] args) {
		
		int a=10;  int b = 5, res;
		
		char op='%'; 
		
		switch(op) {
		
		case '-':
			
			res=a-b;
			System.out.println("substraction is    "+res);
			break;
         case '+':
			
			res=a+b;
			System.out.println("addition is    "+res);
			break;
        
         case '%':
	
	      res=a%b;
	      System.out.println("modulus is    "+res);
	       break;
         
         case '/':
	
	     res=a/b;
	     System.out.println("division is    "+res);
	     break;
	     
         default:
 			
 	
 			System.out.println("unknown operation  ");
 			break;
		}
		
	}

}
