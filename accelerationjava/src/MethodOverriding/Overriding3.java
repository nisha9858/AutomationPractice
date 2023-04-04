package MethodOverriding;

class Human {

	void eat() {

		System.out.println("Human is eating");
	}
}

class Boy extends Human {

	public void eat() {
		System.out.println("boy is eating");
	}
}

public class Overriding3 {

	public static void main(String[] args) {

		Boy obj = new Boy();

		obj.eat();          

		Human h1 = new Boy();   //human reference and object is boy

		h1.eat();

	}

}
