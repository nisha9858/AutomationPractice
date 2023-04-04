package ExceptionHandlingExample;

public class FinalizeExample {

	public static void main(String[] args) {
		
		
		// finalize -just before destroying any object ,garbage collector alwys calls finalize () to perform  clean up 

		FinalizeExample f1 = new FinalizeExample();

		System.out.println(f1.hashCode());

		f1 = null;

		Object objh;

		System.gc();  

		System.out.println("Programs ends");

	}

	public void finalize() {

		System.out.println("hi ,I am your finalize method");
	}

}
