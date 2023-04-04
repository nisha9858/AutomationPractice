package ExceptionHandlingExample;

import java.util.Scanner;

public class Exceptionalhandling16_2 {
	
	public int divideNum(int m,int n)
	
	{
		
		int div =m/n;
		
		return div;
		
	}
	
	public static void main(String[] args) {
		
		
		Exceptionalhandling16_2 obj=new Exceptionalhandling16_2();
		
		Scanner scn=new Scanner (System.in);
		
		int num1, num2;
		
		System.out.println("Enter two numbers: ");
		
		num1=scn.nextInt();
		
		num2=scn.nextInt();
		
		try {
			
			System.out.println(obj.divideNum(num1,num2));
		}
		
		catch (ArithmeticException e) {
			
			System.out.println("\n Number cannot be divided by 0  "+e);
			
					}
		
		System.out.println("Rest of the code");
		
	}

}
