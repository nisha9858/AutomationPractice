package MethodOverriding;

class Parent2 {

	private void m1() {             //no overriding here as its private method

		System.out.println(" From parent m1()");
	}

	protected void m2() {

		System.out.println("From parent m2()");
	}
}

class child2 extends Parent2 {

	private void m1() {    //private member are accessible within class only

		System.out.println("From Child from m1()");
	}

	public void m2() {

		m1();   //  virtual method call

		System.out.println("FRom child m2()");
	}
}

public class Overriding6 {

	public static void main(String[] args) {
		
	   Parent2 obj1 = new Parent2();

		obj1.m2();
         //  0bj1.m1();          private member can't be access from outside class
		
		
		Parent2 obj2 = new child2();
		obj2.m2();
		// obj2.m1();
	}

}
