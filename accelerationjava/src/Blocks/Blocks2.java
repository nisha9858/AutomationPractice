package Blocks;

public class Blocks2 {

	static {

		System.out.println("***Running static block1 of class block1***");
	}

	public static void main(String[] args) {

		System.out.println("Main() starts     ");

		System.out.println("I am main() of block 1 class...");

		System.out.println("main() end");
	}

	static {

		System.out.println("***Running static block2 of class block2***");
	}
}
