package ExceptionHandlingExample;

public class ExceptionHandling18 {

	public static void main(String[] args) {

		System.out.println("Programs starts ");

		setSleep(3000);

		checkNumber(-1);

		System.out.println("Hello Geeks");

	}

	static void setSleep(long time) {

		try {

			Thread.sleep(time);
		}

		catch (InterruptedException e) {

			e.printStackTrace();

		}
	}

	static void checkNumber(int num) {

		if (num < 0) {

			try {

				throw new UserDefinedException("Number less dn zero");
			}

			catch (UserDefinedException e) {

				e.printStackTrace();
			}
		}

		else {

			System.out.println("Number is :" + num);
		}

	}
}
