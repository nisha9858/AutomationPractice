package ThisKeyword;

public class ThisKeyword6 {

	int age;                            // relation between object and this keyword   i.e this=object

	void call() {
		System.out.println("I am call Method");
	}

	void m(int age) {
		
		System.out.println("local age   " + age);
		System.out.println("Global age   " + this.age); 

		this.call();
		
		System.out.println("this keyword is:     " + this);

	}

	public static void main(String[] args) {

		ThisKeyword6 obj = new ThisKeyword6();
		
		System.out.println("object obj value  is:     " + obj);
		
		obj.m(25);
		

	}

}
