package ExceptionHandlingExample;

public class ExceptionHandling12 {

	public static void main(String[] args) {

		try {

			int a[] = new int[5];

			a[5] = 30 / 0;
		}

		catch (Throwable e) {

			System.out.println("common task completed ");
		}

		catch (Exception e) {

			System.out.println("task is completed");
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("task 2 completed");
		}
		System.out.println("rest of the code");

	}

}
