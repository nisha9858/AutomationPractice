package InterfaceExample;

interface Animal12 {

	int age = 20;

	public void animalSound();

	public void sleep();
}

interface Reptile {

	public void color();

}

interface Reptile1 {

	public void color1();

}

class Pig12 implements Animal12 {

	public void animalSound() {

		System.out.println("The dog says : bhow bhow");
	}

	public void sleep() {

		System.out.println("ZZZZZZZZZ");
	}
}

class Dog12 extends Pig12 implements Reptile, Reptile1 {

	public void animalSound() {

		System.out.println("The dog says : bhow bhow");
	}

//	public void sleep() {

//		System.out.println("ZZZZZZZZZ");
//	}

	public void color() {

		System.out.println("color:   blue ");
	}

	public void color1() {

		System.out.println("color :  black");
	}
}

public class Interface7 {

	public static void main(String[] args) {

		Pig12 p1 = new Pig12();

		p1.animalSound();

		p1.sleep();

		Dog12 d1 = new Dog12();

		d1.animalSound();
		d1.sleep();
		d1.color();
		d1.color1();

	}

}
