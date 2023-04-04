package SystemClass;

class training {

	training() {

		System.out.println("Training class const............");
	}

	void manualTesting() {

		System.out.println("I am from manual Testing ");
	}

	void automationTesting() {

		System.out.println("I am from automation testing");
	}
}

public final class SystemDemo2 {



	static training t1 = new training();  /// static object creation

	public static void main(String[] args) {

		System.out.println("Program Starts");

		//static training t1 = new training();  ///
		
		SystemDemo2.t1.manualTesting();

		SystemDemo2.t1.automationTesting();

		training t2 = new training();

		t2.manualTesting();

		t2.automationTesting();

		System.out.println(" Program ends ");

		System.err.println("I am error,from SystemDemo2 class");

	}

}
