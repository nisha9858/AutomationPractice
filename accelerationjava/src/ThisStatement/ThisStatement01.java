package ThisStatement;

class A2 {

	A2() {
		this(5);
		System.out.println("hello a"); // hello a
	}

	A2(int x) {
		System.out.println(x); // 5
	}
}

public class ThisStatement01 {
	public static void main(String[] args) {

		A2 y = new A2();

	}

}
