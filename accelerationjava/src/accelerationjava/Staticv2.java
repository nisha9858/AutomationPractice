package accelerationjava;

public class Staticv2 {
	
	static int empID=2002;
	static double salary;
	public static void main(String[] args) {
		
		int age=25;
		System.out.println("local variable  "+age);

		System.out.println("static variable empID "+Staticv2.empID);
		System.out.println("static variable salary "+Staticv2.salary);
		
		empID=3003;
		System.out.println("static variable empID "+empID);
		
		salary=50000.66;
		System.out.println("static variable salary "+salary);
		
		
		
	}

}
