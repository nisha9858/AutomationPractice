package Polymorphism;

public class CompileTime {

	static void sum(int a, int b) {

		int c = a + b;

		System.out.println("Addition of two number : " + c);
	}

	static void sum(int a, int b, int e) {

		int c = a + b + e;

		System.out.println("Addition of three number : " + c);
	}

	public static void main(String[] args) {

		CompileTime.sum(54, 88);

		CompileTime.sum(34, 56, 78);

	}

}
