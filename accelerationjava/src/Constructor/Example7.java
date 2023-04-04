package Constructor;

class C {

	double i = 10.23;

	C(double j) {

		System.out.println("Running Class C constructor..... ");

		i = j;
	}

}

public class Example7 {

	public static void main(String[] args) {

		C b1 = new C(15.35);

		System.out.println(" Class C global variable i=   " + b1.i);

		System.out.println("****************");

		C b2 = new C(45.32);
		
		System.out.println(" Class C global variable i=   " + b2.i);

		System.out.println(" Main method Exit");

	}

}
