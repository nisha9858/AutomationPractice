package ArrayPracticeProgram;

public class LargestArray3rd14 {
	
	public static void main(String[] args) {
		
		int temp;
		
		int [] array= {10,20,25,63,96,57};
		
		for(int i=0;i<array.length;i++)
		{
			
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]>array[j]) {
					
					
					temp=array[i];
					
					array[i]=array[j];
					
					array[j]=temp;
				}
			}
		}
		
		System.out.println("Third largest number is : "+array[array.length-3]);
	}

}
