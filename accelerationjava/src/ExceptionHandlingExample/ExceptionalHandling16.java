package ExceptionHandlingExample;

public class ExceptionalHandling16 {

	public static void main(String[] args) throws InterruptedException, UserDefinedException {

		System.out.println("Programs starts");

		setSleep(2000);

		checkNumber(-1);

		System.out.println("Hello geeks");

	}

	static void setSleep(long time) throws InterruptedException {

		Thread.sleep(time);
		
		

	}

	static void checkNumber(int num) throws UserDefinedException {
try {
		if (num < 0) 

			throw new UserDefinedException(" Number less dn zero");
		}
		

	catch(UserDefinedException e) {
		
		System.out.println("Exception handled");
	}
		
		

	}

}
