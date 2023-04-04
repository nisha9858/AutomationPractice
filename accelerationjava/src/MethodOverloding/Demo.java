package MethodOverloding;

public class Demo {
	
	static double res;

	public static void square() {

		System.out.println("NO PARAMETER METHOD CALLED");
	}

	public static void square(int a) {

		res = a * a;

		System.out.println("METHOD WITH INTEGER ARGUMENT CALLED   :" + res);

	}

	public static void square(int n1, int n2) {

		res = n1 + n2;
		System.out.println("METHOD WITH TWO INTEGER ARGUMENT CALLED   :" + res);

	}

	public static void main(String[] args) {

		Demo.square();
		
		Demo.square(6);
		
		Demo.square(9, 34);

	}

}
