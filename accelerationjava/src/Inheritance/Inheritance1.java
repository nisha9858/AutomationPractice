package Inheritance;

class testing10 {

	// default constructor

	void callingfromVoda() {

		System.out.println("Vodaphone network busy");
	}
}

class testing20 extends testing10 {
	
                             //  default constructor with super()

	void callingfromIdea() {
		System.out.println("Idea  network busy");

	}
}

class testing30 extends testing20 {
	
	                            //   default constructor with super()

	void callingfromAirtel() {

		System.out.println("Airtel network busy");
	}
}

public class Inheritance1 extends testing30 {
	
                           //  default constructor with super()

	void callingMe() {

		System.out.println("I am calling");
	}

	public static void main(String[] args) {

		Inheritance1 e1 = new Inheritance1();

		e1.callingMe();

		e1.callingfromIdea();

		e1.callingfromAirtel();

		e1.callingfromVoda();

	}

}
