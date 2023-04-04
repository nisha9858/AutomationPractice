package TotalRecap;

class Operation {

	public void reverseNum(int num) {

		int rev = 0;
		int temp;

		System.out.println(" The Actual number  " + num);

		while (num != 0) {

			temp = num % 10;

			rev = rev * 10 + temp;
			num = num / 10;
		}
		System.out.println("Reverse number     " + rev);
	}

	public void palindromeNum(int num1) {

		int rev = 0, rem;
		int temp = num1;

		System.out.println("Check palindrome number   " + num1);
		while (num1 > 0) {

			rem = num1 % 10;

			rev = rev * 10 + rem;
			num1 = num1 / 10;
		}

		System.out.println("The palindrome number is   " + rev);

		if (temp == rev) {

			System.out.println("The number is palindrome");
		} else {

			System.out.println("The number is not palindrome");

		}

	}

	public void leapYear(int year) {

		if (year % 4 == 0) {

			System.out.println("The given year is leap year");

		} else {

			System.out.println("The given year is not leap year ");
		}
	}

}

class Demo extends Operation {

	public void reverseNum(int num) {

		System.out.println("reverseNum()  of class Demo");
	}

	public void palindromeNum(int num1) {

		super.palindromeNum(num1);

		System.out.println("palindrome() of class Demo");

	}

	public void leapYear(int year) {

		super.leapYear(year); // super keyword

		System.out.println("leapYear() of class Demo");
	}

	void show(int a, int b) {

		int res = a + b;

		System.out.println("The addition of two number is     " + res);
	}

	void show(int a, double b) { // method overloding

		double res1 = a * b;
		System.out.println(" The multiplication of two number    " + res1);

	}
}

public class TotalRecap1 {

	public static void main(String[] args) {

		Operation p1 = new Operation();

		p1.reverseNum(234);

		p1.palindromeNum(153);

		p1.leapYear(2017);

		System.out.println("****************************************8");

		Demo d1 = new Demo();

		d1.reverseNum(567);

		d1.palindromeNum(535);

		d1.leapYear(2022);

		d1.show(5, 6);

		d1.show(8, 4.5);
		System.out.println("******************************************************");
		Operation o1 = new Demo();

		o1.leapYear(2023);
		System.out.println("***************************************************");
		Operation e1 = d1;

		e1.reverseNum(8907);

	}
}
