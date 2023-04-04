package SystemClass;

class Demo {

	void display() {

		System.out.println("Demo class display method");

	}

	void CallMe() {

		System.out.println("Demo class callme method");
	}

	Demo() {

		System.out.println("Demo class cons");
	}
}

public class StaticReference {

	static final Demo demoRef = new Demo();

	static int age = 30;

	static void calling() {

		System.out.println("Calling ...............");
	}

	void test() {

		System.out.println("StaticReference class test method");
	}

	public static void main(String[] args) {

		Demo d1 = new Demo();

		d1.display();
		d1.CallMe();

		StaticReference s1 = new StaticReference();

		s1.test();

		StaticReference.calling();
	
		System.out.println(StaticReference.age);

		StaticReference.demoRef.display();

		StaticReference.demoRef.CallMe();

		System.out.println("Hello");

		System.err.println("I am an error msg");
	}

}
