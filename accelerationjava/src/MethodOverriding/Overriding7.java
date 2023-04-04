package MethodOverriding;

class Parent5 {

	void show() {

		System.out.println("Parents show()");
	}
}

class child5 extends Parent5 {

	void show() {

		super.show();
		System.out.println("Child's show");
	}
}

class Grandchild extends child5 {

	void show() {

		super.show();
		System.out.println("GrandChild's show");
	}
}

public class Overriding7 {
	public static void main(String[] args) {

		Parent5 obj1 = new Grandchild();

		obj1.show();

	}

}
