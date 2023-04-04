package Inheritance;

class Company202 {

	void display() {

		System.out.println(" I am company class display()..........");
	}
}

class Employee202 extends Company202 {
        
	void display() {
		System.out.println(" I am employee class display().........."); 

	super.display();     // when method having same name then we call  parent class method in child class by using super keyword

	}

	void callme() {

		System.out.println(" I am employee class callme()..........");
	}
}

public class Inheritance9 {

	public static void main(String[] args) {

		Employee202 e1 = new Employee202();
		e1.display();
		e1.callme();
		System.out.println(" ***************************************..........");

		Company202 c1 = new Company202();
		c1.display();
		System.out.println(" ********************************************.........");

		Company202 e2 = new Employee202();
		e2.display();

	}
}
