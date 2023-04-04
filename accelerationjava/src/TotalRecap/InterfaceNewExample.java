package TotalRecap;


     interface A{
	int f=41;
	void draw();
	
	void print();
}
     interface B  extends A{
	int f=45;
	void show();
	
}
public class InterfaceNewExample implements A,B  {
	
	
	public void draw() {
		
		System.out.println("A is drawable");
	}
		
		public void  print() {
			
			System.out.println("A is printable");
		}
		
		public void show() {
			
			System.out.println("B is showable");
			
		//	System.out.println(super.f);
	}


public static void main(String[] args) {
	
	 InterfaceNewExample  i1=new  InterfaceNewExample ();
	 
	 i1.draw();
	 i1.print();
	 i1.show();
	 
	System.out.println(A.f);
	
	System.out.println(B.f);
	
	 System.out.println("******************************");
	 A a1=new  InterfaceNewExample ();
	 
	 a1.draw();
	 
	 a1.print();
	 
//	 a1.show();
	 System.out.println("  88888888888888");
	 B b1=new  InterfaceNewExample ();
	 
	 b1.draw();
	 b1.print();
	 b1.show();
	 
	 
	
}
	
}
