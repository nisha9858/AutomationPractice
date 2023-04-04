package Mock;

public class ReverseNum {

	public static void main(String[] args) {

		int rev = 0, temp;

		System.out.println("Actual number:" + 2345);

		for (int num = 2345; num > 0; num = num / 10) {

			temp = num % 10;

			rev = rev * 10 + temp;

		}
		System.out.println("Reverse numer:" + rev);

	}

}
