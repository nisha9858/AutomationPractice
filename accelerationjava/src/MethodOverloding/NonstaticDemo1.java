package MethodOverloding;

public class NonstaticDemo1 {
	public void square() {

		System.out.println("NO PARAMETER METHOD CALLED");
	}

	public void square(int f) {

		int res = f * f;

		System.out.println("METHOD WITH INTEGER ARGUMENT CALLED   :" + res);
	}

	public void square(float a) {
		double res1 = a * a;

		System.out.println("METHOD WITH  TWO INTEGER ARGUMENT CALLED   :" + res1);
	}

	public static void main(String[] args) {

		NonstaticDemo1 b = new NonstaticDemo1();

		b.square();
		b.square(6.7f);
		b.square(6);

	}

}
