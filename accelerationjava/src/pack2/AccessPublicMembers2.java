package pack2;

import pack1.publicMembers;

public class AccessPublicMembers2 {

	public static void main(String[] args) {

		publicMembers p4 = new publicMembers();

		System.out.println("Accessing Public members from another class outside of package");

		System.out.println(p4.accNum);

		p4.displayAccNum();
	}

}

class Demo {

	public static void main(String[] args) {

		publicMembers p1 = new publicMembers();

		System.out.println("Accessing Public members from another class outside of package");

		System.out.println(p1.accNum);

		p1.displayAccNum();

	}

}
