package Methods;

public class Method2 {
	
	static void addTwoNumber(int num1,int num2) {
		
		int res=num1+ num2;
		
		System.out.println("Number 1 " +num1);
		
		System.out.println("Number 2 " +num2);
		
		System.out.println("result is " +res);
		
		
	}
	public static void main(String[] args) {
		
		addTwoNumber(20,45);
		
		//System.out.println(addTwoNumber(20,45));   //we cannot use method with return type as void inside println
	}

}
