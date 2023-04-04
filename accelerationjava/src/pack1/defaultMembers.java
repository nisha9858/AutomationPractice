package pack1;

public class defaultMembers {               //within package only accessible

	int accNum = 12345;

	void displayAccNum() {

		System.out.println("Account Number :  " + accNum);
	}

	public static void main(String[] args) {

		defaultMembers d1 = new defaultMembers();

		System.out.println("Account Number :  " + d1.accNum);

		d1.displayAccNum();

	}

}

class AccessdefaultMembers {

	public static void main(String[] args) {

		defaultMembers d2 = new defaultMembers();

		System.out.println("Accessing Default members from child class");

		System.out.println("Account Number :  " + d2.accNum);

		d2.displayAccNum();

	}
}
