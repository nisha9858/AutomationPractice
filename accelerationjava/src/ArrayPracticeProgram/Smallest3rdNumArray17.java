package ArrayPracticeProgram;

import java.util.Arrays;

public class Smallest3rdNumArray17 {
	
	public static void main(String[] args) {
		
		int arr[]= {20,45,12,4,7,90,100};
			
			
			Arrays.sort(arr);
			
			for(int a:arr) {
				
				System.out.print(a+"  ");
				
				}
			System.out.println();
			

			
			System.out.println("3nd smallest number is : "+arr[3]);
		
	}

}
