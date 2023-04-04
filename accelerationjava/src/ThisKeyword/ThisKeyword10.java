package ThisKeyword;

public class ThisKeyword10 {

	ThisKeyword10() {

		System.out.println(" I am zero");

	}

	ThisKeyword10(int h) {
               
		System.out.println(" I am int parameter");

	}

	ThisKeyword10(char b) {
                 this(23);
		System.out.println(" I am char parameter");

	}

	int a = 40;

	void print() {

		System.out.println("I am print");
	}

	void draw(int a) {

		System.out.println("local variable  " + a);

		System.out.println("global variable  " + this.a);
	}

	public static void main(String[] args) {

		ThisKeyword10 d1 = new ThisKeyword10();

		d1.print();

		d1.draw(10);
		
		ThisKeyword10 d2= new ThisKeyword10(23);
		
		ThisKeyword10 d3 = new ThisKeyword10('A');
		
		
		
		

	}

}
