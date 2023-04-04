package Blocks;

public class Blocks4 {

	Blocks4() {

		System.out.println("Zero parameter");
	}

	{
		System.out.println("Running nonstatic block1 of class blocks4"); // non static block
	}

	public static void main(String[] args) {

		System.out.println("main() method");

		Blocks4 g1 = new Blocks4();
		
		System.out.println("##############");

	}

	{
		System.out.println("Running nonstatic block2 of class blocks4"); // non static block
	}

}
