package ExceptionHandlingExample;

public class ExceptionHandling6 {
	
	public static void main(String[] args) {
		
		
		try {
			
			int a[]=new int[5];
			
			a[5]=30/0;
		}
		
        catch(Exception e) {
			
			System.out.println("task is completed");
		}
		
		catch(Throwable e) {
			
			System.out.println("common task completed ");
		}
		
		 
			
	
		
	}}
//unReachable code : a block of code which never executes by JVM
