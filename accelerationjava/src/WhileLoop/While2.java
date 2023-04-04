package WhileLoop;

public class While2 {
	
	public static void main(String[] args) {
		
		int i=4;
		
		System.out.println("Printing numbers from 0 to 4");
		
		while(i>=0)
		{
			System.out.println("Hello   "+i);  
			//hello  4 to 0
			i--;
		}
		
		char c1='a'; 
		
		while(c1<='z')
		{
			System.out.print(c1);
			
			c1++;
		}
		System.out.println("reverse #########");
		
		char c2='z'; 
		
		while(c2>='a')
		{
			System.out.print(c2);
			
			c2--;
		}
		System.out.println();
		
		int num=1;
		
		while(num<=50){
			
			if(num%2==0) {
				
				System.out.println("even number is:    "+num);
				}
				num++;
			}
		}
		
	}


