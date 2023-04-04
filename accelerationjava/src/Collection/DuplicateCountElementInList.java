package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCountElementInList {
	
	public static void main(String[] args) {
		
		
		List <String> list=new ArrayList<String>();
		
		list.add("a");
		
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("a");
		list.add("b");
		list.add("a");
		list.add("c");
		list.add("a");
		
		
		Set<String> set=new HashSet<String>(list);
		
		set.retainAll(list);
		
		int totalduplicate=list.size()-set.size();
		
		System.out.println(totalduplicate);
		
		for (String temp :set ) {
			
			System.out.println(temp +"  :"+Collections.frequency(list,temp));
			
			
		}
		
		
		
		
	}
	
	

}
