package Constructor;

public class ConsOverloding {
	int age;
	double salary;

	ConsOverloding() {

		System.out.println("having no parameter");
	}

	ConsOverloding(int a) {
		System.out.println("having int parameter");
		age = a;

	}

	ConsOverloding(double b) {
		System.out.println("having double parameter");

		salary = b;
	}

	ConsOverloding(int a, double b) {

		System.out.println("having int double parameter");

		age = a;
		salary = b;

	}

	public static void main(String[] args) {

		ConsOverloding x = new ConsOverloding();

		System.out.println("After no parameter ,Age   " + x.age);
		System.out.println("After no parameter ,salary  " + x.salary);

		ConsOverloding y = new ConsOverloding(55);
		System.out.println("After no parameter ,Age   " + y.age);

		System.out.println("After no parameter ,salary   " + y.salary);

		ConsOverloding z = new ConsOverloding(3400.5);
		System.out.println("After no parameter ,Age   " + z.age);
		System.out.println("After no parameter ,salary  " + z.salary);

		ConsOverloding p = new ConsOverloding(18, 45.8);
		System.out.println("After no parameter ,Age   " + p.age);
		System.out.println("After no parameter ,salary  " + p.salary);

	}

}
