package TotalProgram;

public class TotalRecall {

	static int age = 35;
	final double salary;

	int res;

	static {

		System.out.println(age);
		System.out.println(" TotalRecall for static block");
	}

	{
		// salary=1000; // final keyword
		// System.out.println(salary);
		System.out.println("TotalRecall  for nonstatic block");
	}

	static void display() {

		System.out.println(" I am static method display   ");
	}

	public void print() {

		System.out.println(" I am nonstatic method print");

	}

	public void print(int x, int y) { // method overloading
		res = x + y;
		System.out.println(" The value of x :     " + x);
		System.out.println(" The value of y :  " + y);
		System.out.println(" The value of res :  " + res);
	}

	TotalRecall() {

		this(45, 4567.5); // this() statement

		System.out.println("  zero parameter constructor");
	}

	TotalRecall(int age, double salary) { // constructor overloading

		this.salary = 8888.0;

		System.out.println(" age    " + age);
		System.out.println(" salary :  " + salary);
	}

	public static void main(String[] args) {

		System.out.println("  main() starts");

		// System.out.println(empId);

		TotalRecall n1 = new TotalRecall();

		TotalRecall n2 = new TotalRecall(40, 10000);

		display();

		n1.print();

		n2.print(30, 35000);

		System.out.println(" main() ends");

		System.out.println(n2.salary);

	}

}
