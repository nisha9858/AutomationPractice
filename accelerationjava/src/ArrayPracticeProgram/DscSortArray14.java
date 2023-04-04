package ArrayPracticeProgram;

import java.util.Arrays;
import java.util.Collections;

public class DscSortArray14 {
	
	public static void main(String[] args) {
		
		Integer []  num= {5,2,8,4,1,10};
		
		Arrays.sort(num,Collections.reverseOrder());
		
		for(int i:num) {
			
			System.out.print(i+"    ");
		}
		
		
		
	}

}
