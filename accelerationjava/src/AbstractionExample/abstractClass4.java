package AbstractionExample;

abstract class RBIBank102 {

	final abstract double getRateOfInterestForHomeLoan();
}

class SBI102 extends RBIBank {

	double getRateOfInterestForHomeLoan() {
		return 6.45;
	}
}

class abstractClass4 {
	public static void main(String args[]) {

	}
}

public class abstractClass4 {

} // we cannot override final method and final method cannot be abstract
