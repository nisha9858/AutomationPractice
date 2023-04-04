package accelerationjava;

public class StaticGV1 {
	
	static int age=25,empID;
	
	public static void main(String[] args) {
		
		System.out.println(" Accessing static global variable age directly:  "+ age);
		
		System.out.println(" Accessing static global variable age by standard:  "+StaticGV1.age);
		
		System.out.println(" Accessing static global variable age directly:  "+ empID);
		
		System.out.println(" Accessing static global variable age directly:  "+ StaticGV1.empID);
		
	}
	
	

}
