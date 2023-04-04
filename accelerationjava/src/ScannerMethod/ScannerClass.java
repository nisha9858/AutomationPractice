package ScannerMethod;

import java.util.Scanner;

public class ScannerClass {
	
	
    int addNumber1(char op,int num1,int num2)
		{
			if(op=='+') {
				return num1+num2;
				
			}
			
			else {
				
				return 0;
			}
		}
		

	public static void main(String[] args) {
		
		int age=10;
		
		double salary=2566.36;
		
		String name="Pune";
		
		Scanner  scn=new Scanner(System.in);   //object creation of scaaner class
		
		boolean valid;
		
		// initialization of variable using scanner class
		
		System.out.println("Enter age value from console");
		
		age=scn.nextInt();
		
		System.out.println("Enter salary value fro console");
		
		salary=scn.nextDouble();
		
		System.out.println("Enter name value from console");
		
		name=scn.next();
		
		System.out.println("Enter true/false value from console");
		
		valid=scn.nextBoolean();
		
		
		System.out.println("age  :"+age);
		
		System.out.println("salary: "+salary);
		
		System.out.println("name : "+name);
		
		System.out.println("valid : "+valid);
		
		
		ScannerClass sc=new ScannerClass();
		
		int num1,num2;
		
		System.out.println("Enter num1");
		
		num1=scn.nextInt();
		
        System.out.println("Enter num2");
		
		num2=scn.nextInt();
		
		char  op;
		
		System.out.println("Enter operator :");
		
		op=scn.next().charAt(0);
		
		System.out.println("Addition of two numbers :"+sc.addNumber1(op,num1,num2));
		
		
		System.out.println("Addition of two numbers :"+addNumber(op,num1,num2));
		
		System.out.println("****************************************************************");
	}
          static  int addNumber(char op,int num1,int num2)
		{
			if(op=='+') {
				return num1+num2;
				
			}
			
			else {
				
				return 0;
			}
		}
		
		
		
	}

	
