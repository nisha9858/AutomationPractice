package Array;

class TestReturnArray {

	static int[] getArray() {
		
		
		int num[] = new int[3];

		num[0] = 10;
		num[1] = 24;
		num[2] = 15;

		return num; // return new int[]{10,13,15}
	}
}

public class Array5 {

	public static void main(String[] args) {

		int num[] = TestReturnArray.getArray(); //new int[]

		for (int i = 0; i < num.length; i++) {
			
			System.out.println(num[i]);
		}
		
	}

}
