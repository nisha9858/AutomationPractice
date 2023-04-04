package Blocks;

public class Blocks9 {
	
	final static int age;
	
	final double salary ;
	
	Blocks9(){
		
		System.out.println("  I am Blocks9 class cons.....");
		
		}
	
	void print() {
		
		System.out.println("age:    "+ age);
		
		System.out.println("salary:    "+ salary);
	}
	
	public static void main(String[] args) {
		
		System.out.println("main() method");
		
		Blocks9 f1=new Blocks9();
		
	//	f1.print();
		
		System.out.println("main() ends");
		
		}
	
	{
		salary=45000.32;
		
		
	}
	static{
age=25;
} }
