
package ScannerMethod;

import java.util.Scanner;

public class ScannerClassExample1 {

	public static void main(String[] args) {

		String s = "Hello,This is BasicJava";
     //  int a=10;
		// create scanner object and pass string in it
		
		/**  
		 * 
		 * 
		 */

		Scanner scan = new Scanner(s);

		System.out.println("Boolean Result :" + scan.hasNext());  //cheks if scanner has another token in its input  gives value boolean

		// print the string

		System.out.println("String " + scan.nextLine());  //returns a line of text that is read from the scanner object

		scan.close();  //close  this scanner

		System.out.println("************************* Enter Your Details***********************");

		Scanner in = new Scanner(System.in);

		System.out.println("Enter your name :");

		String name = in.next();

		System.out.println("Name  :" + name);

		System.out.println("Enter your age :");

		int i = in.nextInt();

		System.out.println("Age :" + i);

		System.out.println("Enter your salary :");

		double d = in.nextDouble();

		System.out.println("Salary  :" + d);

	}

}
