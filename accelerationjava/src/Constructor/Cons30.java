package Constructor;

public class Cons30 {

	int roll;

	double salary;

	Cons30() {

		System.out.println("Zero parameter cons is started");

		roll = 10;
		salary = 20;
		System.out.println("Zero parameter cons is Ends");

	}

	void dispaly() {

		System.out.println(roll + "    " + salary);
	}

	public static void main(String[] args) {

		Cons30 c1 = new Cons30();

		c1.dispaly();

		Cons30 c2 = new Cons30();
		c2.dispaly();

	}

}
