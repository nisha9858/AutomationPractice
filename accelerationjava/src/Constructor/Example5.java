package Constructor;

public class Example5 {

	int roll;

	double salary;

	Example5(int r, double s) {

		roll = r;
		
		salary = s;
	}

	void display() {

		System.out.println(roll + "   " + salary);
	}

	public static void main(String[] args) {

		Example5 b = new Example5(101, 2500045.45);
		
		b.display();

		Example5 b2 = new Example5(201, 5500045.45);
		
		b2.display();

	}

}
