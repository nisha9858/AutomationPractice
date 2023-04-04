package TypeCasting;

class GrandParent {

	void myHome() {

		System.out.println("Home belongs to GrandParent");
	}
}

class Parent extends GrandParent {

	void show() {

		System.out.println("Parent show method is called");
	}

	void callme() {

		System.out.println("Parent cllme method is called");

	}
}

class Child extends Parent {

	void readme() {

		System.out.println("Child readme method is called");
	}
}

public class Upcasting1 {

	public static void main(String[] args) {

		System.out.println("************************* Ref and object both of child**************");

		Child c1 = new Child();

		c1.readme();
		c1.callme();
		c1.show();
		c1.myHome();

		System.out.println("*****************Ref  and Object both of Parent ******************** ");

		Parent p1 = new Parent();

		p1.show();

		p1.callme();

		p1.myHome();

		System.out.println("******************Ref and Object both of Grandparent*********************");

		GrandParent g1 = new GrandParent();

		g1.myHome();

		System.out.println("******************Ref and object child**************************************");

		Parent obj = new Child();

		obj.show();

		obj.callme();

		obj.myHome();

		System.out.println("********************Ref and object of child *****************************");

		GrandParent g11 = c1;

		g11.myHome();

	}

}
