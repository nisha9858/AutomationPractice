package ExceptionHandlingExample;

public class ExceptionHandling17 {

	static void method() {

		System.out.println("Inside the method()");

		throw new ArithmeticException("throwing ArithmeticException");
	}

	public static void main(String[] args) {

		try {

		method();
		 }

		 catch (ArithmeticException e) {

		 System.out.println("caught in main() method");
		 }

		System.out.println("Rest of the code");

	}

}
