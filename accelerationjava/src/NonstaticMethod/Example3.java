package NonstaticMethod;

public class Example3 {

	void quetRemainder(int a, int b) {

		int q = a / b;

		int r = a % b;

		System.out.println("Number 1  :" + a);

		System.out.println("Number 2  :" + b);

		System.out.println("Quotient  is  :" + q);

		System.out.println("Remainder is  :" + r);
	}

	public static void main(String[] args) {

		Example3 s = new Example3();

		s.quetRemainder(6, 8);

		s.quetRemainder(8, 4);

	}

}
