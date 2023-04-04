package ArrayPracticeProgram;

class Test {

	static void min(int num[]) {

		int min = num[0];

		for (int i = 1; i < num.length; i++) {

			if (min > num[i]) {

				min = num[i];

			}
		}
		System.out.println("Smallest number in Array :  " + min);
	}
}

public class SmallestNumArray10 {

	public static void main(String[] args) {

		int[] num = { 45, 12, 78, 89, 66 };

		Test.min(num);

	}

}
