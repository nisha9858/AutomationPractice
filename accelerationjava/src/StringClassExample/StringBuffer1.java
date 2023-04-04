package StringClassExample;

public class StringBuffer1 {
	
	public static void main(String[] args) {
		
		String str=new String("Abc");
		
		StringBuffer sb=new StringBuffer("Hello");
		
		System.out.println("Original StringBuffer value : "+sb);
		
		sb.append("Java");
		
	    System.out.println(sb);
	    
	    sb.insert(5, "Pune");
	    
	    System.out.println(sb);
	    
	    sb.replace(1, 3, "XXX");
	    
	    System.out.println(sb);
	    
	    sb.delete(1, 4);
	    
	    System.out.println(sb);
	    
	    StringBuffer s1=new StringBuffer("Bangalore is known for IT");
	    
	    s1.reverse();
	    
	    System.out.println(s1);
	    
	    System.out.println("***********************************************************8");
	    
	    StringBuffer s2= new StringBuffer();
	    
	    System.out.println(s2.capacity());  //default capacity=16
	    
	    s2.append("Hello");
	    
	     System.out.println("First word :"+s2);
	     
	     System.out.println(s2.capacity());
	     
	     s2.append("Java is my favourite language");
	     
	     
	     System.out.println("Second  word :"+s2); 
	     
	     System.out.println(s2.capacity());  // //(16*2)+2=34;
	     
		    
		    s2.append("I am from automated area");
		    
		     System.out.println("3 rd word :"+s2);
		     
		     System.out.println(s2.capacity());  // //(34*2)+2=70;
		     
		     
		     
	     
	     
	     
	    
	    
	    
	
	
		
	}

}
