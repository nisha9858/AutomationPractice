package ExceptionHandlingExample;  

class UserDefinedException extends Exception {

	public UserDefinedException(String str) {

		super(str);

	}
}

public class Exceptionhandling15 {

	public static void validateAge(int age) throws UserDefinedException { 

		if (age < 18) {

			throw new UserDefinedException("Person is not eligible to vote ");

		}

		else {

			System.out.println("Person is eligible to vote !!");
		}
	}

	public static void main(String[] args)  {

		System.out.println("I m main of ExceptionHandling15");

		try {

			validateAge(13);
	}

		catch (UserDefinedException e) {  

		System.out.println(e);
	}

		System.out.println("Rest of the code");
	}

}
