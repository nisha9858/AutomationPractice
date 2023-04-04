package Constructor;

class A {
	int i = 10;

	A() {
		System.out.println(" Constructor of class A ");
	}

	void display() {

		System.out.println("The display() of class A");
	}
}

class X {
	int j = 89;

	X() {
		System.out.println("Constructor of class X");
	}

	void display() {

		System.out.println("The Constructor of class X");
	}
}

public class Example6 {
	void display() {

		System.out.println();
	}

	public static void main(String[] args) {

		A a1 = new A();
		a1.display();
		System.out.println("Class A global variable i:    " + a1.i);

		X x1 = new X();
		
		x1.display();
		
		System.out.println("Class X global variable i:    " + x1.j);

		Example6 e1 = new Example6();
		
		e1.display();
		
		System.out.println("Class Example6 display() ");

	}

}
