package Blocks;

public class Blocks8 {

	static final int age;

	final double salary;

	static {

		age = 30;
		System.out.println(" I am SIB/IIB");
	}

	{
		salary = 45000.32;
		System.out.println("I am NSIB /IIB");
	}

	public static void main(String[] args) {

		System.out.println("main() method");    

		System.out.println("age   " + Blocks8.age);

		System.out.println("******************************");

		Blocks8 j1 = new Blocks8();

		System.out.println("salary :     " + j1.salary);

		System.out.println("main() method  ends");

	}

}
