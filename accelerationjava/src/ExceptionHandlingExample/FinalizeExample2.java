package ExceptionHandlingExample;

public class FinalizeExample2 {

	public void finalize() throws Throwable {

		try {

			System.out.println("Inside finalize method");
		}

		catch (Throwable e) {

			throw e;
			
		} finally {

			System.out.println("Calling finalize method of the Object class ");

			super.finalize();

		}
	}

	public static void main(String[] args) throws Throwable {

		FinalizeExample2 f1 = new FinalizeExample2();

		f1.finalize();

		System.out.println("Programs Ends");

	}

}
