package pack2;

import pack1.Modifiers;

public class AccessModifiers extends Modifiers {

	public static void main(String[] args) {

		AccessModifiers m1 = new AccessModifiers();

		// System.out.println("private variables : " + m1.num1);

		// System.out.println("default variable : " + m1.num2);

		System.out.println("protected variable  :  " + m1.num3);

		System.out.println("public variable  :  " + m1.num4);         

		Modifiers m2 = new Modifiers(); // by using parent class we only access public modifier

		System.out.println("public variable   " + m2.num4);

		// System.out.println("Protected variable "+m2.num3);

	}

}
