package ThisKeyword;

public class ThisKeyword8 {

	int variable = 51;

	void method(int variable) {
		System.out.println("Value of Local Variable :" + variable); // 20
		variable = 10;
		System.out.println("Value of Local Variable :" + variable); // 10
		System.out.println("Value of Local Variable :" + this.variable); // 51
		this.variable = variable;

		System.out.println("Value of Local Variable :" + variable); // 10
		System.out.println("Value of Local Variable :" + this.variable); // 10

	}

	void method() {
		int variable = 40;
		System.out.println("Value of Instance  Variable :" + this.variable); // 10
		System.out.println("Value of Local Variable :" + variable); // 40
		this.variable = variable;
		System.out.println("Value of Local Variable :" + variable);// 40
		System.out.println("Value of Local Variable :" + this.variable);// 40
	}

	public static void main(String[] args) {

		ThisKeyword8 obj = new ThisKeyword8();
		obj.method(20);

		obj.method();
		System.out.println("Value of Instance Variable :" + obj.variable); // 40

	}

}
