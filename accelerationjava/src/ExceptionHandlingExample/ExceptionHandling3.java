package ExceptionHandlingExample;

import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String[] args) {

		System.out.println("Programs Strats from here ");

		int i, j, k;

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter first  num1:");

		i = scn.nextInt();

		System.out.println("Enter first num2 :");

		j = scn.nextInt();

		try {

			System.out.println("**** you are inside try block*******************");

			k = i / j;

			System.out.println("res : " + k);

			System.out.println("********************* no Exception found*****************");

		} catch (ArithmeticException obj) {
			
			System.out.println("*********you are in catch************8888");

			System.out.println("Exception handled :" + obj);

			obj.printStackTrace();

			System.out.println("*****************Exception handled***********************");

		}

		System.out.println("Programs ends here");

	}

}
