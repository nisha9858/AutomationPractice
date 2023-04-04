package Collection;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ListInQueueExample {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(22);
		
		list.add(17);
		
		list.add(72);
		
		list.add(34);
		
		list.add(89);
		
		 System.out.println("List in element :"+list);
		 
		 
		Queue<Integer> queue=new PriorityQueue<Integer>(list);
		
		System.out.println("List In Queue  : "+queue);

}
}
