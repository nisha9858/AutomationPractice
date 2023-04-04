package ArrayPracticeProgram;

import java.util.Arrays;

public class AscSortArray13 {

	public static void main(String[] args) {

		char[] arr = { 'e', 'r', 't', 'h', 'm', 'x', 'b' };

		System.out.println("Sort Array in ascending Order");

		Arrays.sort(arr);

		for (char c : arr) {

			System.out.print(c + "  ");

		}
	}
}