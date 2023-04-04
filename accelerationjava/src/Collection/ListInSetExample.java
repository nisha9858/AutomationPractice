package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListInSetExample {
	
	public static void main(String[] args) {
		
	
	List<String> list=new ArrayList<String>();
	
	list.add("HArshada");
	
	list.add("Nisha");
	
	list.add("Omkar");
	
	list.add("HArshada");
	
	list.add("Sakshi");
	
	System.out.println("List element are :"+list);
	
	
	Set<String> set=new HashSet<String>(list);
	
	System.out.println("Set  element : "+set);

	

}
}
