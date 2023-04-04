package ArrayPracticeProgram;

public class DuplicateArray4 {

	public static void main(String[] args) {

		String arr[] = { "Mango", "Kiwi", "Banana", "Chiku", "Kiwi", "Apple", "Watermelon", "Mango", "Grapes",
				"Banana" };
//boolean flag=false;
		System.out.println("Duplicate elements in given array");

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					System.out.println(arr[i]);
					//flag=true;
				}

			//	else {

					//System.out.println("false");
				//}
			}

		}

	
//if (flag==false) {
	
	//System.out.println("duplicate element not found");
}

	}
	

