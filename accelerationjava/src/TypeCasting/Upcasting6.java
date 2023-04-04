package TypeCasting;

class Pune {

	void deccan() {
		
		System.out.println("You are in Deccan");
	}
}

class Mumbai extends Pune {

	void Kurla() {

		System.out.println("You in city");
	}
}

public class Upcasting6 extends Mumbai {

	void myCity() {

		System.out.println("You in city");
	}

	public static void main(String[] args) {

		Upcasting6 u1 = new Upcasting6(); //

		Mumbai m1 = new Upcasting6(); //

		Mumbai m2 = u1; // implicit upcasting

		Pune p1 = new Upcasting6();

		p1.deccan();
	

		Pune p2 = u1; // implicit upcasting

		p2.deccan();

		Mumbai m3 = (Mumbai) new Upcasting6(); // explicit upcasting

		Mumbai m4 = (Mumbai) u1;

		Pune p3 = (Pune) new Upcasting6();

		Pune p4 = (Pune) u1;

		Pune p5 = new Mumbai();

		p5.deccan();

		Pune p6 = (Pune) new Mumbai();

	}

}
