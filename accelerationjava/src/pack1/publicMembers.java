package pack1;

public class publicMembers {

	public int accNum = 12345;

	public void displayAccNum() {

		System.out.println("Account Number :  " + accNum);
	}

	public static void main(String[] args) {

		publicMembers p1 = new publicMembers();

		System.out.println(p1.accNum);

		p1.displayAccNum();

	}

}

class AccessPublicMembers {

	public static void main(String[] args) {

		publicMembers p1 = new publicMembers();

		System.out.println("Accessing public members from child class");

		System.out.println(p1.accNum);

		p1.displayAccNum();

	}
}
