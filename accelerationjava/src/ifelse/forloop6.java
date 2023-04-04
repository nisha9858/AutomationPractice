package ifelse;

public class forloop6 {   
	
	public static void main(String[] args) {
		
		for (int i=0 ; i<5; i++) 
		{      
			for(int j=0; j<=i;j++)
			{
				System.out.println("*");
			} 
			System.out.println();
		}
		for(int i=0;i<5;i++)
		{
			for(int j = 0; j<=i;j++)
			{   
				System.out.println(j   +"");
			} 
			System.out.println();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++) 
			{   
				System.out.println(i +"");
			}
			System.out.println();
		}
		
	}


}
