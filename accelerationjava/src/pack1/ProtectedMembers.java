package pack1;

public class ProtectedMembers {

	protected int accNum = 12345;

	protected void displayAccNum() {

		System.out.println("Account number:   " + accNum);
	}

	public static void main(String[] args) {

		ProtectedMembers p1 = new ProtectedMembers();

		System.out.println(p1.accNum);

		p1.displayAccNum();

	}

	class AccessProtectedMembers {

		public static void main(String[] args) {

			ProtectedMembers p1 = new ProtectedMembers();

			System.out.println("Accessing protected members from child class");

			System.out.println(p1.accNum);

			p1.displayAccNum();

		}

	}

}
