package MethodOverriding;

class Parent3 {

	final void show() {

		System.out.println("I am final method of parents ");
	}
}

class Child3 extends Parent3 {

	void show() {

		System.out.println("I am show method of child3 clASS");
	}
}

public class Overriding9 {

	public static void main(String[] args) {

	}

} /*
	 * METHODS CANNOT BE OVVERRIDE                                           
	 *  1.PRIVATE METHOD
	 *   2.STATIC METHOD
	 *    3.FINAL METHOD
	 *   4.CONSTRUCTOR
	 */
