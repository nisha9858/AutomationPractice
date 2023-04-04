package ArrayPracticeProgram;

class Sample {

	static void max(int num1[])

	{

		int max = num1[0];

		for (int i = 1; i < num1.length; i++) {

			if (max < num1[i]) {

				max = num1[i];
			}
		}
		System.out.println("Max number in Array  is: " + max);

	}
}

public class LargestNumArray9 {

	public static void main(String[] args) {

		int[] num1 = { 23, 16, 7, 90, 50 };

		Sample.max(num1);

	}
}
