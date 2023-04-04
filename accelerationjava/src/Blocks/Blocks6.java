package Blocks;

public class Blocks6 {

	static {

		System.out.println("***Running static block1 of class block6***");
	}

	{

		System.out.println("***Running nonstatic block1 of class block6***");
	}

	public static void main(String[] args) {

		System.out.println("main() method");

		Blocks6 g1 = new Blocks6();
		System.out.println("##############");

		Blocks6 f5 = new Blocks6();

		System.out.println("main () ends");

	}

	static {

		System.out.println("***Running static block2 of class block6***");
	}

	{

		System.out.println("***Running nonstatic block2 of class block6***");
	}

}
