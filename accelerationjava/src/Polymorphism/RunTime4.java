package Polymorphism;

class Bank {

	float getRateOfInterest() {

		return 0;
	}
}

class SBI extends Bank {

	float getRateOfInterest() {

		return 8.4f;
	}
}

class ICICI extends Bank {

	float getRateOfInterest() {

		return 7.3f;
	}
}

class AXIS extends Bank {

	float getRateOfInterest() {

		return 9.7f;
	}
}

public class RunTime4 {

	public static void main(String[] args) {

		Bank b = new SBI();

		System.out.println(" SBI rate of interest :  " + b.getRateOfInterest());

		b = new ICICI();

		System.out.println(" ICICI rate of interest :  " + b.getRateOfInterest());

		b = new AXIS();

		System.out.println(" AXISA rate of interest :  " + b.getRateOfInterest());

	}

}
