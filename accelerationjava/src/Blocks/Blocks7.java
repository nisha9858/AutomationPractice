package Blocks;

public class Blocks7 {

	int age = 25;
	
	double salary = 15000.57;

	void print() {

		System.out.println("age:  " + age); // 25
		
		System.out.println("Salary:  " + salary); // 45000.2
	}

	public static void main(String[] args) {

		System.out.println("main() method ");

		Blocks7 b1 = new Blocks7();
		
		
		System.out.println("main ()ends ");

	}

	{
		  /// print();           15000.57
		salary = 45000.32;
		
		 print();               //45000.2
	}

}
