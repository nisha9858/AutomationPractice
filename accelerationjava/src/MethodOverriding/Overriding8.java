package MethodOverriding;

class Parent4 {

	static void m1() {

		System.out.println("From Parent" + "static m1()");
	}

	void m2() {

		System.out.println("From Parent" + "non static m1()");
	}
}

class Child4 extends Parent4 {

	static void m1() {

		System.out.println("From Child4" + "static m1()");
	}

	public void m2() {

		System.out.println("From Child4" + "non static m1()");
	}
}

public class Overriding8 {
	public static void main(String[] args) {

		Parent4 obj1 = new Child4();
		
		obj1.m1(); // static method cannot override so it will take parent class method

		obj1.m2();

	}
}
