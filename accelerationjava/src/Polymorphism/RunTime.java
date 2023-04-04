package Polymorphism;

class Animal {

	void eat() {

		System.out.println("Animal eats");
	}
}

class herbivores extends Animal {

	void eat() {

		System.out.println("Herbivours eats plants");
	}
}

class omnivours extends Animal {

	void eat() {

		System.out.println("Omnivorous eat plant and meat");
	}
}

class carnivorous extends Animal {

	void eat() {

		System.out.println("Carnivorous eat meat");
	}
}

public class RunTime {

	public static void main(String[] args) {

		Animal a1 = new Animal();

		a1.eat();

		Animal h = new herbivores();
		h.eat();

		Animal o = new carnivorous();
		o.eat();

		Animal c = new omnivours();

		c.eat();

	} // when we have same name method in all class then object created class method
		// will called
}
