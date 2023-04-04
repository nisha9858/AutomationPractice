package accelerationjava;

public class GlobalV {
	
	static int empID=1005;
	
	double salary=45000;
	
	int pincode;
	public static void main(String[] args) {
		int age=34;
		
		System.out.println("Local Variable age "+age);
		
		System.out.println("SGV empID  "+empID);
		
		System.out.println("SGV empID  "+GlobalV.empID);
		
		GlobalV r=new GlobalV();      //object creation 
		
		System.out.println("NSGV salary" +r.salary);
		
		r.salary=65000.45;
		
		System.out.println("NSGV salary "+r.salary);
		
		empID=5007;
		
		System.out.println("SGV empID  "+empID);
		
		GlobalV x=new GlobalV();
		
		System.out.println("NSGV salary" +x.salary);
		
		
		
		
		
		
	}

}
