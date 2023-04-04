package Polymorphism;

class Hillstation {

	void location() {

		System.out.println("Location is :");

	}

	void famousfor() {

		System.out.println("Famous for  :");
	}
}

class Manali extends Hillstation {

	void location() {

		System.out.println("Mnanali is in Himachal Pradesh");
	}

	void famousfor() {

		System.out.println("Famous for Hadimba Temple and sports adventures");
	}
}

class Mussorie extends Hillstation {

	void location() {

		System.out.println("Mussori is in Uttarakhand");
	}

	void famousfor() {

		System.out.println("Famous for educational institution");
	}

}

class Gulmarg extends Hillstation {

	void location() {

		System.out.println("Gulmarg is in j&K");
	}

	void famousfor() {

		System.out.println("Famous for skiing");
	}
}

public class Runtime1 {

	public static void main(String[] args) {

		Hillstation A = new Hillstation();

		A.location();
		A.famousfor();

		Hillstation M = new Manali();

		M.location();
		M.famousfor();

		Hillstation Mu = new Mussorie();

		Mu.location();
		Mu.famousfor();

		Hillstation G = new Gulmarg();

		G.location();
		G.famousfor();

	}

}
