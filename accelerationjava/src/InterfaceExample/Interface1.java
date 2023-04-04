package InterfaceExample;

interface i1 {

}

interface Drawable {

	int salary = 25000;

	void draw();
}

class Rectangle implements Drawable {

	public void draw() {

		System.out.println("drawing rectangle");
	}
}

class Circle implements Drawable {

	public void draw() {

		System.out.println("drawing circle");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		System.out.println(" Interface variable salary:  " + Drawable.salary);

		Rectangle r1 = new Rectangle();

		r1.draw();

		Circle c1 = new Circle();

		c1.draw();

		Drawable d = new Circle();

		d.draw();

	}

}
