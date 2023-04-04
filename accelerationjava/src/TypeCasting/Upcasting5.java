package TypeCasting;

class A {

	void test1() {

		System.out.println(" Running test1()");
	}
}

class B extends A {

	void test2() {

		System.out.println("Running test2()");
	}
}

class C extends B {

	void test3() {

		System.out.println("Running test3()");
	}
}

public class Upcasting5 {

	public static void main(String[] args) {

		C c1 = new C();

		B b1 = (B) c1;
		
	//	B b2= new C();
		
		// B b1=(B) new C()>>>>>>>>>>>>>>>explicit upcasting

		// B b1=new C(); //implicit upcasting

		b1.test1();
		b1.test2();
		
		C c2=(C)b1;
		
		c2.test3();
		c2.test2();
		c2.test1();

		// b1.test3();

		System.out.println("Program ends ");

	}

}
