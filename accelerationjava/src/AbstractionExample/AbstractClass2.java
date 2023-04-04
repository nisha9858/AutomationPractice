package AbstractionExample;

abstract class Shape {

	abstract void draw();

}

class Rectangle extends Shape {

	protected void draw() {

		System.out.println("drawing rectangle");
	}
}

class Circle1 extends Shape {

	public void draw() {

		System.out.println("drawing circle");
	}
}

public class AbstractClass2 {

	public static void main(String[] args) {

		Shape s1 = new Circle1();
		s1.draw();

		Shape s2 = new Rectangle();

		s2.draw();

	}

}
