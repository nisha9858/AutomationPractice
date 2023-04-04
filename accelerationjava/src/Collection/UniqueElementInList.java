package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueElementInList {

	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(1);
		
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(2);
		
		list.add(6);
		
		System.out.println("Original ArrayList : "+list);
		
		HashSet<Integer>  set =new HashSet<Integer>(list);
		
		System.out.println("Unique values in ArrayList :  "+set);
		
		
		
		
	}
}
