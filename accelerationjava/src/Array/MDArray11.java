package Array;

import java.util.Arrays;

public class MDArray11 {

	public static void main(String[] args) {

		int array[] = { 33, 3, 4, 5 };

		System.out.println("Printing original array");

		for (int i : array) {

			System.out.println(i + "  ");
		}

		System.out.println("\nPrinting clone of the array");

		int cloneArray[] = array.clone();

		for (int i : cloneArray) {

			System.out.println(i + " ");
		}

		System.out.println("\nPrinting are both equal arr and carr??");

		System.out.println("array and cloneArray  content validation : " + Arrays.equals(array, cloneArray));

		System.out.println("***********************************");

		int newCopiedArray[] = Arrays.copyOf(array, array.length);

		for (int i : newCopiedArray) {

			System.out.print(i + " ");
		}

			System.out.println("**************************************");

		

		int newCopiedRangeArray[] = Arrays.copyOfRange(array, 1, 2);

		for (int i : newCopiedRangeArray) {

			System.out.print(i + " ");

		}
		System.out.println(
				"\nComparing  newCopiedArray  & newCopiedArray: " + Arrays.equals(newCopiedArray, newCopiedRangeArray));

		System.out.println("*****************************************************************");

		Arrays.sort(array);

		System.out.println("After sorting original array");

		for (int i : array) {

			System.out.println(i + "   ");

		}

	}

}
