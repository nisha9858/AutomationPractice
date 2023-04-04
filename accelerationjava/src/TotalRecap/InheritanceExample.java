package TotalRecap;

class Flower {
	
	int a=34;
	
	Flower(){
		
		System.out.println("Flower type cons");
	}

	void Smell() {

		System.out.println("good or bad smell");

	}

	void Color() {

		System.out.println("My colour");
	}
}

class Rose extends Flower {
	int a=24;
	
	
	Rose(){
		
		super();
		
		System.out.println("Rose type cons");
	}

	public void Type() {

		System.out.println("I am pleasant type");
		
		System.out.println(a);
		System.out.println(super.a);
		
		
	}
}

class Chameli extends Flower {

	public void Apperance() {

		System.out.println("White colour");
	}
}

class Champa extends Rose {

	public void Essence() {

		System.out.println("I have good essence");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {

		Flower f = new Flower();

		f.Smell();
		f.Color();

		Rose r = new Rose();

		r.Smell();
		r.Color();
		r.Type();

		System.out.println("*************************");

		Flower f1 = new Rose();

		f1.Smell();
		f1.Color();
		// f1.type();

		System.out.println("******************************");

		Flower f2 = r;

		f2.Smell();
		f2.Color();
		// f2.type();
		System.out.println("******************************");
		Chameli c = new Chameli();

		c.Smell();
		c.Color();

		c.Apperance();

		System.out.println("****************************");

		Flower f3 = new Chameli();

		f3.Color();
		f3.Smell();

		System.out.println("********************************");

		Champa ch = new Champa();

		ch.Smell();
		ch.Color();
		ch.Type();
		ch.Essence();
System.out.println("****************************");
		Flower f4 = new Champa();

		f4.Smell();
		f4.Color();
System.out.println("************************8");
		Rose r2 = new Champa();

		r2.Color();
		r2.Smell();
		r2.Type();

	}

}
