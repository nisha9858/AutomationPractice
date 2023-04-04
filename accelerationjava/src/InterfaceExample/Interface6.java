package InterfaceExample;

interface Animal10 {

	int age = 20;

	public void animalSound();

	public void sleep();
}

class Pig7 implements Animal10 {

	public void animalSound() {

		System.out.println("The pig says : wee wee");
	}

	public void sleep() {

		System.out.println("ZZZZZZZZZ");
	}
}

public class Interface6 {

	public static void main(String[] args) {

		Pig7 mypig = new Pig7();

		mypig.animalSound();

		mypig.sleep();
		
		System.out.println(Animal10.age);

	}

}
