package pack2;

public class AccessPublicMembers3 {

	public static void main(String[] args) {

		pack1.publicMembers p1 = new pack1.publicMembers();

		System.out.println("Accessing Public members from another class outside of package");

		System.out.println(p1.accNum);

		p1.displayAccNum();

		//  pack1.publicMembers p2 = new pack1.publicMembers();

	}

}
