package ThisKeyword;

public class ThisKeyword21 {

	int a, b;

	ThisKeyword21(int a, int b) {

		this.a = a;
		this.b = b;
	}

	void display() {
		System.out.println("a=  " + a + "b= " + b); // 10 20
	}

	public static void main(String[] args) {

		ThisKeyword21 x = new ThisKeyword21(10, 20); //
		
		x.display();
		
		System.out.println(x.a + "    " + x.b); // 10,20
		

		ThisKeyword21 x2 = new ThisKeyword21(102, 201);
		
		x2.display(); // 101 201
		
		System.out.println(x2.a + "   " + x2.b); // 102 201

	}

}
