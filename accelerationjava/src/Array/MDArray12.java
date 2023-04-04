package Array;

import java.util.Arrays;

public class MDArray12 {

	public static void main(String[] args) {

		char[] orgArray = { 'a', 'b', 'e', 'c', 'd' };

		// duplicate arrray

		char[] cloneArray = orgArray.clone();

		// sorting copyFrom in ascending order

		Arrays.sort(orgArray);

		System.out.println("After sorting original Array");

		for (char c : orgArray) {

			System.out.println(c + " ");
		}

		System.out.println("\nCloned array:");

		for (char c : cloneArray) {

			System.out.println(c + " ");
		}

		System.out.println("\n**************************************************");

		boolean result = Arrays.equals(cloneArray, orgArray);

		System.out.println(result);

	}

}
