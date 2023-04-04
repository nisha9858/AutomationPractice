package MethodOverriding;

class Animal6 {

	String color = "White of Red";
}

class Dog6 extends Animal6 {

	String color = "black";

	void printColor() {

		System.out.println("Dog6 color is  :" + color);

		System.out.println("Animal6 color is  :" + super.color);
	}
}

public class SuperKeyword3 {

	public static void main(String[] args) {

		Dog6 d = new Dog6();

		d.printColor();

	}

}
