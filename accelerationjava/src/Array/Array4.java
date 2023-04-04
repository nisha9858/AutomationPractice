package Array;

class Testarray2 {

	static void min(int arr[]) {

		// int arr[]= {33,13,4,50,15,1};

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (min > arr[i]) {

				min = arr[i];
			}
		}

		System.out.println("Min number in array is :  " + min);
	}

	static void max(int arr[]) {

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (max < arr[i]) {

				max = arr[i];
			}
		}
		System.out.println("Max number in array is : " + max);
	}
}

public class Array4 {
	
	public static void main(String[] args) {

		int arr[] = { 33, 13, 4, 50, 15, 1 };

		Testarray2.min(arr);

		Testarray2.max(arr);

	}

}
