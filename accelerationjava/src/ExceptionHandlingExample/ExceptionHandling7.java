package ExceptionHandlingExample;

public class ExceptionHandling7 {
	

		
		public static void main(String args[]) {
			
			try {
				System.out.println("Inside the try block");
				// below code throws divide by zero exception
				int data = 25 / 5;
				
				//System.exit(0);  //after this program terminateas
				
				System.out.println(data);
			}
			
			// cannot handle Arithmetic type exception
			// can only accept Null Pointer type exception
			catch (NullPointerException e) {
				System.out.println(e);
			}
			
			// executes regardless of exception occured or not
			finally {
				
				System.out.println("I am inside finally block");
				int k=10/0;
				System.out.println("finally block is always executed");
			}
			System.out.println("rest of the code...");
		}
	}

// finally blocks does not execute when 1.system.exit(0)    2.exception occur in finally block  3.thread dead

