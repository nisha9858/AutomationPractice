package ArrayPracticeProgram;

public class SumOfArray12 {
	
	public static void main(String[] args) {
		
		int [] num= {5,7,78,45,11,-19,33,-20,34,18};
		
		double sum=0;
		
		for(int a:num) {
			
			sum=sum+a;
		}
		System.out.println("Sum of items in an Array :   "+sum);
	}

}
