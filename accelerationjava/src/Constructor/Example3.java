package Constructor;

public class Example3 {

	int age;

	double salary;
	char c_var;

	Example3() {

	}

	public static void main(String[] args) {
		Example3 j = new Example3();

		System.out.println(j.age);      //0

		System.out.println(j.salary);   //0.0

		System.out.println(j.c_var);  //blank

	}
}
