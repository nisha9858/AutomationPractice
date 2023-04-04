package WrapperClassExample;

public class WrapperClass {
	
	public static void main(String[] args) {
		
		int a=20;
		
		// converting int into Integer
		
		Integer k=new Integer(a);   //explicitly boxing
		
		Integer l=new Integer(20);
		
		Integer j=a;   //implicit boxing
		
		System.out.println("a : "+a +"\nk :"+ k +"\nl : "+l+"\n j: "+j);
		
		System.out.println("***********************Unboxing of boxed object**********************");
		
		Integer a1=new Integer(25);
		
		int i1=a1.intValue();  //converting Integer into int explicitly
		
		System.out.println("a1 :"+a1+"\ni1 : "+i1);
		
		System.out.println("a1==i1  :"+(a1==i1));
		
		System.out.println("a1.equals(i1)  :"+a1.equals(i1));
		
		
		}

}
