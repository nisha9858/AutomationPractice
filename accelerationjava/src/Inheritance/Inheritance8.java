package Inheritance;

class fruitsA {
	
	int fruitAge;

	fruitsA() {

		System.out.println(" fruitA class cons............");
		fruitAge = 7;
	}

	public void taste() {

		System.out.println(" FruitsA are sweet ....");

	}
}

class mango extends fruitsA {

	int fruitAge;

	mango() {

		
		System.out.println(super.fruitAge);
		
		
		System.out.println(" mango class cons....");

		fruitAge = 5;
	}
	
	public void taste() {

		System.out.println(" mango  are  tart sweet ........");

	}

	public void shape() {

		System.out.println(" Mango is round");

	}
}

public class Inheritance8 {
	public static void main(String[] args) {
		System.out.println("**************************************");

		mango m1 = new mango();
		
		m1.shape();
		m1.taste();
		
		System.out.println(m1.fruitAge);

		fruitsA f1 = new fruitsA();
		f1.taste();

		System.out.println(f1.fruitAge);

		System.out.println("*********************************************");

	}
}
