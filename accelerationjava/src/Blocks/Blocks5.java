package Blocks;

public class Blocks5 {

	static {

		System.out.println("***Running static block1 of class block5***");
	}

	{

		System.out.println("***Running nonstatic block1 of class block5***");
	}

	public static void main(String[] args) {

		System.out.println("main() method");

		Blocks5 g1 = new Blocks5();
		
		System.out.println("##############");

		Blocks5 f5 = new Blocks5();

		System.out.println("main () ends");

	}

}
