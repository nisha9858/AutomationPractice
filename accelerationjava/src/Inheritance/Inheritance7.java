package Inheritance;

class fruits {
	
	int fruitAge;

	fruits() {

		System.out.println(" fruit class cons............");
		fruitAge = 7;
	}

	public void taste() {

		System.out.println(" Fruits are sweet ....");

	}
}

class orange extends fruits {

	int fruitAge;

	orange() {

		System.out.println(" orange class cons....");

		fruitAge = 5;
	}

	public void taste() {

		System.out.println(" Oranges are sweet ........");

	}

	public void shape() {

		System.out.println(" Orange is round");
		System.out.println("  Orange fruitAge: " + fruitAge);
		System.out.println("  Orange fruitAge: " + super.fruitAge);
		taste();
		super.taste();

	}

}

public class Inheritance7 {
	public static void main(String[] args) {

		orange o1 = new orange();
		
		o1.shape();
		System.out.println("************************************************");

	}

}
