package TypeCasting;

class Member {

	long phone;

	void chat() {

		System.out.println("chatting in whatspp group with:  " + phone);
	}
}

class Admin extends Member {

	void addNumber() {

		System.out.println("adding a new user number in whatsaap  group");
	}
}

public class Upcasting3 {

	public static void main(String[] args) {

		Member mem = new Admin(); // implicit upcasting

		mem.phone = 985678;

		mem.chat();
		System.out.println("****************After downcasting***************************");

		Admin a1 = (Admin) mem; // explicit downcasting

		a1.addNumber();

		a1.chat();

		System.out.println(a1.phone);

		// Admin ad =new Member(); //direct downcasting, invalid or not possible

	}

}
