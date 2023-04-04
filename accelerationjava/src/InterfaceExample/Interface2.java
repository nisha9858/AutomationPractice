package InterfaceExample;

interface Bank {

	float rateofInterest();
}

class SBI1 implements Bank {

	public float rateofInterest() {
		return 9.15f;

	}
}

class PNB1 implements Bank {

	public float rateofInterest() {
		return 9.7f;

	}
}

public class Interface2 {

	public static void main(String[] args) {

		SBI1 s1 = new SBI1();

		System.out.println("SBI ROI :  " + s1.rateofInterest());

		PNB1 p1 = new PNB1();

		System.out.println("PNB ROI :  " + p1.rateofInterest());

		Bank b = new PNB1();

		System.out.println(" ROI :  " + b.rateofInterest());

	}

}
