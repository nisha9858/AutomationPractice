package Constructor;

public class Example4 {

	Example4() {

		System.out.println("This is a zero para constructor");
	}

	public Example4(char c) {

		System.out.println("This is a single para constructor");
	}

	Example4(int num1, int num2) {

		System.out.println("This is int int parameterized constructor");
	}

	Example4(double num1, int num2) {

		System.out.println("This is double int parameterized constructor");
	}

	Example4(int num1, double num2) {

		System.out.println("This is int double parameterized constructor");
	}

	public static void main(String[] args) {

		Example4 j = new Example4();    

		Example4 j1 = new Example4();

		Example4 j2 = new Example4(19, 20);

		Example4 j3 = new Example4(56.7, 89);

		Example4 j4 = new Example4(34, 78.9);

	}

}
