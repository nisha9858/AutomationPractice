package MethodOverloding;

public class Adder {

	public static int add(int a, int b) {

		return a + b;
	}

	static int add(int a, int b, int c) {

		return a + b + c;

	}

	public static void main(String[] args) {

		System.out.println(Adder.add(34, 12));

		System.out.println(Adder.add(45, 67, 90));

	}

}
