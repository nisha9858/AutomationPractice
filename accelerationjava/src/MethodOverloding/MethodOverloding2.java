package MethodOverloding;

public class MethodOverloding2 {

	void disp(int a, double b) {
		System.out.println("METHOD A");
	}

	void disp(int a, double b, int c) {
		System.out.println("METHOD B");
	}

	void disp(int a, float b) {
		System.out.println("METHOD C");
	}

	public static void main(String[] args) {

		MethodOverloding2 b = new MethodOverloding2();

		b.disp(5, 8.0);

		b.disp(7, 7, 9);

		b.disp(99, 66.7f);

	}
}
