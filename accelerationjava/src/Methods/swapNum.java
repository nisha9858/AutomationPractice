package Methods;

public class swapNum {

	static void swapTwoNum(int a, int b) {
		

		System.out.println("The Value of a is" + a);
		System.out.println("The Value of a is" + b);

		a = a + b; // 18 10 28

		b = a - b; // 28 10 18

		a = a - b; // 28 18 10

		System.out.println("The Swap Value of a is" + a);
		
		System.out.println("The Swap Value of b is" + b);

	}

	public static void main(String[] args) {

		swapTwoNum(18, 10);

		// System.out.println(swapTwoNum(33,23));

		// int y=swapNum.swapTwoNum(67, 56);

	}

}
