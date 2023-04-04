package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingDescendingList {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(12);
		
		list.add(17);
		
		list.add(72);
		
		list.add(34);
		
		list.add(89);
		
		
		System.out.println("Original ArrayList : "+list);
		
		Collections.sort(list);
		
		System.out.println("After sorting Arrayalist :"+list);
		
		
		Collections.reverse(list);
		
		
		System.out.println("After reversing   ,in descending order : "+list);
		
		
		
	}

}
