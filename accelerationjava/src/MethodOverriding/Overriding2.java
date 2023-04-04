package MethodOverriding;

class Animal2 {

	public void move() {

		System.out.println("Animal can move");
	}

	void display() {

		System.out.println("I am display() of Animal2 class");
	}
}

class Dog2 extends Animal2 {
	@Override

	public void move() {

		System.out.println("Dogs can walk and run");

		display();          // virtual method call
	}

	public void calling() {

		move();           //virtual method call
		
		Animal2 a1 = new Animal2();

		a1.move();
		super.move();  // 

		System.out.println("I am calling");
	}

}

public class Overriding2 {

	public static void main(String[] args) {

		Dog2 b = new Dog2();

		b.calling();
       //   b.move();
       
	}

}
