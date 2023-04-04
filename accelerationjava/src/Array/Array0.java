package Array;

public class Array0 {

	public static void main(String[] args) {

		// String[] cars;

		// cars =new String[4];

		// String [] cars =new String[4];

		String[] cars = { "Volvo", "BMW", "FORD", "Mazda" };

		System.out.println(cars[0]);

		cars[0] = "OPel";

		System.out.println(cars[0]);

		System.out.println(cars.length);

		System.out.println("********************Normal for loop***************************");

		for (int i = 0; i < cars.length; i++) {

			System.out.println(cars[i]);

			System.out.println("*************************** for each loop**********************");
		}

		for (String i : cars) {

			System.out.println(i);
		}
	}

}
