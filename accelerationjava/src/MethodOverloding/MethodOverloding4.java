package MethodOverloding;

public class MethodOverloding4 {

	public static void main(int i) {

		System.out.println(i);
	}

	public static void main(char r) {

		System.out.println(r);
	}

	public static void main(String[] args) {

		main(8);

		MethodOverloding4.main('D');

	}

}
