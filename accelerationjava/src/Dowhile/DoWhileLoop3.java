package Dowhile;

public class DoWhileLoop3 {
	
	public static void main(String[] args) {
		
		int n=1; int times = 0;
		do {
			
			System.out.println("Java do while loop:  "+n);
			
			n++;
		}
		
		while(n<=times);  //n=2
		
		System.out.println("*********************************");
		
		while(n<=times)  // n=2
		{
			
			System.out.println("java while loop: "+n);
			n++;
		}
		
		
	}

}
