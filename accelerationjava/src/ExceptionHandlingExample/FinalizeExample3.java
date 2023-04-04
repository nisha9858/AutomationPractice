package ExceptionHandlingExample;

public class FinalizeExample3 {
	
	public static void main(String[] args) {

		FinalizeExample3 g1=new FinalizeExample3();
		
		System.out.println("Object representation of GC: "+g1);
		
		System.out.println("Address of GC: "+g1.hashCode());
		
		g1=null;
		
		System.gc();
	}
	@Override
	protected void finalize() {
		System.out.println("Hi, I am finalize method..");
	}
}


