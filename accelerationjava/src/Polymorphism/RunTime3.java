package Polymorphism;

class Car {

	int price = 25000;

	void run() {

		System.out.println("running");
	}
}

class innova extends Car {

	int price = 500000;

	void run123() {

		System.out.println("running fast at 120 km");
	}
}

public class RunTime3 {

	public static void main(String[] args) {

		Car c = new innova();

		c.run(); // method name different in classes so when we call method ,the method of
					// reference class is called

		System.out.println(c.price); // it will take parent class variable .variable cannot override

	}

}
