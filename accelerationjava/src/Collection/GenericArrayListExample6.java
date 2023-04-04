package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericArrayListExample6 {
	
	public static void main(String[] args) {
		//Generic: with the help of generic we can force collection to store similar type of data
		List<Integer> l2=new ArrayList<Integer>();
		
		l2.add(12);
		
		l2.add(10);
		
		l2.add(2);
		
		l2.add(15);
		
		l2.add(18);
		
		System.out.println("Size: "+l2.size());
		
		System.out.println("Elements of collection: "+l2);
		
		Collections.sort(l2);
		
		System.out.println("After sorting Elements of collection: "+l2);//
		
		Collections.reverse(l2);
		
		System.out.println("Reversing sorted Elements of collection: "+l2);
		
		GenericArrayListExample6  a1=new GenericArrayListExample6 ();  
		
		a1.display();  
		
		List< GenericArrayListExample6 > l1=new ArrayList< GenericArrayListExample6 >();
		
		l1.add(new GenericArrayListExample6 ());
		
		System.out.println(l1);
		
		l1.add(a1);  
		System.out.println(l1);
		
		l1.get(0).display();  
		
		l1.get(1).display();  
		
	//	l1.get(2).display(); 
		
		
	}


void display () {
	
	System.out.println("Hi  i am display method");
}
}


