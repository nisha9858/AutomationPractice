package TypeCasting;

class Parent100 {

	void myHome() {

		System.out.println("Parent home");
	}
}

class Child100 extends Parent100 {

	void myCar() {

		System.out.println("child car");
	}
}

public class Upcasting {

	public static void main(String[] args) {

		Child100 c2 = new Child100();

		c2.myHome();
		c2.myCar();

		Parent100 c1 = new Parent100();
		c1.myHome();

		System.out.println("*****************Using Upcasting ************************");

		Child100 c3 = new Child100();

		c3.myHome();
		c3.myCar();

		// Parent100 c4=c3;

		Parent100 c4 = new Child100();

		c4.myHome();

		Parent100 p2 = new Child100();    // implicit 

		Parent100 p3 = new Child100();   

		Parent100 p4 = (Parent100) c3;//explicit upcasting
             p4.myHome();
           
	}

}
