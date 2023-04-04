package Inheritance;

class fourwheeler {

	                    // default constructor
	public void wheels() {

		System.out.println(" I have 4 wheels");
	}
}

class car extends fourwheeler {
	                            // default constructor with super()
	public void type() {

		System.out.println(" I am a car    ");
	}
}

class maruti extends car {

	public void company() {

		System.out.println("I am maruti");
	}

}

public class Inheritance5 {

	public static void main(String[] args) {

		maruti fr = new maruti();
		
		fr.company();

		fr.type();
		
		fr.wheels();

	}

}
