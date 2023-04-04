package InterfaceExample;

interface Printable2 {

	void print();

}

interface Showable2 extends Printable2 {

	void show();

}

public class Interface5 implements Showable2 {

	public void print() {

		System.out.println("Hello");
	}

	public void show() {

		System.out.println("Welcome");
	}

public static void main(String[] args) {
	
	Interface5 obj=new Interface5();
	
	obj.print();
	obj.show();
	
    Showable2  obj1=new Interface5();
	
	obj1.print();
	obj1.show();
	
	 Printable2 obj2=new Interface5();
	
	obj2.print();

}
}