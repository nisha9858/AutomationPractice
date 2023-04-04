package ArrayPracticeProgram;

import java.util.Arrays;

public class copyArray1 {

	public static void main(String[] args) {

		int[] orgArray = { 2, 6, 7, 9, 4 };

		System.out.println("Print original Array");

	for (int i : orgArray) {

			System.out.print(i + "  ");
		}
	System.out.println();

		int[] copyTo = Arrays.copyOf(orgArray, orgArray.length);

		System.out.println("Print copy array");

		for (int i = 0; i < orgArray.length; i++) {

			System.out.print(copyTo[i] + "  ");

		}

	}
}


