package Array;

public class Array3 {

	public static void main(String[] args) {

		int[] numbers = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };

		double sum = 0;
		
		double average;

		for (int number : numbers) {

			sum = sum + number;

			// sum+=number;

		}

		int arryLength = numbers.length;  

		average = sum / arryLength;

		System.out.println("sum = " + sum);

		System.out.println("Average  =" + average);
	}

}
