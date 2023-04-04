package NonstaticMethod;

public class Example1 {

	void displayInfo(String name, String Prof, String location) {

		System.out.println("I AM  " + name);

		System.out.println("I AM  " + Prof);

		System.out.println("I AM  FROM  " + location);
	}

	public static void main(String[] args) {

		Example1 r = new Example1();

		r.displayInfo("Usha", " Yoga trainer", " Pune");

	}

	
		
		
	}

