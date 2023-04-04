package Operator;

public class logical2 {
	
	public static void main(String[] args) {
		
		int num1=30, num2=30;
		
		boolean bool1=(num1==num2);
		
		boolean bool2=(num1>num2);
		
		System.out.println("AND opertor   "+(bool1&&bool2));
		
		System.out.println("OR  opertor   "+(bool1||bool2));
		
		System.out.println("LOGICAL NOT opertor   "+!(bool1&&bool2));
		
		
		
		
		
	}

}
