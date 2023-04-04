package PyramidExample;

public class Example6 {

	public static void main(String[] args) {

		int row = 6;

		for (int i = row; i > 0; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print("  ");
			}

			for (int j = i; j <= row; j++) {

				System.out.print("  * ");
			}

			System.out.println();

		}

	}

}
