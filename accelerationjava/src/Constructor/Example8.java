package Constructor;

class B {
	int i = 10;

	B() {
		System.out.println("Running class B constructor ");
		
		System.out.println("value of i :"+ this.i);

		i = 23;
	}
}

public class Example8 {

	public static void main(String[] args) {

		B b1 = new B();
		
		System.out.println(" Class B global variable i=   " + b1.i); // 23

		System.out.println(" ################################################ ");

		B b2 = new B();

		System.out.println(" Class  global variable i=   " + b2.i); // 23
		
		
	

	}

}
