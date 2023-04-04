package ThisKeyword;

public class ThisKeyword7 {

	int variable = 5;
	int age = 10;

	void method() {
		
		int variable = 40;
		System.out.println("Value of variable:   " + variable);
	}

	void method(int variable) {
		
		System.out.println("Value of variable:   " + variable);
		System.out.println(" GV Value of variable:   " + this.variable);
		this.variable = variable;
		System.out.println(" updated Value of variable:   " + variable);
		System.out.println("Updated GV Value of variable:   " + this.variable);

	}

	public static void main(String[] args) {

		ThisKeyword7 obj = new ThisKeyword7();
		obj.method(20);

		obj.method();
		System.out.println("obj GV variable :" + obj.variable); //20
		System.out.println("obj2 GV variable :" + obj.age);

		ThisKeyword7 obj2 = new ThisKeyword7();
		System.out.println("obj2 GV variable :" + obj2.variable);
		System.out.println("obj2 GV variable :" + obj2.age);       //10

	}

}
