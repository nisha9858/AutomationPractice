package accelerationjava;

public class Nonstatic1 {
	
	int empID=1001;
	
	double salary;
	public static void main(String[] args) {
		int age=25;
		
		System.out.println("Local variable age  "+age);
		
		Nonstatic1 n1=new Nonstatic1();
		
		System.out.println("NSG variable empID  "+n1.empID);
		
		System.out.println("NSG variable salary  "+n1.salary);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$  ");
		
		n1.empID=5001;
		n1.salary=45666.77;
		
		System.out.println("NSG variable empID  "+n1.empID);
		
		System.out.println("NSG variable salary  "+n1.salary);
		
		
		
		
	}

}
