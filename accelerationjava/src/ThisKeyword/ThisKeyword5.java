package ThisKeyword;

class A {

	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n");
		this.m();
	}
}

public class ThisKeyword5 {

	void methodOne() {
		System.out.println("Inside Method ONe");

	}

	void methodTwo() {
		System.out.println("Inside Method Two");

		this.methodOne();
	}

	public static void main(String[] args) {

		ThisKeyword5 obj = new ThisKeyword5();
		obj.methodTwo();
		
		A a = new A();
		a.n();

	}

}
