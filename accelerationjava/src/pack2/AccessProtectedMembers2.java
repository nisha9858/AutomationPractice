package pack2;

import pack1.ProtectedMembers;

//import pack1.*;

public class AccessProtectedMembers2 extends ProtectedMembers {

	public static void main(String[] args) {

		AccessProtectedMembers2 p1 = new AccessProtectedMembers2();

		System.out.println("Accessing Protected members from another class outside of package");

		System.out.println(p1.accNum);

		p1.displayAccNum();

	}
}

class TestProtectedMembers extends AccessProtectedMembers2 {

	public static void main(String[] args) {

		// AccessProtectedMembers2 p1 = new AccessProtectedMembers2()  ; // you will notbe allowed to create object of parent class

		// System.out.println(p1.accNum);   //

		// p1.displayAccNum();

		TestProtectedMembers t1 = new TestProtectedMembers();   //by creating object of child class  we are access  protectedMembers

		System.out.println(t1.accNum);

		t1.displayAccNum();

	}
}
