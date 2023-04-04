package ExceptionHandlingExample;

import java.util.Scanner;

public class ExceptionHandling4 {

	public static void main(String[] args) {

		System.out.println("Programs starts from here");

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter array size : ");

		int size = scn.nextInt();
                                                      //   int a[]={1,2,3,4,5}  5
		int[] empIds = new int[size];                           //    0  1 2 3 4

		try {

			System.out.println("********************You are inside try block ******************");

			System.out.println(empIds[3]);

			System.out.println("****************try block ends here**********************8");

		}

		catch (Throwable e) {

			System.out.println("##################catch block starts from here************");

			System.out.println("Exception object :" + e);

			System.out.println("Exception detail by PrintStackTrace");

			e.printStackTrace();

			System.out.println("With getMessage : " + e.getMessage());

			System.out.println("#####################catch block ends from here################");
		}

		System.out.println("Programs ends here");

	}

}
