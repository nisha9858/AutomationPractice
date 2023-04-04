package TotalRecap;

public class SwitchProgram2 {
	
	public static void main(String[] args) {
		
		int a=12;  int b=23,res;
		
		char op='-';
		
		switch(op) {
		
		case '%':
			res=a%b;
			System.out.println(res);
			
			break;
			
		case'-':
			
			res=a-b;
			System.out.println(res);
			
			break;
			
		case '*':
			res=a*b;
			
			System.out.println(res);
			
			break;
			
			default:
				
				System.out.println("Default value");
				break;
		}
		
	}

}
