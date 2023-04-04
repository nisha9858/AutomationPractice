package ThisKeyword;

public class ThisKeyword2 {

	int age;

	void call() {
		System.out.println("I am call method");
	}

	void m(int age) {

		System.out.println("local age     " + age); // 5
		System.out.println("Glocal age     " + this.age); // 0
		this.call();

		System.out.println("This keyword is    " + this);
	}

	public static void main(String[] args) {

		ThisKeyword2 y = new ThisKeyword2();
		
		System.out.println("Object value is      " + y); //

		y.m(5);

	}

}
