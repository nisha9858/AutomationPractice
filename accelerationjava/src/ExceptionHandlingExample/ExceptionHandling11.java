package ExceptionHandlingExample;

public class ExceptionHandling11 {

	public static void main(String[] args) {
		try {

			int a[] = new int[5];

			a[5] = 30 / 0;

		}

		catch (Exception e) {
			

			System.out.println("Parent Exception occurs " + e);
		} catch (ArithmeticException t) {

			System.out.println("Arithmatic Exception occurs " + t);

		}

		catch (ArrayIndexOutOfBoundsException t) {

			System.out.println(" Exception occurs " + t);

		}

	}
}
