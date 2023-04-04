package Inheritance;

class Grandfather {

	Grandfather() {

		System.out.println("I am Class Grandfather constructor..............");
	}

	void myHome() {

		System.out.println("  I am home of grandfather");
	}
}

class Father extends Grandfather {

	Father(double d) {

		super();
		System.out.println("  I am class Father constructor...............");
	}

	void myCar() {

		System.out.println(" I am car of father");
	}

}

class Child1 extends Father {

	Child1() {

		super(12.34);

		System.out.println(" I am child constructor......");

	}

	void myBike() {

		System.out.println("I am bile of child");
	}
}

public class Inheritance6 {

	public static void main(String[] args) {

		System.out.println("  ***************************************************************************");

		Child1 c1 = new Child1();
		c1.myHome();
		c1.myCar();
		c1.myBike();
		System.out.println("***********************************************************************************");

		Father f1 = c1;
		f1.myHome();

		f1.myCar();

		System.out.println("***********************************************************************************");

		Grandfather g1 = new Child1(); // Grandfather g2=new child(20) creating object of child and referred by its
										// parent class

		g1.myHome();

		System.out.println("  *************************************************************");

		System.out.println(" By reference varieble");

		Grandfather g4 = c1; // by using reference variable we are called only method
		g4.myHome();

		// g1.MyCar(); //car and bike not visible /accesible to grandfather grandfather
		// only give belongs to them
		// g1.bike();

		System.out.println(" ************************************************************************************");

		Grandfather g2 = new Father(12.36); // By using new keyword we call constructor and method both

		g2.myHome();
		// g2.myBike();
		// g2.MyCar();

		System.out.println("  Hello");
	}
} // by using reference variable we are called only method
