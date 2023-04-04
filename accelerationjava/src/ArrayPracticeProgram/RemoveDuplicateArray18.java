package ArrayPracticeProgram;

public class RemoveDuplicateArray18 {

	public static void main(String[] args) {

		int[] arr = { 4, 7, 9, 2, 17, 12, 9, 4, 17, 2, 23, 14 };

		for (int i = 0; i < arr.length; i++)

			System.out.print(arr[i] + "  ");

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					arr[i] = -1;
				}
			}
		}
		System.out.println();
		System.out.println("After Removing  Duplicate element in Array : ");

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != -1) {

				System.out.print(arr[i] + "  ");
			}

		}

	}

}
