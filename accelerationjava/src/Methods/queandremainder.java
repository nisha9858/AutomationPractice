package Methods;

public class queandremainder {
	
	static void  queRemainder( double n1, double n2) {
		
		 double q=n1/n2;
		
		double r=n1%n2;
		
		System.out.println("Number 1 is    "+n1);
		System.out.println("Number 2 is    "+n2);
		
		System.out.println("Quotient is    "+q);
		System.out.println("Remainder is    "+r);
		
		

}
	public static void main(String[] args) {
		
		queRemainder(24,12);
		
		queandremainder.queRemainder(45, 15);
		
		//System.out.println(queRemainder(56,13));
		
		//double z=queandremainder.queRemainder(45, 15);
		
	}
}
